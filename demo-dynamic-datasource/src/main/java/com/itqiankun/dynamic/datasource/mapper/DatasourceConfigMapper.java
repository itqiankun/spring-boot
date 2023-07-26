package com.itqiankun.dynamic.datasource.mapper;

import com.itqiankun.dynamic.datasource.config.MyMapper;
import com.itqiankun.dynamic.datasource.model.DatasourceConfig;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 数据源配置 Mapper
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2019-09-04 16:20
 */
@Mapper
public interface DatasourceConfigMapper extends MyMapper<DatasourceConfig> {
}
