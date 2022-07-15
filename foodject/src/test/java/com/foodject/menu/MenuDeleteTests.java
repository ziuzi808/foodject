package com.foodject.menu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.MenuBiz;

@SpringBootTest
class MenuDeleteTests {
	
	@Autowired
	MenuBiz biz;
	
	@Test
	void contextLoads() {
		int id = 20;
		try {
			biz.remove(id);
			System.out.println("complete ...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
