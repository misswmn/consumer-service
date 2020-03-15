package com.roncoo.eshop.service;

import com.roncoo.eshop.fallback.HelloServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign方式调用接口 provider接口
 *
 * @description:
 * @author: wangmeng
 * @time: 2020-02-22 21:31
 */
@Service
@FeignClient(value = "provider-service", fallback = HelloServiceFallback.class)
public interface HelloService {

    @RequestMapping(value = "/hello")
    String sayHello(@RequestParam(name = "name") String name);
}
