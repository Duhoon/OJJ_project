package com.example.learn_springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/home/{action}")
    public ModelAndView hi(@RequestParam Map<String, Object> paramMap, @PathVariable String action, ModelAndView modelAndView) {
      
        if (paramMap.get("isLogin") == null) {
            paramMap.put("isLogin", false);
        }
      
        modelAndView.setViewName("/home/"+action);
        modelAndView.addObject("data", paramMap);

        return modelAndView;
    }
  

   

}