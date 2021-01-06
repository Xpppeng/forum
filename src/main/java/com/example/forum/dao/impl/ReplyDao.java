package com.example.forum.dao.impl;

import com.example.forum.domain.Reply;

public interface ReplyDao {
    int insertBy(Reply reply);
    int deleteByrId(int rId);
}
