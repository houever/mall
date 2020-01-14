package com.mall.oms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.oms.repository.OmsRefundInfoRepository;
import com.mall.oms.entity.OmsRefundInfo;
import com.mall.oms.service.IOmsRefundInfoService;
import com.mall.oms.mapper.IOmsRefundInfoMapper;
/**
 * <p>
 * 退款信息 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class OmsRefundInfoServiceImpl extends BaseServiceImpl<IOmsRefundInfoMapper,OmsRefundInfo> implements IOmsRefundInfoService{

    @Resource
    private IOmsRefundInfoMapper OmsRefundInfoMapper;

}
