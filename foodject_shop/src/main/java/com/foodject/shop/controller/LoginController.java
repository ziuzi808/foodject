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
@RequestMapping("/login")
public class LoginController {
	@Autowired
	ManagerBiz biz;
	
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
		mv.setViewName("login");
//		mv.addObject("center", "login" );
		return mv;
	}
	@RequestMapping("/loginimpl")
	public String loginimpl(Model m, String id, String pwd, HttpSession session) {
		ManagerVO manager = null;
		try {
			System.out.println(id);
			manager = biz.get(id);
			System.out.println("managergetid" + manager.getId());
			if(manager.getId() == null) {
				System.out.println("getid");
				throw new Exception();
			}
			System.out.println("manager");
			if (manager.getPwd().equals(pwd)) {
				session.setAttribute("loginshop", manager);
				System.out.println("session");
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("redirect");
			return "redirect:/login"; //? 뒤에값을 서버프로그램에 전송한다
		}
		return "index";
	}

}
