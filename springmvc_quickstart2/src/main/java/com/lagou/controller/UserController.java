package com.lagou.controller;

import com.lagou.domain.QueryVo;
import com.lagou.domain.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author 青科大-任安全
 * @Create 2024/4/22 21:38
 */
@Controller
@RequestMapping("/user")  // 一级访问目录
public class UserController {

    /*
     * path：可省略
     * method：用来限定请求的方式RequestMethod.POST：只能以post的方式访问该访问，其他请求方式会报错
     * */
    @RequestMapping(path = "/quick", method = RequestMethod.GET, params = {"accountName"})  // 二级访问目录
    public String quick() {
        System.out.println("quick running.....");
        return "success";
    }

    @RequestMapping("/simpleParam")
    public String simpleParam(Integer id, String username) {
        System.out.println(id);
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/pojoParam")
    public String pojoParam(User user) {
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/arrayParam")
    public String arrayParam(Integer[] ids) {
        System.out.println(Arrays.toString(ids));
        return "success";
    }

    @RequestMapping("/queryParam")
    public String queryParam(QueryVo queryVo) {
        System.out.println(queryVo);
        return "success";
    }

    @RequestMapping("/converterParam")
    public String converterParam(Date birthday) {
        System.out.println(birthday);
        return "success";
    }

    /*
    @RequestParam() 注解
    defaultValue 设置参数默认值
    name 匹配页面传递参数的名称
    required 设置是否必须传递参数，默认值为true；如果设置了默认值，值自动改为false

*/

    @RequestMapping("/findByPage")
    public String findByPage(@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize) {
        System.out.println(pageNum);
        System.out.println(pageSize);
        return "success";
    }

    @RequestMapping("/requestHead")
    public String requestHead(@RequestHeader("cookie") String cookie) {
        System.out.println(cookie);
        return "success";
    }

    @RequestMapping("/cookieValue")
    public String cookieValue(@CookieValue("JSESSIONID") String jesessionId) {
        System.out.println(jesessionId);
        return "success";
    }

    @RequestMapping("/servletAPI")
    public String servletAPI(HttpServletRequest request, HttpServletResponse
            response, HttpSession session) {
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        return "success";
    }

    @RequestMapping("/returnVoid")
    public void returnVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 1.通过response直接响应数据
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("拉勾网");

        request.setAttribute("username", "拉勾教育");
        // 2.通过request实现转发
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);

        // 3.通过response实现重定向
        response.sendRedirect(request.getContextPath() + "/index.jsp");

    }

    @RequestMapping("/forward")
    public String forward(Model model) {
        model.addAttribute("username", "拉勾招聘");
        return "forward:/WEB-INF/pages/success.jsp";

    }

    @RequestMapping("/redirect")
    public String redirect(Model model) {
        model.addAttribute("username", "拉勾教育");
        return "redirect:/index.jsp";
    }

    @RequestMapping("/returnModelAndView1")
    public ModelAndView returnModelAndView1() {

       /*
            Model:模型 作用封装数据
            View：视图 作用展示数据
       */

        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username", " lagou");
        //设置视图名称  直接写逻辑视图名称就行
        modelAndView.setViewName("success");

        return modelAndView;

    }

    /*ajax异步交互*/
    @RequestMapping("/ajaxRequest")
    public void ajaxRequest(@RequestBody List<User> list){
        for (User user : list) {
            System.out.println(user);
        }
    }
}
