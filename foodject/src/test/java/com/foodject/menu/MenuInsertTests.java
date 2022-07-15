package com.foodject.menu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.MenuBiz;
import com.foodject.vo.MenuVO;

@SpringBootTest
class MenuInsertTests {
	
	@Autowired
	MenuBiz biz;
	
	@Test
	void contextLoads() {
		MenuVO obj = new MenuVO(3, 3, 8, "짜장면", 4500, 1);
		try {
			biz.register(obj);
			System.out.println("complete ...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
