package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsCouponSpuCategoryRelationRepository;
import com.mall.sms.entity.SmsCouponSpuCategoryRelation;
import com.mall.sms.service.ISmsCouponSpuCategoryRelationService;
import com.mall.sms.mapper.ISmsCouponSpuCategoryRelationMapper;
/**
 * <p>
 * 优惠券分类关联 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsCouponSpuCategoryRelationServiceImpl extends BaseServiceImpl<ISmsCouponSpuCategoryRelationMapper,SmsCouponSpuCategoryRelation> implements ISmsCouponSpuCategoryRelationService{

    @Resource
    private ISmsCouponSpuCategoryRelationMapper SmsCouponSpuCategoryRelationMapper;

}
