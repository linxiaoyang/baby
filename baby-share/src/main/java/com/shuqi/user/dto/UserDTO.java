package com.shuqi.user.dto;

import lombok.Data;


@Data
public class UserDTO {
    /**
     * id
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;

}
