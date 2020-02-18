package com.shuqi.controller;

import com.shuqi.Result;
import com.shuqi.proxy.UserServiceProxy;
import com.shuqi.user.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shuqi on 20/02/18.
 * 控制器
 */
@Slf4j
@RestController
public class IndexController {

    @Resource
    private UserServiceProxy userServiceProxy;

    @PostMapping("register")
    public Result<Long> register(@RequestParam String name, @RequestParam Integer age) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(name);
        userDTO.setAge(age);
        return userServiceProxy.create(userDTO);
    }

    @GetMapping("queryByUserId")
    public Result<UserDTO> queryByUserId(@RequestParam Long id) {
        return userServiceProxy.queryById(id);
    }


}
