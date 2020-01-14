package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsCategoryBoundsRepository;
import com.mall.sms.entity.SmsCategoryBounds;
import com.mall.sms.service.ISmsCategoryBoundsService;
import com.mall.sms.mapper.ISmsCategoryBoundsMapper;
/**
 * <p>
 * 商品分类积分设置 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsCategoryBoundsServiceImpl extends BaseServiceImpl<ISmsCategoryBoundsMapper,SmsCategoryBounds> implements ISmsCategoryBoundsService{

    @Resource
    private ISmsCategoryBoundsMapper SmsCategoryBoundsMapper;

}
