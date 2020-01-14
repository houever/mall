package com.mall.admin.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import cn.fast.web.common.model.MenuVo;
import org.springframework.stereotype.Service;
import com.mall.admin.repository.SysPermissionRepository;
import com.mall.admin.entity.SysPermission;
import com.mall.admin.service.ISysPermissionService;
import com.mall.admin.mapper.ISysPermissionMapper;

import java.util.List;

/**
 * <p>
 * 权限菜单表 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SysPermissionServiceImpl extends BaseServiceImpl<ISysPermissionMapper,SysPermission> implements ISysPermissionService{

    @Resource
    private ISysPermissionMapper SysPermissionMapper;

    /**
     * 根据用户id查询菜单列表
     *
     * @param id
     * @return
     */
    @Override
    public List<MenuVo> getMenusListByUserId(String id) {
        return SysPermissionMapper.getMenusListByUserId(id);
    }

    /**
     * 根据用户id查询所拥有的按钮列表
     *
     * @param id
     * @return
     */
    @Override
    public List<String> getPermissionBtnsByUserId(String id) {
        return SysPermissionMapper.getPermissionBtnsByUserId(id);
    }

    /**
     * 根据用户id查询所有可按钮访问权限列表
     *
     * @param id
     * @return
     */
    @Override
    public List<String> getPermissionByUserId(String id) {
        return SysPermissionMapper.getPermissionByUserId(id);
    }
}
