package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsSkuFullReductionRepository;
import com.mall.sms.entity.SmsSkuFullReduction;
import com.mall.sms.service.ISmsSkuFullReductionService;
import com.mall.sms.mapper.ISmsSkuFullReductionMapper;
/**
 * <p>
 * 商品满减信息 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsSkuFullReductionServiceImpl extends BaseServiceImpl<ISmsSkuFullReductionMapper,SmsSkuFullReduction> implements ISmsSkuFullReductionService{

    @Resource
    private ISmsSkuFullReductionMapper SmsSkuFullReductionMapper;

}
