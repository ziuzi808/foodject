package com.foodject.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodject.biz.HostManagerBiz;
import com.foodject.vo.HostManagerVO;

@RestController
@RequestMapping("/host")
public class HostMainAJAX {

	@Autowired
	HostManagerBiz mngbiz;
	
	
	
	
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
//	@RequestMapping("/registerimpl")
//	public String registerimpl(Model m, HostManagerVO manager, HttpSession session) {
//		
//		try {
//			mngbiz.register(manager);
//			session.setAttribute("loginshop", manager);
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		return "host/index";
//	}
	
	@RequestMapping("checkid")
	public String checkid(String id) {
		String result = "";
		HostManagerVO manager = null;
		
		if(id.equals("") || id == null) {
			return "1";
		}
		
		try {
			manager = mngbiz.get(id);
			if(manager == null) {
				result = "0";
			}else {
				result = "1";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	

}

