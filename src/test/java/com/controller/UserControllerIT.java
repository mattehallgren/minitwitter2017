/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mattias
 */
@ContextConfiguration({"classpath*:applicationContextTest.xml"})
public class UserControllerIT {
    
    public UserControllerIT() {
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
     * Test of followUser method, of class UserController.
     */
    @Test
    public void testFollowUser() {
        System.out.println("followUser");
        int id = 0;
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        UserController instance = new UserController();
        ModelAndView expResult = null;
        ModelAndView result = instance.followUser(id, request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unfollowUser method, of class UserController.
     */
    @Test
    public void testUnfollowUser() {
        System.out.println("unfollowUser");
        int id = 0;
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        UserController instance = new UserController();
        ModelAndView expResult = null;
        ModelAndView result = instance.unfollowUser(id, request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPeople method, of class UserController.
     */
    @Test
    public void testFindPeople() {
        System.out.println("findPeople");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        UserController instance = new UserController();
        ModelAndView expResult = null;
        ModelAndView result = instance.findPeople(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of myContacts method, of class UserController.
     */
    @Test
    public void testMyContacts() {
        System.out.println("myContacts");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        UserController instance = new UserController();
        ModelAndView expResult = null;
        ModelAndView result = instance.myContacts(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
