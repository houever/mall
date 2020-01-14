package com.mall.admin.mapper;
import cn.fast.web.base.BaseMpMapper;
import com.mall.admin.entity.SysRolesDept;
/**
 * <p>
 * 部门数据权限表 Mapper 接口
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
public interface ISysRolesDeptMapper extends BaseMpMapper<SysRolesDept>{

    Integer deleteRolesDeptByRid(String id);
}