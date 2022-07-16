package com.foodject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/host/orders")
public class HostOrdersController {
	
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
	public ModelAndView orders(ModelAndView mv) {
		mv.setViewName("host/index");
		mv.addObject("center", "host/orders/center" );
		return mv;
	}

	@RequestMapping("/list")
	public ModelAndView orderslist(ModelAndView mv) {
		mv.setViewName("host/index");
		mv.addObject("center", "host/orders/delivery" );
		return mv;
	}
}
