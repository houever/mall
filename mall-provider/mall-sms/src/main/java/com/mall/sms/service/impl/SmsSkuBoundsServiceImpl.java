package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsSkuBoundsRepository;
import com.mall.sms.entity.SmsSkuBounds;
import com.mall.sms.service.ISmsSkuBoundsService;
import com.mall.sms.mapper.ISmsSkuBoundsMapper;
/**
 * <p>
 * 商品sku积分设置 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsSkuBoundsServiceImpl extends BaseServiceImpl<ISmsSkuBoundsMapper,SmsSkuBounds> implements ISmsSkuBoundsService{

    @Resource
    private ISmsSkuBoundsMapper SmsSkuBoundsMapper;

}
