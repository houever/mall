package com.mall.auth.feign.factory;

import com.mall.auth.feign.RemoteUserClient;
import com.mall.auth.feign.fallback.RemoteUserClientFallbackImpl;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @program: mycloud-admin
 * @description:
 * @author: houqijun
 * @create: 2019-03-03 10:32
 **/
@Slf4j
@Component
public class RemoteUserClientFallbackFactory implements FallbackFactory<RemoteUserClient> {

    @Override
    public RemoteUserClient create(Throwable throwable) {
        RemoteUserClientFallbackImpl remoteUserClientFallback = new RemoteUserClientFallbackImpl();
        remoteUserClientFallback.setCause(throwable);
        return remoteUserClientFallback;
    }
}
