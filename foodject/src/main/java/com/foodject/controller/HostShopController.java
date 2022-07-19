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
@RequestMapping("/host/shop")
public class HostShopController {
	
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
	public ModelAndView shop(ModelAndView mv, HttpSession session ) {
		HostManagerVO manager = null;
		List<HostShopVO> list = null;
		manager = (HostManagerVO) session.getAttribute("loginshop");
		String mid = manager.getId();

	
				
		try {
			list = biz.getmid(mid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mv.addObject("slist", list );

		mv.setViewName("host/index");
		mv.addObject("center", "host/shop/center" );
		return mv;
	}

	@RequestMapping("/orderlist")
	public ModelAndView orderlist(ModelAndView mv) {
		mv.setViewName("host/index");
		mv.addObject("center", "host/shop/orderlist" );
		return mv;
	}

	@RequestMapping("/shopadd")
	public ModelAndView shopadd(ModelAndView mv) {
		mv.setViewName("host/index");
		mv.addObject("center", "host/shop/shopadd" );
		return mv;
	}

}
