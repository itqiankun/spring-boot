package com.itqiankun.rbac.security.model;

import com.itqiankun.rbac.security.model.unionkey.RolePermissionKey;
import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * <p>
 * 角色-权限
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-12-10 13:46
 */
@Data
@Entity
@Table(name = "sec_role_permission")
public class RolePermission {
    /**
     * 主键
     */
    @EmbeddedId
    private RolePermissionKey id;
}
