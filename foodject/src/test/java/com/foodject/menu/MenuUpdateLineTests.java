package com.foodject.menu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.MenuBiz;
import com.foodject.vo.MenuVO;

@SpringBootTest
class MenuUpdateLineTests {
	
	@Autowired
	MenuBiz biz;
	
	@Test
	void contextLoads() {
		int id = 20;
		MenuVO obj = new MenuVO(id, 2);
		try {
			biz.modifyLine(obj);
			System.out.println("complete ...");
			System.out.println(biz.get(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
