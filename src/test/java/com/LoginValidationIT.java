/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class LoginValidationIT {
    
    public LoginValidationIT() {
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
     * Test of checkIfLoggedIn method, of class LoginValidation.
     */
    @Test
    public void testCheckIfLoggedIn() {
        System.out.println("checkIfLoggedIn");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        LoginValidation instance = new LoginValidation();
        boolean expResult = false;
        boolean result = instance.checkIfLoggedIn(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
