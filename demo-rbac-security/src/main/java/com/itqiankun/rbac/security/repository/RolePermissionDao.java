package com.itqiankun.rbac.security.repository;

import com.itqiankun.rbac.security.model.RolePermission;
import com.itqiankun.rbac.security.model.unionkey.RolePermissionKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <p>
 * 角色-权限 DAO
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-12-10 13:45
 */
public interface RolePermissionDao extends JpaRepository<RolePermission, RolePermissionKey>, JpaSpecificationExecutor<RolePermission> {
}
