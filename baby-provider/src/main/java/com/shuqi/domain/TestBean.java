package com.shuqi.domain;

import com.shuqi.dao.UserDao;
import com.shuqi.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

public class TestBean {

    @Resource
    private UserManager userManager;

    @Autowired
    private UserDao userDao;


    private ApplicationContext applicationContext;

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }


}
