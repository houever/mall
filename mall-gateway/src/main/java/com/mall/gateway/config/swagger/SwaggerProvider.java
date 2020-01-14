package com.mall.gateway.config.swagger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @author houqj
 * @date 2019-12-13 10:45
 */
@Slf4j
@Component
@Primary
public class SwaggerProvider implements SwaggerResourcesProvider {
    public static final String API_URI = "/v2/api-docs";


    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        resources.add(swaggerResource("Admin", "/mall-admin"+API_URI));
        resources.add(swaggerResource("OMS", "/mall-oms"+API_URI));
        resources.add(swaggerResource("PMS", "/mall-pms"+API_URI));
        resources.add(swaggerResource("SMS", "/mall-sms"+API_URI));
        resources.add(swaggerResource("UMS", "/mall-ums"+API_URI));
        resources.add(swaggerResource("WMS", "/mall-wms"+API_URI));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion("2.0");
        return swaggerResource;
    }
}
