package com.shuqi.proxy;

import com.shuqi.BaseContext;
import com.shuqi.Result;
import com.shuqi.user.dto.UserDTO;
import org.junit.Test;

import javax.annotation.Resource;

public class UserServiceProxyTest extends BaseContext {

    @Resource
    private UserServiceProxy userServiceProxy;

    @Test
    public void test1(){
        Result<UserDTO> userDTOResult = userServiceProxy.queryById(3L);
        System.out.println(userDTOResult);
    }
}
