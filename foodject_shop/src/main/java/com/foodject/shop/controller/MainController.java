package com.foodject.shop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodject.shop.biz.ManagerBiz;
import com.foodject.shop.vo.ManagerVO;

@Controller
public class MainController {
	
	@Autowired
	ManagerBiz mbiz;
	
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

	@RequestMapping("/")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("/index");
		return mv;
	}
	
	@RequestMapping("/sample")
	public String sample(Model m) {
		mainProduct(m);
		return "/sample";
	}
	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv) {
		mv.setViewName("register");
		return mv;
	}
	@RequestMapping("/registerimpl")
	public String registerimpl(Model m, ManagerVO manager, HttpSession session) {
		try {
			mbiz.register(manager);
			session.setAttribute("loginshop", manager);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}

}
