// package com.example.learn_springboot.controller;

// import java.util.Map;

// import com.example.learn_springboot.service.SignupService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;

// @Controller
// public class SignupController{

//     @Autowired
//     private SignupService service;
//     private String action;
//     private Map<String, Object> paramMap;

//     @RequestMapping(value = "/log/{action}")
//     public String ActionMethod1(@PathVariable String action) {
//         String viewName = "/log/" + action;
//         return viewName;
//     }

//     @RequestMapping(value = "/log/save")
//     public ModelAndView ActionMethod2(@PathVariable String action, 
//     @RequestParam Map<String, Object> paramMap,
//     ModelAndView modelAndView) {

//         Object obj = service.save(paramMap);
//         String msg = (String)(((Map)obj).get("MSG"));

//         modelAndView.addObject("MSG", msg);
//         modelAndView.setViewName("/home/" + action);
//         return modelAndView;
//     }
       
// }