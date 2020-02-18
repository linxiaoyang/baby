package com.shuqi.user;

import com.shuqi.Result;
import com.shuqi.user.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

/**
 * 针对用户信息的操作接口
 */
@RequestMapping("user")
public interface UserService {

    /**
     * 创建用户
     * @param userDTO
     * @return
     */
    @PostMapping("create")
    Result<Long> create(@RequestBody UserDTO userDTO);


    /**
     * 根据用户ID查询用户
     * @param id
     * @return
     */
    @GetMapping("queryById")
    Result<UserDTO> queryById(@RequestParam("id") Long id);


}
