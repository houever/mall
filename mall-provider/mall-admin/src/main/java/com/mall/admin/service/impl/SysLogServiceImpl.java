package com.mall.admin.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.admin.repository.SysLogRepository;
import com.mall.admin.entity.SysLog;
import com.mall.admin.service.ISysLogService;
import com.mall.admin.mapper.ISysLogMapper;
/**
 * <p>
 * 系统日志表 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SysLogServiceImpl extends BaseServiceImpl<ISysLogMapper,SysLog> implements ISysLogService{

    @Resource
    private ISysLogMapper SysLogMapper;

}
