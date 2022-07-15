package com.foodject.shop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.ShopBiz;
import com.foodject.vo.ShopVO;

@SpringBootTest
class ShopDeleteTests {
	
	@Autowired
	ShopBiz biz;
	
	@Test
	void contextLoads() {
		int id = 3;
		ShopVO obj = null;
		try {
			biz.remove(id);
			obj = biz.get(id);
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
