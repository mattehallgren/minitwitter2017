/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.LoginValidation;
import com.dao.UserDAOImpl;
import com.entity.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mattias
 */
@Controller
public class UserController extends LoginValidation {

    //Get application context
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    //Create jdbcTemplate for relevant DAO
    UserDAOImpl userJDBCTemplate
            = (UserDAOImpl) context.getBean("userJDBCTemplate");

    @RequestMapping(value = "/followUser/{id}")
    public ModelAndView followUser(@PathVariable(value = "id") int id, HttpServletRequest request, HttpServletResponse response) {
        //check if user is logged in
        if (checkIfLoggedIn(request, response)) {
            //get userId from session
            Object currentUser = request.getSession().getAttribute("userLoggedIn");
            //use current user & the id of who to follow to create a new follower in db
            userJDBCTemplate.follow((int) currentUser, id);
            //List users and return findPeople page
            List<User> listUsers = userJDBCTemplate.listUsers();
            ModelAndView modelView = new ModelAndView();
            modelView.addObject("size", listUsers.size());
            modelView.addObject("listUsers", listUsers);
            modelView.setViewName("findPeople");
            return modelView;
        } else {
            //if user is not logged in, return login page with errormessage
            return new ModelAndView("login", "errorMessage", "Please login first!!");
        }
    }

    @RequestMapping(value = "/unFollowUser/{id}")
    public ModelAndView unfollowUser(@PathVariable(value = "id") int id, HttpServletRequest request, HttpServletResponse response) {
        //check if user is logged in
        if (checkIfLoggedIn(request, response)) {
            //get userId from session
            Object currentUser = request.getSession().getAttribute("userLoggedIn");
            //use current user & the id of who to unfollow to remove follower in db
            userJDBCTemplate.unfollow((int) currentUser, id);
            //List users and return myContacts page
            List<User> listUsers = userJDBCTemplate.listContacts((int) currentUser);
            ModelAndView modelView = new ModelAndView();
            modelView.addObject("size", listUsers.size());
            modelView.addObject("listUsers", listUsers);
            modelView.setViewName("myContacts");
            return modelView;
        } else {
            //if user is not logged in, return login page with errormessage
            return new ModelAndView("login", "errorMessage", "Please login first!!");
        }
    }

    @RequestMapping(value = "/findPeople")
    public ModelAndView findPeople(HttpServletRequest request, HttpServletResponse response) {
        //check if logged in
        if (checkIfLoggedIn(request, response)) {
            //List users for find people page and return page
            List<User> listUsers = userJDBCTemplate.listUsers();
            ModelAndView modelView = new ModelAndView();
            modelView.addObject("size", listUsers.size());
            modelView.addObject("listUsers", listUsers);
            modelView.setViewName("findPeople");
            return modelView;
        } else {
            //if user is not logged in, return login page with errormessage
            return new ModelAndView("login", "errorMessage", "Please login first!!");
        }
    }

    @RequestMapping(value = "/myContacts")
    public ModelAndView myContacts(HttpServletRequest request, HttpServletResponse response) {
        //Check if logged in, if logged in return a list of who the current user is following
        if (checkIfLoggedIn(request, response)) {
            Object currentUser = request.getSession().getAttribute("userLoggedIn");
            List<User> listUsers = userJDBCTemplate.listContacts((int) currentUser);
            ModelAndView modelView = new ModelAndView();
            modelView.addObject("size", listUsers.size());
            modelView.addObject("listUsers", listUsers);
            modelView.setViewName("myContacts");
            return modelView;
        } else {
            //if user is not logged in, return login page with errormessage
            return new ModelAndView("login", "errorMessage", "Please login first!!");
        }
    }
}
