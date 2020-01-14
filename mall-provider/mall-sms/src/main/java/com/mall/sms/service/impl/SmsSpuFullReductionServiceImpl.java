package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsSpuFullReductionRepository;
import com.mall.sms.entity.SmsSpuFullReduction;
import com.mall.sms.service.ISmsSpuFullReductionService;
import com.mall.sms.mapper.ISmsSpuFullReductionMapper;
/**
 * <p>
 * 商品满减信息 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsSpuFullReductionServiceImpl extends BaseServiceImpl<ISmsSpuFullReductionMapper,SmsSpuFullReduction> implements ISmsSpuFullReductionService{

    @Resource
    private ISmsSpuFullReductionMapper SmsSpuFullReductionMapper;

}
