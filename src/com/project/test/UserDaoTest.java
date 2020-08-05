package com.project.test;

import com.project.dao.UserDao;
import com.project.dao.impl.UserDaoImpl;
import com.project.pojo.User;
import org.junit.Test;

/**
 * @author bangzhu
 * @create 2020--05-11:45 PM
 */
public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();
    @Test
    public void queryUserByUsername() {

        System.out.println(userDao.queryUserByUsername("admin"));
    }

    @Test
    public void saveUser() {
        System.out.println(userDao.saveUser(new User(null, "admin1",
                "123456", "wzg168@qq.com")));
    }

    @Test
    public void queryUserByUsernameAndPassword() {
    }
}