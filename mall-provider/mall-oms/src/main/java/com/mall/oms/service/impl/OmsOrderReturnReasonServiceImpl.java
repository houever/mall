package com.mall.oms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.oms.repository.OmsOrderReturnReasonRepository;
import com.mall.oms.entity.OmsOrderReturnReason;
import com.mall.oms.service.IOmsOrderReturnReasonService;
import com.mall.oms.mapper.IOmsOrderReturnReasonMapper;
/**
 * <p>
 * 退货原因 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class OmsOrderReturnReasonServiceImpl extends BaseServiceImpl<IOmsOrderReturnReasonMapper,OmsOrderReturnReason> implements IOmsOrderReturnReasonService{

    @Resource
    private IOmsOrderReturnReasonMapper OmsOrderReturnReasonMapper;

}
