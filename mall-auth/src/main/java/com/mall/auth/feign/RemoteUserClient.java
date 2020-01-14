package com.mall.auth.feign;

import cn.fast.web.common.constant.SecurityConstants;
import cn.fast.web.common.model.AuthAccount;
import cn.fast.web.common.model.AuthRoles;
import cn.fast.web.common.result.Result;
import com.mall.auth.feign.factory.RemoteUserClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户中心对外开放接口
 */
@FeignClient(name = cn.fast.common.ServiceConstants.USC_SERVICE,fallbackFactory = RemoteUserClientFallbackFactory.class)
public interface RemoteUserClient {
    /**
     * 通过用户名查询用户、角色信息
     *
     * @param username 用户名
     * @return Result
     */
    @PostMapping(value = "/account/login",produces = "application/json;charset=UTF-8")
    Result<AuthAccount> accountInfo(@RequestParam("username") String username);

    /**
     * 通过社交账号或手机号查询用户、角色信息
     *
     * @param inStr appid@code
     * @param from  调用标志
     * @return
     */
    @GetMapping("/social/info/{inStr}")
    Result<AuthAccount> social(@PathVariable("inStr") String inStr, @RequestHeader(SecurityConstants.FROM) String from);
}
