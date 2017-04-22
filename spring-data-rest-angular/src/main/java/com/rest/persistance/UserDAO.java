package com.rest.persistance;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.model.UserEntity;

@Transactional
public interface UserDAO extends JpaRepository<UserEntity, Long> {

  /**
   * This method will find an User instance in the database by its email.
   * Note that this method is not implemented and its working code will be
   * automagically generated from its signature by Spring Data JPA.
   */
  public UserEntity findByEmail(String email);

}