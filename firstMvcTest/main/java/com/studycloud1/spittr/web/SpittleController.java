package com.studycloud1.spittr.web;

import com.studycloud1.spittr.dao.Spittle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model){
        Spittle spittle = new Spittle((long) 1, "aaa", 22.1, 33.2);
        model.addAttribute("spittle", spittle);
        System.out.println("数据已加载");
        return "forward:/home1";  // 重定向，这种形式是客户端重定向，客户端再发一个新的URL路径的请求;返回的字符串可以拼接
        // "redirect" 服务器重定向，和Servlet的那个一样
    }
}
