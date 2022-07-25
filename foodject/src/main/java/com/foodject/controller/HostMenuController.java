package com.foodject.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodject.biz.HostShopBiz;
import com.foodject.vo.HostManagerVO;
import com.foodject.vo.HostShopVO;

@Controller
@RequestMapping("/host/menu")
public class HostMenuController {
	
	@Autowired
	HostShopBiz biz;
	
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
	public String orders(Model m) {
		m.addAttribute("center", "host/menu/center");
		return "host/index";
	}

	@RequestMapping("/setting")
	public ModelAndView setting(ModelAndView mv, HttpSession session ) {
		HostManagerVO manager = null;
		List<HostShopVO> list = null;
		if( session.getAttribute("loginshop") == null ){
			mv.setViewName("redirect:/host");
			return mv;
		}
		manager = (HostManagerVO) session.getAttribute("loginshop");
		String mid = manager.getId();
		try {
			list = biz.getmid(mid);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if( list.size() != 0 ){
			mv.addObject("slist", list );
		}
		mv.setViewName("host/index");
		mv.addObject("center", "host/menu/setting" );
		return mv;
	}
	@RequestMapping("collection")
	public String collection(Model m) {
		m.addAttribute("center", "host/menu/collection");
		return "host/index";
	}
	
	
	
}
