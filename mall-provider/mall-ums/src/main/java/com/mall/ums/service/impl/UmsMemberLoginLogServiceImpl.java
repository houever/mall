package com.mall.ums.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.ums.repository.UmsMemberLoginLogRepository;
import com.mall.ums.entity.UmsMemberLoginLog;
import com.mall.ums.service.IUmsMemberLoginLogService;
import com.mall.ums.mapper.IUmsMemberLoginLogMapper;
/**
 * <p>
 * 会员登录记录 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class UmsMemberLoginLogServiceImpl extends BaseServiceImpl<IUmsMemberLoginLogMapper,UmsMemberLoginLog> implements IUmsMemberLoginLogService{

    @Resource
    private IUmsMemberLoginLogMapper UmsMemberLoginLogMapper;

}
