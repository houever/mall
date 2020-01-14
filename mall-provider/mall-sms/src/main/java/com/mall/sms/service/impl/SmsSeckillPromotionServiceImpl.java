package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsSeckillPromotionRepository;
import com.mall.sms.entity.SmsSeckillPromotion;
import com.mall.sms.service.ISmsSeckillPromotionService;
import com.mall.sms.mapper.ISmsSeckillPromotionMapper;
/**
 * <p>
 * 秒杀活动 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsSeckillPromotionServiceImpl extends BaseServiceImpl<ISmsSeckillPromotionMapper,SmsSeckillPromotion> implements ISmsSeckillPromotionService{

    @Resource
    private ISmsSeckillPromotionMapper SmsSeckillPromotionMapper;

}
