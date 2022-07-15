package com.foodject.menu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.MenuBiz;
import com.foodject.vo.MenuVO;

@SpringBootTest
class MenuSelectTests {
	
	@Autowired
	MenuBiz biz;
	
	@Test
	void contextLoads() {
		MenuVO obj = null;
		try {
			obj = biz.get(1);
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
