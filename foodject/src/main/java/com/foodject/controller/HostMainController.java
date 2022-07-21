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
		
		try {
			mbiz.register(manager);
			session.setAttribute("loginshop", manager);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return "host/index";
	}
//	@RequestMapping("/mypage")
//	public ModelAndView mypage(ModelAndView mv) {
//		mv.setViewName("host/mypage");
//		return mv;
//	}
	@RequestMapping("/mypage")
	public String mypage(Model m, HttpSession session) {
		HostManagerVO mng = (HostManagerVO) session.getAttribute("loginshop");
		try {
			mng= mbiz.get(mng.getId());
			m.addAttribute("m", mng);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "host/mypage";
	}
	@RequestMapping("/update")
	public String update(Model m, HostManagerVO obj) {
		try {
			mbiz.modify(obj);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:mypage?id=" + obj.getId();
	}
	@RequestMapping("/delete")
	public String updatests(Model m, HostManagerVO obj, HttpSession session ) {
		try {
			mbiz.modifysts(obj);
			session.invalidate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "host/index";
	}
	@RequestMapping("/findpwd")
	public ModelAndView findpwd(ModelAndView mv) {
		mv.setViewName("host/findpwd");
		return mv;
	}
}
