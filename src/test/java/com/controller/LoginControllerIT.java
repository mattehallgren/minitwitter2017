/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mattias
 */
public class LoginControllerIT {

    public LoginControllerIT() {
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
     * Test of loginUser method, of class LoginController.
     */
    @Test
    public void testLoginUser() {
        HttpServletRequest mockedRequest = Mockito.mock(HttpServletRequest.class);
        int userId = 1;
        LoginController instance = new LoginController();
        mockedRequest.getSession().setAttribute("userLoggedIn", userId);
        int sessionUserId = (int)mockedRequest.getSession().getAttribute("userLoggedIn");
        String expResult = "login";
        ModelAndView result = instance.loginPage();
        assertEquals(expResult, result.getViewName());
        assertEquals(userId, sessionUserId);
        assertNotNull(result.getModel());
    }

    /**
     * Test of loginPage method, of class LoginController.
     */
    @Test
    public void testLoginPage() {
        LoginController instance = new LoginController();
        String expResult = "login";
        ModelAndView result = instance.loginPage();
        assertEquals(expResult, result.getViewName());
        assertNotNull(result.getModel());
    }

    /**
     * Test of logout method, of class LoginController.
     */
    @Test
    public void testLogout() {
        LoginController instance = new LoginController();
        String expResult = "login";
        ModelAndView result = instance.loginPage();
        assertEquals(expResult, result.getViewName());
        assertNotNull(result.getModel());
    }

}
