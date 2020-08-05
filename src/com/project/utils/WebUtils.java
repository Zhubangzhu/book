package com.project.utils;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author bangzhu
 * @create 2020-07-16-11:58 PM
 */

/**
 * 把Map 中的值注入到对应的JavaBean 属性中
 */
public class WebUtils {
    public static <T> T copyParamToBean(Map value, T bean){
        try {
            BeanUtils.populate(bean, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return bean;
    }

    /**
     * 字符串转换为int
     * @param strInt
     * @param defaultValue
     * @return
     */
    public static int parseInt(String strInt, int defaultValue){
        try {
            return Integer.parseInt(strInt);
        } catch (NumberFormatException e) {
           // e.printStackTrace();
        }
        return defaultValue;
    }
}
