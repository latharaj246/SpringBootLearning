package com.latha.springweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/sendData")
    public ModelAndView sendData(){
        ModelAndView modelAndView = new ModelAndView("data");
        modelAndView.addObject("message","HardWorK");
        return modelAndView;
    }

}
