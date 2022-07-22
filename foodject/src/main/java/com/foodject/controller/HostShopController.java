package com.foodject.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.foodject.biz.HostShopBiz;
import com.foodject.vo.HostManagerVO;
import com.foodject.vo.HostShopVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/host/shop")
public class HostShopController {
	
	@Autowired
	HostShopBiz biz;


	@RequestMapping("")
	public ModelAndView shop(ModelAndView mv, HttpSession session ) {
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
		mv.setViewName("/host/index");
		mv.addObject("center", "/host/shop/center" );
		return mv;
	}
	@RequestMapping("/shopregister")
	public ModelAndView register(ModelAndView mv) {
		mv.setViewName("/host/index");
		mv.addObject("center", "/host/shop/register" );
		return mv;
	}

	@RequestMapping("/shopregisterimpl")
	public ModelAndView registerimpl(ModelAndView mv, HostShopVO obj, HttpSession session) {
		HostManagerVO manager = null;
		manager = (HostManagerVO) session.getAttribute("loginshop");

		obj.setMid(manager.getId());
		obj.setStatus(1);
		obj.setLogo("icon.jpg");
		// ?????.jpg

		try {
			biz.register(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}

		mv.setViewName("redirect:/host/shop");
		mv.addObject("center", "/host/shop/center" );

		return mv;
	}


	@RequestMapping("/orderlist")
	public ModelAndView orderlist(ModelAndView mv) {
		mv.setViewName("/host/index");
		mv.addObject("center", "/host/shop/orderlist" );
		return mv;
	}

	@RequestMapping("/shopadd")
	public ModelAndView shopadd(ModelAndView mv) {
		mv.setViewName("/host/index");
		mv.addObject("center", "/host/shop/shopadd" );
		return mv;
	}
}
