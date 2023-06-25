package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: SpringNew
 * @BelongsPackage: com.itheima.dao.impl
 * @Author: ASUS
 * @CreateTime: 2023-06-23  16:07
 * @Description: TODO
 * @Version: 1.0
 */
//<bean id="userDao" class="com.itheima.dao.impl.UserDaoImpl"></bean>
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("save running......");
    }
}
