package com.foodject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop/main")
public class UserShopAJAX {
	
	
	@RequestMapping("/addCart")
	public void addCart(String uid, int mnid, int cnt) {
		System.out.println(uid+" "+mnid+" "+cnt);
	}
}