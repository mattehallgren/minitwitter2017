/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

/**
 *
 * @author mattias
 */
import com.entity.Tweet;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class TweetMapper implements RowMapper<Tweet> {

    public Tweet mapRow(ResultSet rs, int rowNum) throws SQLException {
        Tweet tweet = new Tweet();
        tweet.setId(rs.getInt("id"));
        tweet.setUserId(rs.getInt("user_id"));
        tweet.setTweet(rs.getString("tweet"));
        tweet.setTimeStamp(rs.getString("timestamp"));
        tweet.setUsername(rs.getString("username"));
        return tweet;
    }
}
