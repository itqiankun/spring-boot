package com.itqiankun.orm.beetlsql.dao;

import com.itqiankun.orm.beetlsql.entity.User;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * UserDao
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-11-14 16:18
 */
@Component
public interface UserDao extends BaseMapper<User> {

}
