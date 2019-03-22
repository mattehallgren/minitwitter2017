/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.User;
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
public class UserDAOIT {
    
    public UserDAOIT() {
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
     * Test of setDataSource method, of class UserDAO.
     */
    @Test
    public void testSetDataSource() {
        System.out.println("setDataSource");
        DataSource ds = null;
        UserDAO instance = new UserDAOImpl();
        instance.setDataSource(ds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class UserDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        String name = "";
        String password = "";
        UserDAO instance = new UserDAOImpl();
        instance.create(name, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class UserDAO.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Integer id = null;
        UserDAO instance = new UserDAOImpl();
        User expResult = null;
        User result = instance.getUser(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUsers method, of class UserDAO.
     */
    @Test
    public void testListUsers() {
        System.out.println("listUsers");
        UserDAO instance = new UserDAOImpl();
        List<User> expResult = null;
        List<User> result = instance.listUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class UserDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer id = null;
        UserDAO instance = new UserDAOImpl();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UserDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Integer id = null;
        UserDAO instance = new UserDAOImpl();
        instance.update(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UserDAOImpl implements UserDAO {

        public void setDataSource(DataSource ds) {
        }

        public void create(String name, String password) {
        }

        public User getUser(Integer id) {
            return null;
        }

        public List<User> listUsers() {
            return null;
        }

        public void delete(Integer id) {
        }

        public void update(Integer id) {
        }
    }
    
}
