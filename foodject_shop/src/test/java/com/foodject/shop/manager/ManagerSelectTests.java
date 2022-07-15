package com.foodject.shop.manager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.shop.biz.ManagerBiz;
import com.foodject.shop.vo.ManagerVO;

@SpringBootTest
class ManagerSelectTests {
	@Autowired
	ManagerBiz biz;
	
	
	@Test
	void contextLoads() {
		ManagerVO manager = null;
		
		try {
			manager = biz.get("mid02");
			
			System.out.println("Select OK" + manager.getId());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println(manager);
	}

}
