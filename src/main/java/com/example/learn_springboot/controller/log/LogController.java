package com.example.learn_springboot.controller.log;

import java.util.HashMap;
import java.util.Map;

import com.example.learn_springboot.service.SignupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogController {

    @Autowired
    private SignupService service;

    @RequestMapping(value = "/log/{action}")
    public ModelAndView ActionMethod1(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelAndView) {
        Object resultMap = new HashMap<String, Object>();

        if (paramMap.get("isLogin") == null) {
            ((Map<String, Object>) resultMap).put("isLogin", "false");
        }

        if ("save".equals(action)) {
            int obj = service.save(paramMap);

            action = "/home/index";
        } else {
            action = "/log/" + action;
        }
        modelAndView.setViewName(action);
        modelAndView.addObject("paramMap", paramMap);
        modelAndView.addObject("resultMap", resultMap);

        return modelAndView;
    }

    @RequestMapping(value = "/introduce/{action}")
    public ModelAndView ActionMethod2(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelAndView) {

        Object resultMap = new HashMap<String, Object>();

        if (paramMap.get("isLogin") == null) {
            ((Map<String, Object>) resultMap).put("isLogin", "false");
        }
        else
        {
            modelAndView.addObject("resultMap", paramMap);

        }
        action = "/introduce/" + action;
        modelAndView.setViewName(action);
        modelAndView.addObject("resultMap", resultMap);
        return modelAndView;
    }
}