package com.mall.oms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.oms.repository.OmsOrderReturnApplyRepository;
import com.mall.oms.entity.OmsOrderReturnApply;
import com.mall.oms.service.IOmsOrderReturnApplyService;
import com.mall.oms.mapper.IOmsOrderReturnApplyMapper;
/**
 * <p>
 * 订单退货申请 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class OmsOrderReturnApplyServiceImpl extends BaseServiceImpl<IOmsOrderReturnApplyMapper,OmsOrderReturnApply> implements IOmsOrderReturnApplyService{

    @Resource
    private IOmsOrderReturnApplyMapper OmsOrderReturnApplyMapper;

}
