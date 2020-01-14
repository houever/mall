package com.mall.oms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.oms.repository.OmsOrderOperateHistoryRepository;
import com.mall.oms.entity.OmsOrderOperateHistory;
import com.mall.oms.service.IOmsOrderOperateHistoryService;
import com.mall.oms.mapper.IOmsOrderOperateHistoryMapper;
/**
 * <p>
 * 订单操作历史记录 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class OmsOrderOperateHistoryServiceImpl extends BaseServiceImpl<IOmsOrderOperateHistoryMapper,OmsOrderOperateHistory> implements IOmsOrderOperateHistoryService{

    @Resource
    private IOmsOrderOperateHistoryMapper OmsOrderOperateHistoryMapper;

}
