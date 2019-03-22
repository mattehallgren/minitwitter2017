/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.Tweet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mattias
 */
public class TweetControllerIT {
    
    public TweetControllerIT() {
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
     * Test of tweetPage method, of class TweetController.
     */
    @Test
    public void testTweetPage() {
        System.out.println("tweetPage");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        TweetController instance = new TweetController();
        ModelAndView expResult = null;
        ModelAndView result = instance.tweetPage(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendTweet method, of class TweetController.
     */
    @Test
    public void testSendTweet() {
        System.out.println("sendTweet");
        Tweet formdata = null;
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        TweetController instance = new TweetController();
        ModelAndView expResult = null;
        ModelAndView result = instance.sendTweet(formdata, request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
