package com.example.learn_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{
    @RequestMapping(value = "/home")
        public String ActionMethod1(){
            return "/home";
        }

    @RequestMapping(value = "/board/{action}")
    public String ActionMethod2(@PathVariable String action) {
        String viewName = "/board/" + action;
        return viewName;
    }

}