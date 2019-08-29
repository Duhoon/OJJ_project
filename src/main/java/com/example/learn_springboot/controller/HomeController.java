package com.example.learn_springboot.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.learn_springboot.service.HomeService;

import org.apache.ibatis.annotations.ResultMap;
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

        Object resultMap = new HashMap<String, Object>();

        if (paramMap.get("isLogin") == null ) {
            paramMap.put("isLogin", "false");
        }

        if ("chkLogin".equals(action)) {
            resultMap = service.login(paramMap);
            action = "index";
            modelAndView.addObject("resultMap", resultMap);
        }
        else if ("chksubmit".equals(action)) {
            resultMap = service.submit(paramMap);
            modelAndView.addObject("resultMap", resultMap);
        }
        else if ( "logout".equals(action))
        {
            paramMap.clear();
            paramMap.put("isLogin", "false");
            modelAndView.addObject("resultMap", paramMap);
            action = "index";
        } 
        else {
            modelAndView.addObject("resultMap", paramMap);
        }
        modelAndView.setViewName("/home/" + action);

        return modelAndView;
    }

}