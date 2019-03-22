/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.User;
import com.mapper.UserMapper;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author mattias
 */
public class UserDAOImpl implements UserDAO {

    private DataSource dataSource;
    private JdbcTemplate userJDBCTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.userJDBCTemplateObject = new JdbcTemplate(dataSource);
    }

    //Create new user
    public void create(String username, String password) {
        String SQL = "insert into sys.users (username, password) values (?, ?)";
        userJDBCTemplateObject.update(SQL, username, password);
        return;
    }

    //Get id of user by credentials
    public User getUserLoggedIn(String username, String password) {
        String SQL = "select * from sys.users where username = ? AND password = ?";
        User user = userJDBCTemplateObject.queryForObject(SQL, new Object[]{username, password}, new UserMapper());
        return user;
    }

    //Get user by id
    public User getUser(Integer id) {
        String SQL = "select * from sys.users where user_id = ?";
        User user = userJDBCTemplateObject.queryForObject(SQL,
                new Object[]{id}, new UserMapper());
        return user;
    }

    //List users
    public List<User> listUsers() {
        String SQL = "select * from sys.users";
        List<User> users = userJDBCTemplateObject.query(SQL, new UserMapper());
        return users;
    }

    //return a list of who the current user is following
    public List<User> listContacts(Integer userId) {
        String SQL = "SELECT followers.follow_id, users.username, users.user_id, users.password FROM sys.followers INNER JOIN sys.users ON sys.followers.follow_id = sys.users.user_id WHERE sys.followers.user_id = ?";
        List<User> users = userJDBCTemplateObject.query(SQL, new Object[]{userId}, new UserMapper());
        return users;
    }

    //delete user
    public void delete(Integer id) {
        String SQL = "delete from sys.users where user_id = ?";
        userJDBCTemplateObject.update(SQL, id);
        return;
    }

    //update user
    public void update(Integer id) {
        String SQL = "update sys.users set password = ? where user_id = ?";
        userJDBCTemplateObject.update(SQL, id);
        return;
    }

    //follow user
    public void follow(Integer userId, Integer id) {
        String SQL = "insert into sys.followers (user_id, follow_id) values (?, ?)";
        userJDBCTemplateObject.update(SQL, userId, id);
        return;
    }

    //unfollow user
    public void unfollow(Integer userId, Integer id) {
        String SQL = "delete from sys.followers where user_id = ? AND follow_id = ?";
        userJDBCTemplateObject.update(SQL, userId, id);
        return;
    }
}
