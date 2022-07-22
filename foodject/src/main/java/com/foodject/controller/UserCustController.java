package com.foodject.controller;


import java.nio.file.Paths;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodject.biz.UserCustBiz;
import com.foodject.frame.Util;
import com.foodject.vo.HostManagerVO;
import com.foodject.vo.UserCustVO;



@Controller
@RequestMapping("/cust")
public class UserCustController {
	
	@Autowired
	UserCustBiz custbiz;


	
	@RequestMapping("/update")
	public String update(Model m, HttpSession session) {
		UserCustVO cust = (UserCustVO) session.getAttribute("loginid");
		try {
			cust = custbiz.get(cust.getId());
			m.addAttribute("c", cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "/user/cust/update");
		return "user/index";
	}
	

	@RequestMapping("")
	public ModelAndView cust(ModelAndView mv, HttpSession session) {
		UserCustVO cust = (UserCustVO) session.getAttribute("loginid");
		mv.setViewName("user/index");
		try {
			cust = custbiz.get(cust.getId());
			mv.addObject("c", cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("center", "/user/cust/mypage" );
		return mv;
	}
	
	
	@RequestMapping("/login")
	public String login(Model m, String msg) {
		if(msg != null && msg.equals("f")) {
			m.addAttribute("msg", "!! 아이디 또는 비밀번호를 확인해주세요");
		}
		m.addAttribute("center","user/cust/login");
		return "user/index";
	}
	
	@RequestMapping("/loginimpl")
	public String loginimpl(Model m, String id, String pwd, HttpSession session) {
		UserCustVO cust = null;
		try {
			cust = custbiz.get(id);
			if(cust == null) {
				throw new Exception();
			}if(cust.getPwd().equals(pwd)) {
				session.setAttribute("loginid", cust);
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			return "redirect:login?msg=f";
		}
		return "user/index";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "user/index";
	}

	@RequestMapping("/register")
	public String register(Model m) {
		return "user/cust/register";
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model m, UserCustVO cust, String img) {
		//이미지 경로설정
		String pimgpath = Paths.get(System.getProperty("user.dir"), "src", "main","resources","static","custimg").toString();
		//이미지파일 이름 저장
		String imgname = cust.getMf().getOriginalFilename();
		String[] splitname = imgname.split("[.]");
		String idname = cust.getId();
		String savename = idname + "." + splitname[splitname.length -1];		
		if(savename.equals(idname+".")) {
			cust.setImg("icon.jpg");			
		}else {
			cust.setImg(savename);
		}				
		
		try {
			custbiz.register(cust);
			Util.saveFile(cust, pimgpath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:/";
	}

	@RequestMapping("/updateimpl")
	public String updateimpl(Model m, UserCustVO cust, String img) {
		String pimgpath = Paths.get(System.getProperty("user.dir"), "src", "main","resources","static","custimg").toString();
		String imgname = cust.getMf().getOriginalFilename();
		String[] splitname = imgname.split("[.]");
		String idname = cust.getId();
		String savename = idname + "." + splitname[splitname.length -1];		
		if(savename.equals(idname+".")) {
			cust.setImg("icon.jpg");			
		}else {
			cust.setImg(savename);
		}				
		
		try {
			custbiz.modify(cust);
			Util.saveFile(cust, pimgpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/cust/update";
	}

	
	@RequestMapping("/delete")
	public String updatests(UserCustVO cust, HttpSession session, Model m) {
		try {
			custbiz.modifysts(cust);
			session.invalidate();
			System.out.println("work?");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/";
	}

	@RequestMapping("/orders")
	public String orders(Model m) {
		m.addAttribute("center","/user/cust/orders");
		return "user/index";
	}
	
	@RequestMapping("/cs")
	public String cs(Model m) {
		m.addAttribute("center","/user/cust/cs");
		return "user/index";
	}



}
