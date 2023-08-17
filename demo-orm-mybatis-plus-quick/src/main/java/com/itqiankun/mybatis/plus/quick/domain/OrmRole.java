package com.itqiankun.mybatis.plus.quick.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName orm_role
 */
@TableName(value ="orm_role")
@Data
public class OrmRole implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}