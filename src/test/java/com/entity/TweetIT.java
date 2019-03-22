/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import com.entity.Following;
import com.entity.Tweet;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class TweetIT {

    public TweetIT() {
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
     * Test of getTimeStamp method, of class Tweet.
     */
    @Test
    public void testGetTimeStamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStamp = sdf.format(new Date());
        Tweet instance = new Tweet();
        instance.setTimeStamp(timeStamp);
        String result = instance.getTimeStamp();
        assertEquals(timeStamp, result);
    }

    /**
     * Test of setTimeStamp method, of class Tweet.
     */
    @Test
    public void testSetTimeStamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStamp = sdf.format(new Date());
        Tweet instance = new Tweet();
        instance.setTimeStamp(timeStamp);
        String result = instance.getTimeStamp();
        assertEquals(timeStamp, result);
    }

    /**
     * Test of setUserId method, of class Tweet.
     */
    @Test
    public void testSetUserId() {
        Following instance = new Following();
        instance.setUserId(1);
        int result = instance.getUserId();
        assertEquals(1, result);
    }

    /**
     * Test of getUserId method, of class Tweet.
     */
    @Test
    public void testGetUserId() {
        Following instance = new Following();
        instance.setUserId(1);
        int result = instance.getUserId();
        assertEquals(1, result);
    }

    /**
     * Test of setTweet method, of class Tweet.
     */
    @Test
    public void testSetTweet() {
        String tweet = "tweeting";
        Tweet instance = new Tweet();
        instance.setTweet(tweet);
        String result = instance.getTweet();
        assertEquals(tweet, result);
    }

    /**
     * Test of getTweet method, of class Tweet.
     */
    @Test
    public void testGetTweet() {
        String tweet = "tweeting";
        Tweet instance = new Tweet();
        instance.setTweet(tweet);
        String result = instance.getTweet();
        assertEquals(tweet, result);
    }

    /**
     * Test of setId method, of class Tweet.
     */
    @Test
    public void testSetId() {
        Tweet instance = new Tweet();
        instance.setId(1);
        int result = instance.getId();
        assertEquals(1, result);
    }

    /**
     * Test of getId method, of class Tweet.
     */
    @Test
    public void testGetId() {
        Tweet instance = new Tweet();
        instance.setId(1);
        int result = instance.getId();
        assertEquals(1, result);
    }

    /**
     * Test of setUsername method, of class Tweet.
     */
    @Test
    public void testSetUsername() {
        Tweet instance = new Tweet();
        instance.setUsername("asdf");
        String result = instance.getUsername();
        assertEquals("asdf", result);
    }

    /**
     * Test of getUsername method, of class Tweet.
     */
    @Test
    public void testGetUsername() {
        Tweet instance = new Tweet();
        instance.setUsername("asdf");
        String result = instance.getUsername();
        assertEquals("asdf", result);
    }

}
