package com.itqiankun.mybatis.source.mapper;

import com.itqiankun.mybatis.source.entity.User;

import java.util.List;

public interface UserMapper {
    User selectUserById(Integer id);
    User selectUserByUser(User user);
    List<User> selectUserByUserLike(User user);
    Integer testResultTypeAlias();
}