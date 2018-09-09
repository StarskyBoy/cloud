package com.midou.cloud.register.ribbon.without.eureka.Controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author midou
 * @description
 * @date 2018/9/3 22:03
 * @modified by
 */
@RestController
public class ConsumerController {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ConsumerController.class);;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/log-user-instance")
    public void logUserInstance() {
       ServiceInstance serviceInstance=this.loadBalancerClient.choose("cloud-register-user");
         logger.info("/////////////////log-user-instance/////////////////////");
        logger.info("{},{},{}",serviceInstance.getServiceId(),serviceInstance.getHost(),serviceInstance.getPort());
    }
}
