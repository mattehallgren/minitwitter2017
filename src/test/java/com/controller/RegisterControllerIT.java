/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.User;
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
public class RegisterControllerIT {
    
    public RegisterControllerIT() {
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
     * Test of createUser method, of class RegisterController.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        User formdata = null;
        RegisterController instance = new RegisterController();
        instance.createUser(formdata);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerPage method, of class RegisterController.
     */
    @Test
    public void testRegisterPage() {
        System.out.println("registerPage");
        RegisterController instance = new RegisterController();
        ModelAndView expResult = null;
        ModelAndView result = instance.registerPage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
