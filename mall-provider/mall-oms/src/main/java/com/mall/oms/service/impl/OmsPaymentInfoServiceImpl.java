package com.mall.oms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.oms.repository.OmsPaymentInfoRepository;
import com.mall.oms.entity.OmsPaymentInfo;
import com.mall.oms.service.IOmsPaymentInfoService;
import com.mall.oms.mapper.IOmsPaymentInfoMapper;
/**
 * <p>
 * 支付信息表 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class OmsPaymentInfoServiceImpl extends BaseServiceImpl<IOmsPaymentInfoMapper,OmsPaymentInfo> implements IOmsPaymentInfoService{

    @Resource
    private IOmsPaymentInfoMapper OmsPaymentInfoMapper;

}
