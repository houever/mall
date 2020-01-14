package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsSpuBoundsRepository;
import com.mall.sms.entity.SmsSpuBounds;
import com.mall.sms.service.ISmsSpuBoundsService;
import com.mall.sms.mapper.ISmsSpuBoundsMapper;
/**
 * <p>
 * 商品spu积分设置 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsSpuBoundsServiceImpl extends BaseServiceImpl<ISmsSpuBoundsMapper,SmsSpuBounds> implements ISmsSpuBoundsService{

    @Resource
    private ISmsSpuBoundsMapper SmsSpuBoundsMapper;

}
