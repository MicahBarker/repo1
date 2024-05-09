package com.lagou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 青科大-任安全
 * @Create 2024/5/6 8:50
 */
@Controller
public class ExceptionController {

    @RequestMapping("testException")
    public String testException(){
        int i=1/0;
        return "success";
    }

}
