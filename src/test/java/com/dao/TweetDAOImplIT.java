/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.Following;
import com.entity.Tweet;
import java.util.List;
import javax.sql.DataSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mattias
 */
public class TweetDAOImplIT {
    
    public TweetDAOImplIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setDataSource method, of class TweetDAOImpl.
     */
    @Test
    public void testSetDataSource() {
        System.out.println("setDataSource");
        DataSource dataSource = null;
        TweetDAOImpl instance = new TweetDAOImpl();
        instance.setDataSource(dataSource);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTweet method, of class TweetDAOImpl.
     */
    @Test
    public void testCreateTweet() {
        System.out.println("createTweet");
        int userId = 0;
        String tweet = "";
        String timestamp = "";
        TweetDAOImpl instance = new TweetDAOImpl();
        instance.createTweet(userId, tweet, timestamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listTweets method, of class TweetDAOImpl.
     */
    @Test
    public void testListTweets() {
        System.out.println("listTweets");
        TweetDAOImpl instance = new TweetDAOImpl();
        List<Tweet> expResult = null;
        List<Tweet> result = instance.listTweets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFollowing method, of class TweetDAOImpl.
     */
    @Test
    public void testGetFollowing() {
        System.out.println("getFollowing");
        int userId = 0;
        TweetDAOImpl instance = new TweetDAOImpl();
        List<Following> expResult = null;
        List<Following> result = instance.getFollowing(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
