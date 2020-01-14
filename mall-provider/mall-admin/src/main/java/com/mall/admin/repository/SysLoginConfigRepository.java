package com.mall.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.admin.entity.SysLoginConfig;
/**
 * <p>
 *  Repository 接口
 * </p>
 *
 * @author houqj
 * @since 2020-01-03
 */
public interface SysLoginConfigRepository extends JpaRepository<SysLoginConfig, String>{
	 
}