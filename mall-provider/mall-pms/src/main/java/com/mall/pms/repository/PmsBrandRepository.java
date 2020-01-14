package com.mall.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.pms.entity.PmsBrand;
/**
 * <p>
 *  Repository 接口
 * </p>
 *
 * @author houqj
 * @since 2020-01-03
 */
public interface PmsBrandRepository extends JpaRepository<PmsBrand, String>{
	 
}