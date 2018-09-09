package com.midou.cloud.register.ribbon.configcustom.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author midou
 * @description
 * @date 2018/9/6 18:39
 * @modified by
 */
@Configuration
public class RibbonCustomConfiguration {
    @Bean
    public IRule ribbonRule() {
        // 负载均衡规则，改为随机
        return new RandomRule();
    }
}
