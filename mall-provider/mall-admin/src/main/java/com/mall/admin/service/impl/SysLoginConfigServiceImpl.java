package com.mall.admin.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.admin.repository.SysLoginConfigRepository;
import com.mall.admin.entity.SysLoginConfig;
import com.mall.admin.service.ISysLoginConfigService;
import com.mall.admin.mapper.ISysLoginConfigMapper;
/**
 * <p>
 * 登录背景配置表 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SysLoginConfigServiceImpl extends BaseServiceImpl<ISysLoginConfigMapper,SysLoginConfig> implements ISysLoginConfigService{

    @Resource
    private ISysLoginConfigMapper SysLoginConfigMapper;

}
