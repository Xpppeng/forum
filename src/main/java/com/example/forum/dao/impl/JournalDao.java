package com.example.forum.dao.impl;

import com.example.forum.domain.Journal;

import java.util.List;

public interface JournalDao {
    int insertJournal(Journal journal);//插入日志，普通权限
    List<Journal> selectAll();//管理员权限
    List<Journal> selectByName(String uName);//管理员权限

}
