package com.zhoux.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author: taoyi
 * @date: 2021/6/28 16:51
 * @version: 1.0
 * @explain:
 */

@RestController
@RequestMapping("/provider")
public class RestProviderController {

    @DeleteMapping("{id}")
    public String doDeleteById(@PathVariable Long ... id){
        return Arrays.toString(id) + " is deleted ~~ " ;
    }
}
