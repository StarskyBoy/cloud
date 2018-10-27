package com.midou.cloud.register.gateway.zuul.aggregation.service;


import com.midou.cloud.register.gateway.zuul.aggregation.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rx.Observable;

/**
 * @author midou
 * @description
 * @date 2018/10/24 18:50
 * @modified by
 */
@Service
public class AggregationService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public Observable<User> getUserById(Long id) {
        // 创建一个被观察者
        return Observable.create(observer -> {
            // 请求用户微服务的/{id}端点
            User user = restTemplate.getForObject("http://cloud-register-user/{id}", User.class, id);
            observer.onNext(user);
            observer.onCompleted();
        });
    }

    @HystrixCommand(fallbackMethod = "fallback")
    public Observable<User> getMovieUserByUserId(Long id) {
        return Observable.create(observer -> {
            // 请求未创建服务的/user/{id}端点，本cloud没有这个微服务你可以自行创建
            User otherUser = restTemplate.getForObject("http://cloud-consumer-user/user/{id}", User.class, id);
            observer.onNext(otherUser);
            observer.onCompleted();
        });
    }

    public User fallback(Long id) {
        User user = new User();
        user.setId(-1);
        return user;
    }
}
