package com.shuqi.manager;

import com.shuqi.dao.UserDao;
import com.shuqi.domain.UserDO;
import com.shuqi.user.dto.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserManager {

    @Resource
    private UserDao userDao;

    /**
     * 根据用户ID查询用户
     *
     * @param id
     * @return
     */
    public UserDTO queryById(Long id) {
        UserDTO userDTO = new UserDTO();
        UserDO userDO = userDao.queryById(id);
        BeanUtils.copyProperties(userDO, userDTO);
        return userDTO;
    }

    /**
     * 创建用户
     *
     * @param userDTO
     * @return 用户ID
     */
    public Long create(UserDTO userDTO) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userDTO, userDO);
        userDao.insert(userDO);
        return userDO.getId();
    }
}
