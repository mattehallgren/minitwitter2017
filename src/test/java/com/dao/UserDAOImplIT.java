/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.dao.UserDAOImpl;
import com.entity.User;
import java.util.List;
import javax.sql.DataSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author mattias
 */
@ContextConfiguration("/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDAOImplIT {

    @Autowired
    private UserDAO userDAO;

    public UserDAOImplIT() {
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
     * Test of setDataSource method, of class UserDAOImpl.
     */
    @Test
    public void testSetDataSource() {
        System.out.println("setDataSource");
        DataSource dataSource = null;
        UserDAOImpl instance = new UserDAOImpl();
        instance.setDataSource(dataSource);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class UserDAOImpl.
     */
    @Test
    public void testCreate() {
        UserDAOImpl instance = new UserDAOImpl();
        User user = new User();
        user.setUserName("asdfg");
        user.setPassword("asdfg123");
        instance.create(user.getUserName(), user.getPassword());
        List<User> users = instance.listUsers();
        Assert.assertEquals(1, users.size());
        Assert.assertEquals(user.getUserName(), users.get(0).getUserName());
    }

    /**
     * Test of getUserLoggedIn method, of class UserDAOImpl.
     */
    @Test
    public void testGetUserLoggedIn() {
        System.out.println("getUserLoggedIn");
        String username = "";
        String password = "";
        UserDAOImpl instance = new UserDAOImpl();
        User expResult = null;
        User result = instance.getUserLoggedIn(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class UserDAOImpl.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Integer id = null;
        UserDAOImpl instance = new UserDAOImpl();
        User expResult = null;
        User result = instance.getUser(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUsers method, of class UserDAOImpl.
     */
    @Test
    public void testListUsers() {
        System.out.println("listUsers");
        UserDAOImpl instance = new UserDAOImpl();
        List<User> expResult = null;
        List<User> result = instance.listUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listContacts method, of class UserDAOImpl.
     */
    @Test
    public void testListContacts() {
        System.out.println("listContacts");
        Integer userId = null;
        UserDAOImpl instance = new UserDAOImpl();
        List<User> expResult = null;
        List<User> result = instance.listContacts(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class UserDAOImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer id = null;
        UserDAOImpl instance = new UserDAOImpl();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UserDAOImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Integer id = null;
        UserDAOImpl instance = new UserDAOImpl();
        instance.update(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of follow method, of class UserDAOImpl.
     */
    @Test
    public void testFollow() {
        System.out.println("follow");
        Integer userId = null;
        Integer id = null;
        UserDAOImpl instance = new UserDAOImpl();
        instance.follow(userId, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unfollow method, of class UserDAOImpl.
     */                 
    @Test
    public void testUnfollow() {
        System.out.println("unfollow");
        Integer userId = null;
        Integer id = null;
        UserDAOImpl instance = new UserDAOImpl();
        instance.unfollow(userId, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
    