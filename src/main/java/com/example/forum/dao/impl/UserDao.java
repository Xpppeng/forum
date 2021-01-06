package com.example.forum.dao.impl;

import com.example.forum.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();//管理员权限查看所以用户
    User findUId(String uName,String uPassword);//登陆
    int insert(User user);//注册
    int deleteByName(String uName);//超级管理员权限


}
