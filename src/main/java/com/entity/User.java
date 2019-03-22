/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 
 *  * @author mattias
 */
public class User {
    
   private String password;
   private String username;
   private int id;

   public void setPassword(String password) {
      this.password = password;
   }
   public String getPassword() {
      return password;
   }
   public void setUserName(String username) {
      this.username = username;
   }
   public String getUserName() {
      return username;
   }
   public void setId(int id) {
      this.id = id;
   }
   public int getId() {
      return id;
   }
}
