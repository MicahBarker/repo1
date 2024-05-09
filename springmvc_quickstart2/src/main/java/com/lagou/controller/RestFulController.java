package com.lagou.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Author 青科大-任安全
 * @Create 2024/4/27 12:54
 */
// @Controller
@RestController
public class RestFulController {
    @GetMapping(value = "/user/{id}")
    // 相当于 @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    // @ResponseBody
    public String get(@PathVariable Integer id) {
        return "get：" + id;
    }

    @PostMapping(value = "/user")
    // @ResponseBody
    public String post() {
        return "post";
    }

    @PutMapping(value = "/user")
    // @ResponseBody
    public String put() {
        return "put";
    }

    @DeleteMapping(value = "/user/{id}")
    // @ResponseBody
    public String delete(@PathVariable Integer id) {
        return "delete：" + id;
    }
}
