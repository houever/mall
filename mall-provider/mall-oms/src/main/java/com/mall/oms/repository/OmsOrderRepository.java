package com.mall.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.oms.entity.OmsOrder;
/**
 * <p>
 *  Repository 接口
 * </p>
 *
 * @author houqj
 * @since 2020-01-03
 */
public interface OmsOrderRepository extends JpaRepository<OmsOrder, String>{
	 
}