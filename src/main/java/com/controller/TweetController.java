/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.LoginValidation;
import com.dao.TweetDAOImpl;
import com.entity.Following;
import com.entity.Tweet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class TweetController extends LoginValidation {

    //Get application context
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    //Create jdbcTemplate for relevant DAO
    TweetDAOImpl tweetJDBCTemplate
            = (TweetDAOImpl) context.getBean("tweetJDBCTemplate");

    @RequestMapping(value = "/tweets")
    public ModelAndView tweetPage(HttpServletRequest request, HttpServletResponse response) {
        //Check if user is logged in
        if (checkIfLoggedIn(request, response)) {
            //If user is currently logged in, get userId
            Object currentUser = request.getSession().getAttribute("userLoggedIn");
            //Get all tweets
            List<Tweet> listTweet = tweetJDBCTemplate.listTweets();
            //Get Ids of the people the current user is following
            List<Following> followingIds = tweetJDBCTemplate.getFollowing((int) currentUser);
            //list to put the tweets in
            List<Tweet> tweets = new ArrayList<Tweet>();
            for (Following followingId : followingIds) {
                for (Tweet tweet : listTweet) {
                    if (tweet.getUserId() == followingId.getFollowingId()) {
                        //If the userId who created the tweet matches the Id of the people the current user is following, add tweet to list
                        tweets.add(tweet);
                    }
                }
            }
            for (Tweet tweet : listTweet) {
                if (tweet.getUserId() == (int) currentUser) {
                    //If tweet is created by the current user, add tweet to list
                    tweets.add(tweet);
                }
            }
            //Sort the list of tweets by timestamp
            tweets.sort(Comparator.comparing(Tweet::getTimeStamp).reversed());
            ModelAndView modelView = new ModelAndView();
            //Add object that holds the size of tweets list & an object to hold the tweets
            modelView.addObject("size", tweets.size());
            modelView.addObject("listTweet", tweets);
            //Return tweets page
            modelView.setViewName("tweets");
            return modelView;
        } else {
            //If not logged in, return login page with an errorMessage
            return new ModelAndView("login", "errorMessage", "Please login first!!");
        }
    }

    @RequestMapping(value = "/sendTweet")
    public ModelAndView sendTweet(@ModelAttribute("tweetData") Tweet formdata, HttpServletRequest request, HttpServletResponse response) {
        //Check if user is logged in
        if (checkIfLoggedIn(request, response)) {
            //Create a timestamp
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timeStamp = sdf.format(new Date());
            //Get ID of the current user from session
            Object currentUser = request.getSession().getAttribute("userLoggedIn");
            //get tweet from form input formdata
            String newTweet = formdata.getTweet();
            //validate that the tweet is no longer than 160 characters, otherwise return errorpage with errormessage
            if (newTweet.length() > 160) {
                String errorMessage = "The tweet can only be up to 160 characters!";
                return new ModelAndView("errorpage", "errorMessage", errorMessage);

            }
            //Create tweet
            tweetJDBCTemplate.createTweet((int) currentUser, newTweet, timeStamp);
            String successMessage = "You have successfully tweeted!";
            //List the tweets in the same way as in tweetPage()
            List<Tweet> listTweet = tweetJDBCTemplate.listTweets();
            listTweet.size();
            List<Following> followingIds = tweetJDBCTemplate.getFollowing((int) currentUser);
            List<Tweet> tweets = new ArrayList<Tweet>();
            for (Following followingId : followingIds) {
                for (Tweet tweet : listTweet) {
                    if (tweet.getUserId() == followingId.getFollowingId()) {
                        tweets.add(tweet);
                    }
                }
            }
            for (Tweet tweet : listTweet) {
                if (tweet.getUserId() == (int) currentUser) {
                    tweets.add(tweet);
                }
            }
            //Sort the list of tweets by timestamp
            tweets.sort(Comparator.comparing(Tweet::getTimeStamp).reversed());
            ModelAndView modelView = new ModelAndView();
            //List tweets and view tweets page again after tweet has been created
            modelView.addObject("successMessage", successMessage);
            modelView.addObject("size", listTweet.size());
            modelView.addObject("listTweet", tweets);
            modelView.setViewName("tweets");
            return modelView;
        } else {
            //errormessage in case user is not logged in, return login page with login message
            return new ModelAndView("login", "errorMessage", "Please login first!!");
        }
    }
}
