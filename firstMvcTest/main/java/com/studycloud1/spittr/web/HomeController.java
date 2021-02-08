package com.studycloud1.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller  // 声明控制器（作用不大），组件扫描器通过@Controller的标识找到HomeController并声明为应用上下文的bean
// @Component Controller基于Component，也可用Component就是不好看
//@RequestMapping({"/", "home"}) 可以使用字符串数组映射多个请求
public class HomeController {
    // @RequestMapping(method=GET) 也可用这种形式去批量处理请求
    @RequestMapping(value = "/", method = GET)  //处理根目录下方式为GET的请求
    public String home(){
        System.out.println("调用Controller");
        return "home";
    }
    @RequestMapping(value = "home1", method = GET)
    public String home1(){
        System.out.println("重定向home");
        return "home1";
    }

}
