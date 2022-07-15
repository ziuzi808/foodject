package com.foodject.shop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {


	// 테스트 라인
	@RequestMapping("")
	public String test(Model m) {

		return "/test/index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "/test/login";
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "/test/index";
	}
	@RequestMapping("/loginimpl")
	public String loginimpl(HttpSession session,String id, String pwd) {
		session.setAttribute("loginid", id);
		return "/test/index";
	}
	@RequestMapping("/kakao")
	public String kakao() {
		return "/test/kakao";
	}
	@RequestMapping("/papago")
	public String papago() {
		return "/test/papago";
	}
	@RequestMapping("/go")
	public String go() {
		return "/test/go";
	}
	@RequestMapping("/websocket")
	public String websocket() {
		return "/test/websocket";
	}

}
