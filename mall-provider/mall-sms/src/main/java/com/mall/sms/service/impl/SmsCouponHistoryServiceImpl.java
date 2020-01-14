package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsCouponHistoryRepository;
import com.mall.sms.entity.SmsCouponHistory;
import com.mall.sms.service.ISmsCouponHistoryService;
import com.mall.sms.mapper.ISmsCouponHistoryMapper;
/**
 * <p>
 * 优惠券领取历史记录 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsCouponHistoryServiceImpl extends BaseServiceImpl<ISmsCouponHistoryMapper,SmsCouponHistory> implements ISmsCouponHistoryService{

    @Resource
    private ISmsCouponHistoryMapper SmsCouponHistoryMapper;

}
