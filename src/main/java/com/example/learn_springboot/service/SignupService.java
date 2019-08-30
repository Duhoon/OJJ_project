package com.example.learn_springboot.service;

import java.util.HashMap;
import java.util.Map;


import com.example.learn_springboot.repository.ShareDao;
import com.example.learn_springboot.util.CommonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

	@Autowired
	private ShareDao dao;

	public int save(Object dataMap) {

        int obj_count=dao.getObject("signup.signup_chk", dataMap);
        

        if( obj_count>0){
            ((Map) dataMap).put("MSG", "중복아이디있음");
           
        }else{
            dao.saveObject("signup.save", dataMap) ;
            ((Map) dataMap).put("MSG", "저장완료");
        }
        return obj_count;
        

	
		// if (((Map)resultObject).get("PASSWORD").equals(((Map) dataMap).get("PASSWORD"))){
		// 	((Map)dataMap).put("isLogin", "true");
		// } else {
		// 	((Map)dataMap).put("isLogin", "false");
		// }
		// return resultObject;
	}

	
}
