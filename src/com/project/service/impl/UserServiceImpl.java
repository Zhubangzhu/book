package com.project.service.impl;

import com.project.dao.UserDao;
import com.project.dao.impl.UserDaoImpl;
import com.project.pojo.User;
import com.project.service.UserService;

/**
 * @author bangzhu
 * @create 2020-07-06-10:12 PM
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public Boolean existsUsername(String username) {
        if (userDao.queryUserByUsername(username) == null){
            return false;
        }
        return true;
    }
}
