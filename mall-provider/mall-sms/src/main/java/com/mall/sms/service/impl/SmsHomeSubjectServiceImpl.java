package com.mall.sms.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.sms.repository.SmsHomeSubjectRepository;
import com.mall.sms.entity.SmsHomeSubject;
import com.mall.sms.service.ISmsHomeSubjectService;
import com.mall.sms.mapper.ISmsHomeSubjectMapper;
/**
 * <p>
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SmsHomeSubjectServiceImpl extends BaseServiceImpl<ISmsHomeSubjectMapper,SmsHomeSubject> implements ISmsHomeSubjectService{

    @Resource
    private ISmsHomeSubjectMapper SmsHomeSubjectMapper;

}
