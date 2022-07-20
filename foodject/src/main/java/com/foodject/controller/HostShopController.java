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
		System.out.println("list : " + list);
		System.out.println("list size " + list.size() );
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
		String imgname = obj.getMf().getOriginalFilename();	
		obj.setMid(manager.getId());
		obj.setStatus(1);
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
