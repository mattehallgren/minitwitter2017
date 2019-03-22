/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.Following;
import com.entity.Tweet;
import com.entity.User;
import com.mapper.FollowingMapper;
import com.mapper.TweetMapper;
import com.mapper.UserMapper;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author mattias
 */
public class TweetDAOImpl implements TweetDAO {

    private DataSource dataSource;
    private JdbcTemplate tweetJDBCTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.tweetJDBCTemplateObject = new JdbcTemplate(dataSource);
    }
    //Create new tweet
    public void createTweet(int userId, String tweet, String timestamp) {
        String SQL = "insert into sys.tweets (user_id, tweet, timestamp) values (?, ?, ?)";
        tweetJDBCTemplateObject.update(SQL, userId, tweet, timestamp);
        return;
    }

    //List tweets & username of who created the tweet by timestamp in descending chronological order
    public List<Tweet> listTweets() {
        String SQL = "SELECT tweets.id, tweets.user_id, tweets.tweet, tweets.timestamp, users.username\n"
                + "FROM sys.tweets\n"
                + "INNER JOIN sys.users ON sys.tweets.user_id = sys.users.user_id ORDER BY tweets.timestamp DESC";
        List<Tweet> tweets = tweetJDBCTemplateObject.query(SQL, new TweetMapper());
        return tweets;
    }

    //return a list of who the current user is following
    public List<Following> getFollowing(int userId) {
        String SQL = "select * from sys.followers where user_id = ?";
        List<Following> followingIds = tweetJDBCTemplateObject.query(SQL, new Object[]{userId}, new FollowingMapper());
        return followingIds;
    }
}
