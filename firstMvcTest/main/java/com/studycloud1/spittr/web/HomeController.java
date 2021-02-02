package com.studycloud1.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller  // 声明控制器（作用不大），组件扫描器通过@Controller的标识找到HomeController并声明为应用上下文的bean
// @Component Controller基于Component，也可用Component就是不好看
public class HomeController {
    @RequestMapping(value = "/", method = GET)  //
    public String home(){
        System.out.println("调用Controller");
        return "home";
    }

}
