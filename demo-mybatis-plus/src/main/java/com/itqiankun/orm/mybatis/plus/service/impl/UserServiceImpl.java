package com.itqiankun.orm.mybatis.plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itqiankun.orm.mybatis.plus.entity.User;
import com.itqiankun.orm.mybatis.plus.mapper.UserMapper;
import com.itqiankun.orm.mybatis.plus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * User Service
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-11-08 18:10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
