package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsSeckillSkuNoticeRepository;
import com.mall.sms.entity.SmsSeckillSkuNotice;
import com.mall.sms.service.ISmsSeckillSkuNoticeService;
import com.mall.sms.mapper.ISmsSeckillSkuNoticeMapper;
/**
 * <p>
 * 秒杀商品通知订阅 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsSeckillSkuNoticeServiceImpl extends BaseServiceImpl<ISmsSeckillSkuNoticeMapper,SmsSeckillSkuNotice> implements ISmsSeckillSkuNoticeService{

    @Resource
    private ISmsSeckillSkuNoticeMapper SmsSeckillSkuNoticeMapper;

}
