package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsSeckillSessionRepository;
import com.mall.sms.entity.SmsSeckillSession;
import com.mall.sms.service.ISmsSeckillSessionService;
import com.mall.sms.mapper.ISmsSeckillSessionMapper;
/**
 * <p>
 * 秒杀活动场次 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsSeckillSessionServiceImpl extends BaseServiceImpl<ISmsSeckillSessionMapper,SmsSeckillSession> implements ISmsSeckillSessionService{

    @Resource
    private ISmsSeckillSessionMapper SmsSeckillSessionMapper;

}
