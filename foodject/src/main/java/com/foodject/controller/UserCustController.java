package com.foodject.controller;


import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodject.biz.UserCustBiz;
import com.foodject.frame.Util;
import com.foodject.vo.UserCustVO;



@Controller
@RequestMapping("/cust")
public class UserCustController {
	
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
	
	
	@Autowired
	UserCustBiz custbiz;


	@RequestMapping("")
	public ModelAndView cust(ModelAndView mv) {
		mv.setViewName("user/index");
		mv.addObject("center", "/user/cust/center" );
		return mv;
	}
	
	@RequestMapping("/login")
	public String login(Model m) {
		return "user/cust/login";
	}

	@RequestMapping("/register")
	public String register(Model m) {
		return "user/cust/register";
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model m, UserCustVO cust) {
		//이미지 경로설정
		System.out.println("ddd");
		String pimgpath = Paths.get(System.getProperty("user.dir"), "src", "main","resources","static","custimg").toString();
		//이미지파일 이름 저장
		String imgname = cust.getMf().getOriginalFilename();
		String[] splitname = imgname.split("[.]");
		String idname = cust.getId();
		String savename = idname + "." + splitname[splitname.length -1];
		cust.setImg(savename);		
		
		try {
			custbiz.register(cust);
			Util.saveFile(cust, pimgpath);
			System.out.println("check");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "user/cust/login";
	}

	
//	String pimgpath = Paths.get(System.getProperty("user.dir"), "src", "main","resources","static", "custimg").toString();
//	System.out.println(pimgpath);
//	String imgpath = "foodject.jpg";
//	String[] splits = imgpath.split("[.]");
//	System.out.println(Arrays.toString(splits));
//	System.out.println("test");
//	System.out.println("id." +splits[1]);


	

}
