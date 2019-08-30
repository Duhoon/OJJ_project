package com.example.learn_springboot.service;

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

		Object resultObject = dao.getList(sqlMapId, dataMap);
		// ID값을 찾을수 없다
		if (((Map) resultObject) == null) {
			((Map) resultObject).put("isLogin", "false");
		}
		// PASSWORD 값이 같다
		else if (((Map) resultObject).get("PASSWORD").equals(((Map) dataMap).get("PASSWORD"))) {
			((Map) resultObject).put("isLogin", "true");
		}
		// PASSWORD 값이 다르다
		else {
			((Map) resultObject).put("isLogin", "false");
		}
		return resultObject;
	}

}
