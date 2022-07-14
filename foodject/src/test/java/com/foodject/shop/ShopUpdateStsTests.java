package com.foodject.shop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.ShopBiz;
import com.foodject.vo.ShopVO;

@SpringBootTest
class ShopUpdateStsTests {
	
	@Autowired
	ShopBiz biz;
	
	@Test
	void contextLoads() {
		ShopVO obj = new ShopVO(4, 0);
		try {
			biz.remove(obj);
			System.out.println("complete ...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
