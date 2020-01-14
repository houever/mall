package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsSeckillSkuRelationRepository;
import com.mall.sms.entity.SmsSeckillSkuRelation;
import com.mall.sms.service.ISmsSeckillSkuRelationService;
import com.mall.sms.mapper.ISmsSeckillSkuRelationMapper;
/**
 * <p>
 * 秒杀活动商品关联 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsSeckillSkuRelationServiceImpl extends BaseServiceImpl<ISmsSeckillSkuRelationMapper,SmsSeckillSkuRelation> implements ISmsSeckillSkuRelationService{

    @Resource
    private ISmsSeckillSkuRelationMapper SmsSeckillSkuRelationMapper;

}
