package com.mall.admin.service;
import cn.fast.web.base.BasePage;
import cn.fast.web.base.BaseService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mall.admin.entity.SysAccount;
import com.mall.admin.model.dto.AccountDTO;

import java.util.List;

/**
 * <p>
 * 账户表 接口
 * </p>
 *
 * @author HOU
 * @since 2020-01-07
 */
public interface ISysAccountService extends BaseService<SysAccount>{

    /**
     * 用户分页列表
     *
     * @return
     */
    IPage<AccountDTO> getAccountPage(BasePage<AccountDTO> page);

    /**
     * 编辑用户
     * @param accountDTO
     * @return
     */
    Integer updateAccount(AccountDTO accountDTO);

    /**
     * 根据访问路径获取角色列表
     * @param url
     * @return
     */
    List<String> selectRolesByUrl(String url);

    /**
     * @Author houqijun
     * @Description 根据角色id查询所有用户
     * @Date 16:10 2019/2/26 0026
     * @Param [id]
     * @return java.util.List<com.mycloud.usc.model.entity.SysAccount>
     **/
    List<SysAccount> findUserByRoleId(String id);
}
