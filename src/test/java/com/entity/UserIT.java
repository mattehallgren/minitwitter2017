/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import com.entity.User;
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
public class UserIT {

    public UserIT() {
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
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        User instance = new User();
        instance.setPassword("asdf123");
        String result = instance.getPassword();
        assertEquals("asdf123", result);
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        User instance = new User();
        instance.setPassword("asdf123");
        String result = instance.getPassword();
        assertEquals("asdf123", result);
    }

    /**
     * Test of setUserName method, of class User.
     */
    @Test
    public void testSetUserName() {
        User instance = new User();
        instance.setUserName("asdf");
        String result = instance.getUserName();
        assertEquals("asdf", result);
    }

    /**
     * Test of getUserName method, of class User.
     */
    @Test
    public void testGetUserName() {
        User instance = new User();
        instance.setUserName("asdf");
        String result = instance.getUserName();
        assertEquals("asdf", result);
    }

    /**
     * Test of setId method, of class User.
     */
    @Test
    public void testSetId() {
        User instance = new User();
        instance.setId(1);
        int result = instance.getId();
        assertEquals(1, result);
    }

    /**
     * Test of getId method, of class User.
     */
    @Test
    public void testGetId() {
        User instance = new User();
        instance.setId(1);
        int result = instance.getId();
        assertEquals(1, result);
    }

}
