package com.mall.oms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.oms.repository.OmsOrderItemRepository;
import com.mall.oms.entity.OmsOrderItem;
import com.mall.oms.service.IOmsOrderItemService;
import com.mall.oms.mapper.IOmsOrderItemMapper;
/**
 * <p>
 * 订单项信息 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class OmsOrderItemServiceImpl extends BaseServiceImpl<IOmsOrderItemMapper,OmsOrderItem> implements IOmsOrderItemService{

    @Resource
    private IOmsOrderItemMapper OmsOrderItemMapper;

}
