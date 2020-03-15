package com.roncoo.eshop.controller;

import com.roncoo.eshop.service.GreetingService;
import com.roncoo.eshop.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/greet2")
    public String greet(String name) {
        return greetingService.greet(name);
    }

    @RequestMapping(value = "/greet")
    public String hello2(String name) {
        return helloService.sayHello(name);
    }
}
