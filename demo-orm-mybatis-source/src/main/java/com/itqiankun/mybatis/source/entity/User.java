package com.itqiankun.mybatis.source.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户实体类
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-11-08 10:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable {
    private static final long serialVersionUID = -1840831686851699943L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     *
     */
    private Integer age;

    /**
     * limit
     */
    private Integer lit;
}
