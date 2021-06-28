package com.zhoux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * @author: taoyi
 * @date: 2021/6/28 16:57
 * @version: 1.0
 * @explain:
 */

@RestController
@RequestMapping("/consumer")
public class RestConsumerController {

    @Autowired
    private RestTemplate loadBalancedRestTemplate;

    @DeleteMapping("/{id}")
    public String doDeleteById(@PathVariable String id){
        System.out.println("id1="+id);
        String url = String.format("http://%s/provider/%s","sca-provider",id);
        loadBalancedRestTemplate.delete(url,id);
        return "delete ok~~";
    }
}
