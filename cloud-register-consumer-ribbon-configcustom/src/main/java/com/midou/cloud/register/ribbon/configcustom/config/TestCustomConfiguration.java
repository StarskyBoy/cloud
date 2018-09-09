package com.midou.cloud.register.ribbon.configcustom.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;



/**
 * @author midou
 * @description
 * @date 2018/9/6 18:41
 * @modified by
 */
@Configuration
@RibbonClient(name = "cloud-register-user", configuration = RibbonCustomConfiguration.class)
public class TestCustomConfiguration {
}
