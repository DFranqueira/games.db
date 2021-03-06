package com.myownwork.games.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;

@Entity // This tells Hibernate to make a table out of this class
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
 
  private Integer id;
  private String name;
  private String email;
  private String username;
  private String password;
  private String status;
  private Date creationDate;
  private Date updateDate = null;
  
    
  //Getter and Setters
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
  
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
  
  public Date getCreationDate() {
	  return creationDate;
  }
  
  public void setCreationDate(Date creationDate) {
	  this.creationDate = creationDate;
  }
  
  public Date getUpdateDate() {
	  return updateDate;
  }
  
  public void setUpdateDate(Date updateDate) {
	  this.updateDate = updateDate;
  }
  
}