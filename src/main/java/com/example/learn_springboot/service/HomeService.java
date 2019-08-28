package com.example.learn_springboot.service;

import java.util.HashMap;
import java.util.Map;

import com.example.learn_springboot.repository.HomeRepository;
import com.example.learn_springboot.repository.ShareDao;
import com.example.learn_springboot.util.CommonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

	@Autowired
	private HomeRepository repository;

	@Autowired
	private ShareDao dao;

	@Autowired
	private CommonUtil commonUtil;


	public Object login(Object dataMap) {
		String sqlMapId = "home.search";

		Object resultObject = dao.getObject(sqlMapId, dataMap);
		if (((Map)resultObject).get("PASSWORD").equals(((Map) dataMap).get("PASSWORD"))){
			((Map)dataMap).put("isLogin", "true");
		} else {
			((Map)dataMap).put("isLogin", "false");
		}
		return resultObject;
	}

	
}
