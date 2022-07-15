package com.foodject.shop;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.ShopBiz;
import com.foodject.vo.ShopVO;

@SpringBootTest
class ShopSelectStatusTests {
	
	@Autowired
	ShopBiz biz;
	
	@Test
	void contextLoads() {
		List<ShopVO> list = null;
		try {
			list = biz.getSts(0);
			for (ShopVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
