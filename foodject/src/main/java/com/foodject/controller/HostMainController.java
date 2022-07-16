package com.foodject.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodject.biz.HostManagerBiz;
import com.foodject.vo.HostManagerVO;

@Controller
@RequestMapping("/host")
public class HostMainController {
	
	@Autowired
	HostManagerBiz mbiz;
	
	public void mainProduct(Model m) {
//		List<ProductVO> plist = null;
//		String pimgpath = Paths.get(System.getProperty("user.dir"), "src", "main","resources","static","img", "product_img").toString();
//		System.out.println("imgpath : " +  pimgpath);
//		try {	
//			plist = mainbiz.get();
//			m.addAttribute("plist", plist);
//			m.addAttribute("imgpath", pimgpath);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("host/index");
		mv.addObject("center", "host/center");
		return mv;
	}
	
	@RequestMapping("/sample")
	public String sample(Model m) {
		mainProduct(m);
		return "host/sample";
	}
	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv) {
		mv.setViewName("host/register");
		return mv;
	}
	@RequestMapping("/registerimpl")
	public String registerimpl(Model m, HostManagerVO manager, HttpSession session) {
		System.out.println("plz2");
		try {
			mbiz.register(manager);
			session.setAttribute("loginshop", manager);
		} catch (Exception e) {
			System.out.println("plzbe");
			e.printStackTrace();
		}
		return "host/index";
	}

}
