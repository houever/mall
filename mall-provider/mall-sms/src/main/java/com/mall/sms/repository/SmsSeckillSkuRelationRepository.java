package com.mall.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.sms.entity.SmsSeckillSkuRelation;
/**
 * <p>
 *  Repository 接口
 * </p>
 *
 * @author houqj
 * @since 2020-01-03
 */
public interface SmsSeckillSkuRelationRepository extends JpaRepository<SmsSeckillSkuRelation, String>{
	 
}