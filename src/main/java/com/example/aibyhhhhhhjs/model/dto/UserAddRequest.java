package com.example.aibyhhhhhhjs.model.dto;

import lombok.Data;

import java.io.Serializable;


/**
 * 用户创建请求
 */
@Data
public class UserAddRequest implements Serializable {  // 实现Serializable接口，使对象可以序列化

    /**
     * 用户昵称
     * 用于展示用户的个性化名称
     */
    private String userName;

    /**
     * 账号
     * 用户的登录账号，具有唯一性
     */
    private String userAccount;

    /**
     * 用户头像
     * 存储用户头像的URL地址
     */
    private String userAvatar;

    /**
     * 用户简介
     * 展示用户的个人简介信息
     */
    private String userProfile;

    /**
     * 用户角色: user, admin
     * 定义用户在系统中的角色权限
     * user: 普通用户
     * admin: 管理员
     */
    private String userRole;

    private static final long serialVersionUID = 1L;  // 序列化版本号，用于控制版本兼容性
}
