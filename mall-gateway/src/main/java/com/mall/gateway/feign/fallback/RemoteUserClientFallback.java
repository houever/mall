package com.mall.gateway.feign.fallback;

import com.mall.gateway.feign.IRemoteUserClient;
import cn.fast.web.common.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RemoteUserClientFallback implements IRemoteUserClient {

    @Override
    public Result queryAllMenusByName(String name) {
        return Result.fail("调用用户服务失败");
    }

    @Override
    public Result getSysLoginBg() {
        return Result.fail("调用用户服务失败");
    }
}
