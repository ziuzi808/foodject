package com.foodject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodject.biz.UserCustBiz;
import com.foodject.vo.UserCustVO;

@RestController
public class UserCustAJAX {

	@Autowired
	UserCustBiz custbiz;
	
	
	@RequestMapping("/checkid")
	public String custNum(String id) {
		String result = "";
		UserCustVO cust = null;
		
		if(id.equals("")|| id==null) {
			return "1";
		}
		
		try {
			cust = custbiz.get(id);
			if(cust==null) {
				result="0";
			}else {
				result="1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		return result;
	}
	

}

