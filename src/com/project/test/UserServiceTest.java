package com.project.test;

import com.project.pojo.User;
import com.project.service.UserService;
import com.project.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * @author bangzhu
 * @create 2020--06-10:16 PM
 */
public class UserServiceTest {

    UserService userService = new UserServiceImpl();
    @Test
    public void registerUser() {
        userService.registUser(new User(null, "bbj168",
                "666666", "bbj168@qq.com"));
        userService.registUser(new User(null, "abc168",
                "666666", "bbj168@qq.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null, "admin1", "123456", null)));
    }

    @Test
    public void existUsername() {
        if(userService.existsUsername("admin333")){
            System.out.println("用户名已存在");
        }else{
            System.out.println("用户名可用");
        }
    }
}