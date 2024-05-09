package com.lagou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 青科大-任安全
 * @Create 2024/5/6 9:04
 */
@Controller
public class TargetController {

    @RequestMapping("/target")
    public String targetMethod() {
        System.out.println("目标方法执行了...");
        return "success";
    }
}
