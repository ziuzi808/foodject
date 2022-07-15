package com.foodject.menu;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.MenuBiz;
import com.foodject.vo.MenuVO;

@SpringBootTest
class MenuSelectAllTests {
	
	@Autowired
	MenuBiz biz;
	
	@Test
	void contextLoads() {
		List<MenuVO> list = null;
		try {
			list = biz.get();
			for (MenuVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
