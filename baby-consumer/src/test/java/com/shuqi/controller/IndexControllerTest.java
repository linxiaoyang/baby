package com.shuqi.controller;

import com.shuqi.BaseContext;
import com.shuqi.Result;
import com.shuqi.user.dto.UserDTO;
import org.junit.Test;

import javax.annotation.Resource;

public class IndexControllerTest extends BaseContext {

    @Resource
    private IndexController indexController;

    @Test
    public void testCreate(){
        Result<UserDTO> userDTOResult = indexController.queryByUserId(1L);
        System.out.println(userDTOResult);

    }
}
