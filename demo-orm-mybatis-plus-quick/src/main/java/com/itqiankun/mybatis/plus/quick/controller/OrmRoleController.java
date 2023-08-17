package com.itqiankun.mybatis.plus.quick.controller;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itqiankun.mybatis.plus.quick.domain.OrmRole;
import com.itqiankun.mybatis.plus.quick.service.OrmRoleService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @TableName orm_role
 */
@Controller
public class OrmRoleController {
    @Autowired
    private OrmRoleService ormRoleService;

    @ResponseBody
    @RequestMapping("getById")
    public OrmRole getById(@RequestParam Integer id){
        return ormRoleService.getBaseMapper().selectById(id);
    }
}