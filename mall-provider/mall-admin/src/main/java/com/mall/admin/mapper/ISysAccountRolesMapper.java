package com.mall.admin.mapper;
import cn.fast.web.base.BaseMpMapper;
import com.mall.admin.entity.SysAccountRoles;
/**
 * <p>
 * 账户角色表 Mapper 接口
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
public interface ISysAccountRolesMapper extends BaseMpMapper<SysAccountRoles>{

    Integer deleteByIdAccountId(String id);
}