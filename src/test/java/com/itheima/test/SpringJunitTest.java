package com.itheima.test;

import com.itheima.config.SpringConfiguration;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @BelongsProject: SpringNew
 * @BelongsPackage: com.itheima.test
 * @Author: ASUS
 * @CreateTime: 2023-06-25  15:28
 * @Description: TODO
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
public class SpringJunitTest {

    @Autowired
    private UserService userService;
    @Autowired
    private DataSource dataSource;

    @Test
    public void test1(){
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        userService.save();
    }
}
