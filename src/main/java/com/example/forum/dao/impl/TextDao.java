package com.example.forum.dao.impl;

import com.example.forum.domain.Text;

import java.util.List;

public interface TextDao {

    int insertTest(Text text);//普通权限
    int deleteByName(String name);//超级用户权限
    List<Text> selectAll();//普通用户 显示所有评论

}
