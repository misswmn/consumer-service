package com.roncoo.eshop.controller;

import com.roncoo.eshop.service.GreetingService;
import com.roncoo.eshop.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: wangmeng
 * @time: 2020-02-20 15:09
 */
@RestController
public class GreetingController {
    @Autowired
    private GreetingService greetingService;
    @Autowired
    private HelloService helloService;

    @Value("${defaultName}")
    private String defaultName;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/greet2")
    public String greet(String name) {
        return greetingService.greet(name);
    }

    @RequestMapping(value = "/greet")
    public String hello2(String name) {
        if (null == defaultName) {
            return helloService.sayHello(name);
        } else {
            return "hello from consumer-service: " + port + " , defaultName:" + defaultName;
        }
    }
}
