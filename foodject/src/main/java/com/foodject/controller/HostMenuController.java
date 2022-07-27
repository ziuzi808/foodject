package com.foodject.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodject.biz.HostCollectionBiz;
import com.foodject.biz.HostMenuBiz;
import com.foodject.biz.HostShopBiz;
import com.foodject.vo.HostCollectionVO;
import com.foodject.vo.HostManagerVO;
import com.foodject.vo.HostMenuVO;
import com.foodject.vo.HostShopVO;
import com.foodject.vo.UserCollectionVO;
import com.foodject.vo.UserMenuVO;
import com.foodject.vo.UserShopVO;

@Controller
@RequestMapping("/host/menu")
public class HostMenuController {
	
	@Autowired
	HostShopBiz biz;
	HostCollectionBiz cbiz;
	HostMenuBiz mbiz;
	
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
	@RequestMapping("/col")	
	public String col(Model m, int sid) {
		List<HostMenuVO> mlist = null;
		List<HostCollectionVO> clist = null;
		HostShopVO obj = null;
		
		try {
			obj = biz.get(sid);
			m.addAttribute("shop",obj);
			clist = cbiz.get_byShop(sid);
			m.addAttribute("clist",clist);
			mlist = mbiz.get_byShop(sid);
			m.addAttribute("mlist",mlist);
			m.addAttribute("center","/host/menu/setting");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "host/index";
	}
	@RequestMapping("collection")
	public String collection(Model m) {
		m.addAttribute("center", "host/menu/collection");
		return "host/index";
	}
	
	
	
}
