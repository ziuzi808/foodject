package com.foodject.shop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.ShopBiz;
import com.foodject.vo.ShopVO;

@SpringBootTest
class ShopSelectTests {
	
	@Autowired
	ShopBiz biz;
	
	@Test
	void contextLoads() {
		ShopVO obj = null;
		try {
			obj = biz.get(1);
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
