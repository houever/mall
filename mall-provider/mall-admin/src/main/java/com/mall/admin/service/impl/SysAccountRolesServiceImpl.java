package com.mall.admin.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.admin.repository.SysAccountRolesRepository;
import com.mall.admin.entity.SysAccountRoles;
import com.mall.admin.service.ISysAccountRolesService;
import com.mall.admin.mapper.ISysAccountRolesMapper;
/**
 * <p>
 * 账户角色表 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SysAccountRolesServiceImpl extends BaseServiceImpl<ISysAccountRolesMapper,SysAccountRoles> implements ISysAccountRolesService{

    @Resource
    private ISysAccountRolesMapper SysAccountRolesMapper;

}
