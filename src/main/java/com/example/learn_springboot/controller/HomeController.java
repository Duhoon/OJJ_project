package com.example.learn_springboot.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.learn_springboot.service.HomeService;
import com.example.learn_springboot.service.OrganizationService;

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
    
    @Autowired
    private OrganizationService or_service;

    // action == chkLogin
    @RequestMapping(value = "/home/{action}")
    public ModelAndView home(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelAndView) {

        Object resultMap = new HashMap<String, Object>();

        //paramMap에 로그인 추가
        if (paramMap.get("isLogin") == null ) {
            paramMap.put("isLogin", "false");
        }
        
        if ("chkLogin".equals(action)) {
            //service.login이용하여 database에서 id pw 값 비교
            resultMap = service.login(paramMap);
            //index로 다시 돌아오기
            action = "index";
            modelAndView.addObject("resultMap", resultMap);
        }
        //로그아웃 알고리즘 param을 초기화 -> isLogin값 false로 추가 -> index로 리턴
        else if ( "logout".equals(action))
        {
            paramMap.clear();
            paramMap.put("isLogin", "false");
            modelAndView.addObject("resultMap", paramMap);
            action = "index";
        } 
        else if("board".equals(action)){
            resultMap = or_service.getBoard(paramMap);
            modelAndView.addObject("resultMap", paramMap);
            modelAndView.addObject("dataMap", resultMap);
        }
        else {
            modelAndView.addObject("resultMap", paramMap);
        }
        modelAndView.setViewName("/home/" + action);

        return modelAndView;
    }

}