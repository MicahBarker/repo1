package com.lagou.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 青科大-任安全
 * @Create 2024/5/6 9:03
 */
public class MyInterceptor1 implements HandlerInterceptor {

    // 在目标方法执行之前 拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println("preHendle1");
        return true;
    }

    // 在目标方法执行之后,视图对象返回之前 执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println("postHandle1");
    }

    // 在流程都执行完毕后 执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("afterCompletion1");
    }
}