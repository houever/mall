package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsHomeAdvRepository;
import com.mall.sms.entity.SmsHomeAdv;
import com.mall.sms.service.ISmsHomeAdvService;
import com.mall.sms.mapper.ISmsHomeAdvMapper;
/**
 * <p>
 * 首页轮播广告 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsHomeAdvServiceImpl extends BaseServiceImpl<ISmsHomeAdvMapper,SmsHomeAdv> implements ISmsHomeAdvService{

    @Resource
    private ISmsHomeAdvMapper SmsHomeAdvMapper;

}
