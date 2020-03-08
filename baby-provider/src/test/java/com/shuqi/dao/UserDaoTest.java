package com.shuqi.dao;

import com.shuqi.BaseContext;
import com.shuqi.domain.UserDO;
import org.junit.Test;

import javax.annotation.Resource;

public class UserDaoTest extends BaseContext {

    @Resource
    private UserDao userDao;

    @Test
    public void testQuery(){
        UserDO userDO = userDao.queryById(3L);
        System.out.println(userDO);

    }

}
