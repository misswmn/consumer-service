package com.roncoo.eshop.fallback;

import com.roncoo.eshop.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * 服务降级
 *
 * @description:
 * @author: wangmeng
 * @time: 2020-02-22 21:44
 */
@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String sayHello(String name) {
        return "api[sayHello] error for [" + name + "]";
    }
}
