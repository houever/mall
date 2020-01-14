package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsMemberPriceRepository;
import com.mall.sms.entity.SmsMemberPrice;
import com.mall.sms.service.ISmsMemberPriceService;
import com.mall.sms.mapper.ISmsMemberPriceMapper;
/**
 * <p>
 * 商品会员价格 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsMemberPriceServiceImpl extends BaseServiceImpl<ISmsMemberPriceMapper,SmsMemberPrice> implements ISmsMemberPriceService{

    @Resource
    private ISmsMemberPriceMapper SmsMemberPriceMapper;

}
