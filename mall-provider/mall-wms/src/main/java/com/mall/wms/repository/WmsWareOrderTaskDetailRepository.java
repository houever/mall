package com.mall.wms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.wms.entity.WmsWareOrderTaskDetail;
/**
 * <p>
 *  Repository 接口
 * </p>
 *
 * @author houqj
 * @since 2020-01-03
 */
public interface WmsWareOrderTaskDetailRepository extends JpaRepository<WmsWareOrderTaskDetail, String>{
	 
}