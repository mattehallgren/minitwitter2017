/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.UserDAOImpl;
import com.entity.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mattias
 */
@Controller
public class LoginController {

    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    UserDAOImpl userJDBCTemplate
            = (UserDAOImpl) context.getBean("userJDBCTemplate");

    @RequestMapping(value = "/loginUser")
    public ModelAndView loginUser(@ModelAttribute("userFormData") User formdata, HttpServletRequest request, HttpServletResponse response) {
        //Get credentials from formdata
        String username = formdata.getUserName();
        String password = formdata.getPassword();
        //Get userId by credentials
        User user = userJDBCTemplate.getUserLoggedIn(username, password);
        user.getId();
        //Set userLoggedIn as a session attribute
        request.getSession().setAttribute("userLoggedIn", user.getId());
        //return login page
        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("login");
        return modelView;
    }

    @RequestMapping(value = "/login")
    public ModelAndView loginPage() {
        //return login page
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
        //remove userLoggedIn attribute from session and return login page
        HttpSession session = request.getSession();
        session.removeAttribute("userLoggedIn");
        request.getSession().invalidate();
        return new ModelAndView("login");
    }

}
