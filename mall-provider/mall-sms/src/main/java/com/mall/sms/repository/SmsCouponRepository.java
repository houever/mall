package com.mall.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.sms.entity.SmsCoupon;
/**
 * <p>
 *  Repository 接口
 * </p>
 *
 * @author houqj
 * @since 2020-01-03
 */
public interface SmsCouponRepository extends JpaRepository<SmsCoupon, String>{
	 
}