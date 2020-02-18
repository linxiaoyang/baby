package com.shuqi.controller;

import com.shuqi.Result;
import com.shuqi.manager.UserManager;
import com.shuqi.user.UserService;
import com.shuqi.user.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shuqi on 20/02/18.
 *
 * 用户的处理器
 */
@Slf4j
@RestController
public class UserController implements UserService {
    @Resource
    private UserManager userManager;

    @Override
    public Result<Long> create(UserDTO userDTO) {
        return Result.success(userManager.create(userDTO));
    }

    @Override
    public Result<UserDTO> queryById(Long id) {
        return Result.success(userManager.queryById(id));
    }
}
