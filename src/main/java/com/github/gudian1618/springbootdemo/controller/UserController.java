package com.github.gudian1618.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/28 9:00 下午
 */

@RestController
public class UserController {

    @RequestMapping("/hello")
    public String hello() {
        return "你好SpringBoot";
    }
}
