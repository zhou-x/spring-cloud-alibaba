package com.zhoux;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taoyi
 * @version 1.0
 * @date 2021/6/27 10:35
 */
@SpringBootApplication
public class ScaProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScaProviderApplication.class,args);
    }

    @Value("${server.port}")//读取application.yml中的server.port
    private String server;
    @RestController
    public class ProviderController{
        @GetMapping("/provider/echo/{msg}")
        public String doEcho(@PathVariable String msg){
            return server+" say hello "+msg;
        }
    }

}