package com.itqiankun.sharding.jdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itqiankun.sharding.jdbc.model.Order;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 订单表 Mapper
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2019-03-26 13:38
 */
@Component
public interface OrderMapper extends BaseMapper<Order> {
}
