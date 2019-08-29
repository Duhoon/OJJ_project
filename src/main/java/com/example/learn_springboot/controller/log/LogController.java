package com.example.learn_springboot.controller.log;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogController {
    @RequestMapping(value = "/log/{action}")
    public ModelAndView ActionMethod1(@RequestParam Map<String, Object> paramMap, @PathVariable String action, ModelAndView modelAndView){        
        if (paramMap.get("isLogin") == null) {
            paramMap.put("isLogin", false);
        }
        modelAndView.setViewName("/log/"+action);
        modelAndView.addObject("paramMap", paramMap);
        return modelAndView;
    }

    @RequestMapping(value = "/introduce/{action}")
    public String ActionMethod2(@PathVariable String action){
        String viewName = "/introduce/" + action;
        return viewName;
    }
}

