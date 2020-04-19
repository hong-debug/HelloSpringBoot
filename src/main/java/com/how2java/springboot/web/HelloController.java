package com.how2java.springboot.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
@Controller
public class HelloController {
/*    @RequestMapping("/hello")
    public String hello(Model m) throws Exception {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
       //int i  =1/0;
        return "hello";
    }*/


        @RequestMapping("/hello")
        public String hello1(Model m) {
            System.out.println("hello");
            //m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
            m.addAttribute("name", "thymeleaf");
            return "hello";
        }

}
