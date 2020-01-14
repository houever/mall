package com.mall.admin.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.admin.repository.SysRolesPermissionRepository;
import com.mall.admin.entity.SysRolesPermission;
import com.mall.admin.service.ISysRolesPermissionService;
import com.mall.admin.mapper.ISysRolesPermissionMapper;
/**
 * <p>
 * 角色权限表 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SysRolesPermissionServiceImpl extends BaseServiceImpl<ISysRolesPermissionMapper,SysRolesPermission> implements ISysRolesPermissionService{

    @Resource
    private ISysRolesPermissionMapper SysRolesPermissionMapper;
    /**
     * 根据rid删除 role_permission 中间表数据
     * @param id
     * @return
     */
    @Override
    public Integer deleteRolesPermByRid(String id) {
        return SysRolesPermissionMapper.deleteRolesPermByRid(id);
    }

}
