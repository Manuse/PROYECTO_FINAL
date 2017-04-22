package com.rest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.model.UserEntity;
import com.rest.persistance.UserDAO;

@Controller
public class UserController {


  @Autowired
  private UserDAO userDao;
  
//  @Autowired
//  private StudentRepository studentRpository;
  
  /**
   * GET /create  --> Create a new user and save it in the database.
   */
  @RequestMapping("/create")
  @ResponseBody
  public String create(String email, String name) {
    String userId = "";
    try {
      UserEntity user = new UserEntity(email, name);
      userDao.save(user);
      userId = String.valueOf(user.getId());
    }
    catch (Exception ex) {
      return "Error creating the user: " + ex.toString();
    }
    return "User succesfully created with id = " + userId;
  }
  
  /**
   * GET /delete  --> Delete the user having the passed id.
   */
  @RequestMapping("/delete")
  @ResponseBody
  public String delete(long id) {
    try {
      UserEntity user = new UserEntity(id);
      userDao.delete(user);
    }
    catch (Exception ex) {
      return "Error deleting the user:" + ex.toString();
    }
    return "User succesfully deleted!";
  }
  
  /**
   * GET /get-by-email  --> Return the id for the user having the passed
   * email.
   */
  @RequestMapping("/list")
  @ResponseBody
  public List<UserEntity> getByEmail() {
	  return userDao.findAll();
  }
  
//  @RequestMapping("/listStudent")
//  @ResponseBody
//  public StudentEntity getListStudent() {
//	  return studentRpository.findByStudentId(1);
//  }
  
  /**
   * GET /update  --> Update the email and the name for the user in the 
   * database having the passed id.
   */
  @RequestMapping("/update")
  @ResponseBody
  public String updateUser(long id, String email, String name) {
    try {
      UserEntity user = userDao.findOne(id);
      user.setEmail(email);
      user.setName(name);
      userDao.save(user);
    }
    catch (Exception ex) {
      return "Error updating the user: " + ex.toString();
    }
    return "User succesfully updated!";
  }
  
}