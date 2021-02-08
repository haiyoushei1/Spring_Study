package com.studycloud1.spittr.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/*
至于接收表单，需要在方法搞一下形参，springmvc会自动注入，形参可以是类，字符串，基本数据类型
 */

@Controller
public class JsonController {
    @RequestMapping(value = "/json")
    @ResponseBody // 对于前后端分离的系统，后端要发送给前端一个json，有这个注解，恒不跳转，会将返回的类编程json，字符串就以流的方式输出
    // 返回对象或者map(也就是可以转化为key-value形式的)
    public HashMap test(@RequestParam(value = "name", defaultValue = "default") String name,
                        // 使用@RequestParam注解可以获得GET方式的参数
                        // 一个get请求例子：/json?name=aaa & ID=123 @RequestParam根据value的名字对后面的变量进行赋值
                        // 可以通过defaultValue设置当请求中没有这个参数时的默认值
                        @RequestParam(value = "ID", defaultValue = "111") int id){
        System.out.println("Json已加载");
        HashMap s = new HashMap();
        s.put(name, id);
        return s;
    }
    @RequestMapping(value = "/json/{name}", method = RequestMethod.GET)
    @ResponseBody  //也可以使用这种路径参数的方式获取参数，如果有了这种形式，先执行确定的，比如下面的例子，
    // 处理aaa的请求，如果没有才走这个
    // 在路径中{***}的形式，加上变量前用@PathVariable("***")，可以把路径中的数赋给变量
    public HashMap test1(@PathVariable("name") String name){
        System.out.println("Json2已加载");
        HashMap s = new HashMap();
        s.put(name, "456");
        return s;
    }
    @RequestMapping(value = "/json/aaa")
    public String test2(){
        System.out.println("没有走请求");
        return "home";
    }

}
