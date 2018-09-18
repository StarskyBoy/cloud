package com.midou.cloud.register.consumer.feign.manual.Controller;

import com.midou.cloud.register.consumer.feign.manual.dao.UserFeignClient;
import com.midou.cloud.register.consumer.feign.manual.entity.User;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author midou
 * @description
 * @date 2018/9/9 12:32
 * @modified by
 */
@Import(FeignClientsConfiguration.class)
@RestController
public class ConsumerController {

    private UserFeignClient userUserFeignClient;

    private UserFeignClient adminUserFeignClient;

    @Autowired
    public ConsumerController(Decoder decoder, Encoder encoder, Client client, Contract contract) {
        // 这边的decoder、encoder、client、contract，可以debug看看是什么实例。
        this.userUserFeignClient = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("user", "user")).target(UserFeignClient.class, "http://cloud-register-user-with-auth/");
        this.adminUserFeignClient = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("admin", "admin"))
                .target(UserFeignClient.class, "http://cloud-register-user-with-auth/");
    }

    @GetMapping("/user-user/{id}")
    public User findByIdUser(@PathVariable Long id) {
        return this.userUserFeignClient.findById(id);
    }

    @GetMapping("/user-admin/{id}")
    public User findByIdAdmin(@PathVariable Long id) {
        return this.adminUserFeignClient.findById(id);
    }
}
