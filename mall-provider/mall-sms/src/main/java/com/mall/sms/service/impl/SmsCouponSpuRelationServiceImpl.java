package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsCouponSpuRelationRepository;
import com.mall.sms.entity.SmsCouponSpuRelation;
import com.mall.sms.service.ISmsCouponSpuRelationService;
import com.mall.sms.mapper.ISmsCouponSpuRelationMapper;
/**
 * <p>
 * 优惠券与产品关联 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsCouponSpuRelationServiceImpl extends BaseServiceImpl<ISmsCouponSpuRelationMapper,SmsCouponSpuRelation> implements ISmsCouponSpuRelationService{

    @Resource
    private ISmsCouponSpuRelationMapper SmsCouponSpuRelationMapper;

}
