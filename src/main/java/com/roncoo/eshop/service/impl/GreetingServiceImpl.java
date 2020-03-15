package com.roncoo.eshop.service.impl;

import com.roncoo.eshop.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: wangmeng
 * @time: 2020-02-20 15:07
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 服务调用ribbon + rest template方式
     *
     * @param name
     * @return
     */
    @Override
    public String greet(String name) {
        return restTemplate.getForObject("http://PROVIDER-SERVICE/hello?name=" + name, String.class);
    }
}
