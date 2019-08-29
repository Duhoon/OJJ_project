package com.example.learn_springboot.controller.log;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogController {


    @RequestMapping(value = "/introduce/{action}")
    public String ActionMethod2(@PathVariable String action){
        String viewName = "/introduce/" + action;
        return viewName;
    }
}

