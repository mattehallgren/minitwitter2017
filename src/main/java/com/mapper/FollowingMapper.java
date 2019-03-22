/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapper;

import com.entity.Following;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author mattias
 */
public class FollowingMapper implements RowMapper<Following> {

    public Following mapRow(ResultSet rs, int rowNum) throws SQLException {
        Following following = new Following();
        following.setId(rs.getInt("id"));
        following.setUserId(rs.getInt("user_id"));
        following.setFollowingId(rs.getInt("follow_id"));
        return following;
    }
}
