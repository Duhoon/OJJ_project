package com.example.learn_springboot.controller.log;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogController {
    @RequestMapping(value = "/log/{action}")
    public String ActionMethod(@PathVariable String action){
        String viewName = "/log/" + action;
        return viewName;
    }
}