package com.itqiankun.dynamic.datasource.mapper;

import com.itqiankun.dynamic.datasource.config.MyMapper;
import com.itqiankun.dynamic.datasource.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户 Mapper
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2019-09-04 16:49
 */
@Mapper
public interface UserMapper extends MyMapper<User> {
}
