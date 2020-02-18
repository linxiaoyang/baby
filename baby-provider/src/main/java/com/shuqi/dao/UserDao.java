package com.shuqi.dao;


import com.shuqi.domain.UserDO;

public interface UserDao {

    UserDO queryById(Long id);

    void insert(UserDO userDO);

}
