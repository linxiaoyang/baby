package com.shuqi.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shuqi.Result;
import com.shuqi.proxy.UserServiceProxy;
import com.shuqi.user.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author shuqi on 20/02/18.
 * 控制器
 */
@Slf4j
@RestController
public class IndexController {

    @Resource
    private UserServiceProxy userServiceProxy;


    @Resource
    private RestTemplate restTemplate;

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


    @GetMapping("ribbonQueryByUserId")
    public Result<UserDTO> ribbonQueryByUserId(@RequestParam Long id) {
        ResponseEntity<Result> forEntity = restTemplate.getForEntity("http://baby-provider/user/queryById?id=" + id, Result.class, new HashMap<>());
        return forEntity.getBody();
    }

    @HystrixCommand
    @GetMapping("hystrixQueryByUserId")
    public Result<UserDTO> hystrixQueryByUserId(@RequestParam Long id) {
        return queryByUserId(id);
    }


}
