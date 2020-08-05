package com.project.service;

import com.project.pojo.User;

/**
 * @author bangzhu
 * @create 2020-07-06-10:08 PM
 */
public interface UserService {
    /**
     * 注册用户
     * @param user
     */
    public void registUser(User user);

    /**
     * @param user
     * @return 如果返回null说明登录失败，有值说明登录成功
     */
    public User login(User user);

    /**
     * 检查用户名是否可用
     * @param username
     * @return 返回true表示用户名已经存在，false表师用户名可用
     */
    public Boolean existsUsername(String username);


}
