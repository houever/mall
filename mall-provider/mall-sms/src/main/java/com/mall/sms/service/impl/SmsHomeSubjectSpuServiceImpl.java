package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsHomeSubjectSpuRepository;
import com.mall.sms.entity.SmsHomeSubjectSpu;
import com.mall.sms.service.ISmsHomeSubjectSpuService;
import com.mall.sms.mapper.ISmsHomeSubjectSpuMapper;
/**
 * <p>
 * 专题商品 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsHomeSubjectSpuServiceImpl extends BaseServiceImpl<ISmsHomeSubjectSpuMapper,SmsHomeSubjectSpu> implements ISmsHomeSubjectSpuService{

    @Resource
    private ISmsHomeSubjectSpuMapper SmsHomeSubjectSpuMapper;

}
