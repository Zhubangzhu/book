package com.project.test;

import com.project.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author bangzhu
 * @create 2020-07-05-10:40 PM
 */
public class JdbcUtilsTest {

    @Test
    public void testJdbcUtils(){
        Connection connection = JdbcUtils.getConnection();
        System.out.println(connection);
        JdbcUtils.close(connection);
    }
}
