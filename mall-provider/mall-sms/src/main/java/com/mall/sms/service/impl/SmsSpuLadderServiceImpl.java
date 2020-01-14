package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsSpuLadderRepository;
import com.mall.sms.entity.SmsSpuLadder;
import com.mall.sms.service.ISmsSpuLadderService;
import com.mall.sms.mapper.ISmsSpuLadderMapper;
/**
 * <p>
 * 商品阶梯价格 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsSpuLadderServiceImpl extends BaseServiceImpl<ISmsSpuLadderMapper,SmsSpuLadder> implements ISmsSpuLadderService{

    @Resource
    private ISmsSpuLadderMapper SmsSpuLadderMapper;

}
