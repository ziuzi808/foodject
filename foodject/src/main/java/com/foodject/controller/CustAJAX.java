package com.foodject.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodject.biz.CustBiz;
import com.foodject.vo.CustVO;

@RestController
public class CustAJAX {

	@Autowired
	CustBiz custbiz;
	
	
	@RequestMapping("/checkid")
	public String custNum(String id) {
		String result = "";
		CustVO cust = null;
		
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

