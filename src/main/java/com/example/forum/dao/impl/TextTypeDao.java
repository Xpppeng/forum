package com.example.forum.dao.impl;

import com.example.forum.domain.TextType;

import java.util.List;

public interface TextTypeDao {
    List<TextType> selectByLeftOrRight(int left,int right);
    int deleteById(int textTypeId);

}
