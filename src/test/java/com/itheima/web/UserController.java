package com.itheima.web;

import com.itheima.config.SpringConfiguration;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: SpringNew
 * @BelongsPackage: com.itheima.web
 * @Author: ASUS
 * @CreateTime: 2023-06-23  16:15
 * @Description: TODO
 * @Version: 1.0
 */

public class UserController {
    public static void main(String[] args) {
        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService bean = app.getBean(UserService.class);
        bean.save();
    }
}
