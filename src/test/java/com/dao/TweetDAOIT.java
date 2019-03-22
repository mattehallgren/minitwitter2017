/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

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
public class TweetDAOIT {
    
    public TweetDAOIT() {
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
     * Test of setDataSource method, of class TweetDAO.
     */
    @Test
    public void testSetDataSource() {
        System.out.println("setDataSource");
        DataSource ds = null;
        TweetDAO instance = new TweetDAOImpl();
        instance.setDataSource(ds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTweet method, of class TweetDAO.
     */
    @Test
    public void testCreateTweet() {
        System.out.println("createTweet");
        int id = 0;
        String tweet = "";
        String timestamp = "";
        TweetDAO instance = new TweetDAOImpl();
        instance.createTweet(id, tweet, timestamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listTweets method, of class TweetDAO.
     */
    @Test
    public void testListTweets() {
        System.out.println("listTweets");
        TweetDAO instance = new TweetDAOImpl();
        List<Tweet> expResult = null;
        List<Tweet> result = instance.listTweets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TweetDAOImpl implements TweetDAO {

        public void setDataSource(DataSource ds) {
        }

        public void createTweet(int id, String tweet, String timestamp) {
        }

        public List<Tweet> listTweets() {
            return null;
        }
    }
    
}
