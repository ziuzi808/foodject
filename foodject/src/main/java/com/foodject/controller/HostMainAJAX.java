package com.foodject.controller;


import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/host")
public class HostMainAJAX {

//	@Autowired
//	CustBiz custbiz;
	
	
	@RequestMapping("mainNum")
	public String mainNum(Model m, HttpSession session,  int cartid, int num) {
		String result = "";
//		CartVO cv = null;
//		CartVO cart = new CartVO(cartid, num);
//		try {
//			cartbiz.modify(cart);
//			cv = cartbiz.get(cartid);
//			result = Integer.toString(cv.getPrice());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		return result;
	}
	

}

