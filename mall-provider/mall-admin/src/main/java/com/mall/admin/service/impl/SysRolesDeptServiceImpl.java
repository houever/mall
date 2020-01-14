package com.mall.admin.service.impl;
import javax.annotation.Resource;
import cn.fast.web.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.mall.admin.repository.SysRolesDeptRepository;
import com.mall.admin.entity.SysRolesDept;
import com.mall.admin.service.ISysRolesDeptService;
import com.mall.admin.mapper.ISysRolesDeptMapper;
/**
 * <p>
 * 部门数据权限表 服务实现类
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
@Service
public class SysRolesDeptServiceImpl extends BaseServiceImpl<ISysRolesDeptMapper,SysRolesDept> implements ISysRolesDeptService{

    @Resource
    private ISysRolesDeptMapper SysRolesDeptMapper;

    /**
     * 根据角色id删除 角色部门中间表数据
     *
     * @param id
     * @return
     */
    @Override
    public Integer deleteRolesDeptByRid(String id) {
        return SysRolesDeptMapper.deleteRolesDeptByRid(id);
    }
}
