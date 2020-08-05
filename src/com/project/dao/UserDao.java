package com.project.dao;

import com.project.pojo.User;

/**
 * @author bangzhu
 * @create 2020-07-05-11:27 PM
 */
public interface UserDao {




    /**
     * 根据用户名查询用户名信息
     * @param username
     * @return
     */
    public User queryUserByUsername(String username );

    /**
     * 保存用户信息
     * @param user
     * @return
     */
    public int saveUser(User user);

    /**
     * 根据用户名和密码查询用户
     * @param username
     * @param password
     * @return
     */
    public User queryUserByUsernameAndPassword(String username, String password);
}
