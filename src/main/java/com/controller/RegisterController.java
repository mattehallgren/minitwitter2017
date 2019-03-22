/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.TweetDAOImpl;
import com.dao.UserDAOImpl;
import com.entity.Tweet;
import com.entity.User;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.text.StyleConstants.ModelAttribute;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mattias
 */
@Controller
public class RegisterController {

    //Get application context
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    //Create jdbcTemplate for relevant DAO
    UserDAOImpl userJDBCTemplate
            = (UserDAOImpl) context.getBean("userJDBCTemplate");

    @RequestMapping(value = "/create")
    public ModelAndView createUser(@ModelAttribute("userFormData") User formdata) {
        //Get credentials from formdata
        String username = formdata.getUserName();
        String password = formdata.getPassword();
        //Create user in DB using credentials
        userJDBCTemplate.create(username, password);
        //return register page
        return new ModelAndView("register");
    }

    @RequestMapping(value = "/register")
    public ModelAndView registerPage() {
        //return register page
        return new ModelAndView("register");
    }
}
