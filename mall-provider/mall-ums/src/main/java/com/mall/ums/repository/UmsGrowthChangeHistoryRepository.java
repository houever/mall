package com.mall.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.ums.entity.UmsGrowthChangeHistory;
/**
 * <p>
 *  Repository 接口
 * </p>
 *
 * @author houqj
 * @since 2020-01-03
 */
public interface UmsGrowthChangeHistoryRepository extends JpaRepository<UmsGrowthChangeHistory, String>{
	 
}