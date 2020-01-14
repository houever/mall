package com.mall.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.admin.entity.SysPermission;
/**
 * <p>
 *  Repository 接口
 * </p>
 *
 * @author houqj
 * @since 2020-01-03
 */
public interface SysPermissionRepository extends JpaRepository<SysPermission, String>{
	 
}