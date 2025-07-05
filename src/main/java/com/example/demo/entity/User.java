package com.example.demo.entity;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;

/**
 * 用户实体类（对应数据库表 user）
 */
@TableName("user") // 指定对应的数据库表名
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * @desc 用户ID 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * @desc 用户名
     */
    @TableField("username")
    private String username;

    /**
     * @desc 密码
     */
    @TableField("password")
    private String password;

    /**
     * @desc 年龄
     */
    @TableField("age")
    private Integer age;

    /**
     * @desc 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * @desc 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * @desc 更新时间
     */
    @TableField("update_time")
    private Date updateTime;
}
