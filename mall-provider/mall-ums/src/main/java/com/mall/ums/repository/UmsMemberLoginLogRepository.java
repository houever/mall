package com.mall.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.ums.entity.UmsMemberLoginLog;
/**
 * <p>
 *  Repository 接口
 * </p>
 *
 * @author houqj
 * @since 2020-01-03
 */
public interface UmsMemberLoginLogRepository extends JpaRepository<UmsMemberLoginLog, String>{
	 
}