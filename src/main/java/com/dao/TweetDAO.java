/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.Tweet;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;

public interface TweetDAO {
   /** 
      * This is the method to be used to initialize
      * database resources ie. connection.
   */
   public void setDataSource(DataSource ds);
   /** 
      * This is the method to be used to create
      * a record in the Tweet table.
   */
   public void createTweet(int id, String tweet, String timestamp);
   /** 
      * This is the method to be used to list down
      * all the records from the Tweet table.
   */
   public List<Tweet> listTweets();
   /** 
      * This is the method to be used to delete
      * a record from the Tweet table corresponding
      * to a passed user id.
   */
}