package com.midou.cloud.register.ribbon.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author midou
 * @description
 * @date 2018/9/3 22:03
 * @modified by
 */
@RestController
public class ConsumerController {

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * @param
     * @return cloud-register-user-metadata服务的信息
     * @author midou
     * @description 查询cloud-register-user-metadata服务的信息并返回
     * @date 2018/9/3 22:05
     */
    @GetMapping("/user-instance")
    public List<ServiceInstance> showInfo() {
        return this.discoveryClient.getInstances("cloud-register-user-metadata");
    }
}
