package com.example.learn_springboot.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.learn_springboot.service.HomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private HomeService service;

    // action == chkLogin
    @RequestMapping(value = "/home/{action}")
    public ModelAndView home(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelAndView) {

        if (paramMap.get("isLogin") == null) {
            paramMap.put("isLogin", false);
        }
        Object resultMap = new HashMap<String, Object>();

        if ("chkLogin".equals(action)) {
            resultMap = service.login(paramMap);
            action = "index";
        }

        if ("chksubmit".equals(action)) {
            resultMap = service.submit(paramMap);
        }

        modelAndView.addObject("paramMap", paramMap);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/home/" + action);

        return modelAndView;
    }

}