package com.mall.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.oms.entity.OmsOrderReturnReason;
/**
 * <p>
 *  Repository 接口
 * </p>
 *
 * @author houqj
 * @since 2020-01-03
 */
public interface OmsOrderReturnReasonRepository extends JpaRepository<OmsOrderReturnReason, String>{
	 
}