package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// <bean id="userService" class="com.itheima.service.impl.UserServiceImpl"> </bean>
@Service("userService")
public class UserServiceImpl implements UserService {
    //<property name="userDao" ref="userDao"></property>
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public void save() {
        userDao.save();
    }




}
