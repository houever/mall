package com.mall.oms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.oms.repository.OmsOrderRepository;
import com.mall.oms.entity.OmsOrder;
import com.mall.oms.service.IOmsOrderService;
import com.mall.oms.mapper.IOmsOrderMapper;
/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class OmsOrderServiceImpl extends BaseServiceImpl<IOmsOrderMapper,OmsOrder> implements IOmsOrderService{

    @Resource
    private IOmsOrderMapper OmsOrderMapper;

}
