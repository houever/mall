package com.mall.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.oms.entity.OmsOrderItem;
/**
 * <p>
 *  Repository 接口
 * </p>
 *
 * @author houqj
 * @since 2020-01-03
 */
public interface OmsOrderItemRepository extends JpaRepository<OmsOrderItem, String>{
	 
}