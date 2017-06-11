package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController extends AbstractResourceController{

  @RequestMapping("/")
  @ResponseBody
  public String index() {
    return "on building process!";
  }  

}
