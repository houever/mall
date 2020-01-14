package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsSkuLadderRepository;
import com.mall.sms.entity.SmsSkuLadder;
import com.mall.sms.service.ISmsSkuLadderService;
import com.mall.sms.mapper.ISmsSkuLadderMapper;
/**
 * <p>
 * 商品阶梯价格 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsSkuLadderServiceImpl extends BaseServiceImpl<ISmsSkuLadderMapper,SmsSkuLadder> implements ISmsSkuLadderService{

    @Resource
    private ISmsSkuLadderMapper SmsSkuLadderMapper;

}
