package com.lagou.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 青科大-任安全
 * @Create 2024/5/6 8:41
 */
public class GlobalExceptionResolver implements HandlerExceptionResolver {
    // Exception e：实际抛出的异常对象
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        // 具体的异常处理 产生异常后，跳转到一个最终的异常页面
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",e.getMessage());
        modelAndView.setViewName("error");  // 跳转到error页面
        return modelAndView;
    }
}
