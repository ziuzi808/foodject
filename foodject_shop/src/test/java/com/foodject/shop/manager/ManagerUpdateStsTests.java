package com.foodject.shop.manager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.shop.biz.ManagerBiz;
import com.foodject.shop.vo.ManagerVO;

@SpringBootTest
class ManagerUpdateStsTests {

	@Autowired
	ManagerBiz biz;
	@Test
	void contextLoads() {
		ManagerVO c = new ManagerVO("mid02",1);
		try {
			biz.modifysts(c);
			System.out.println("Modify OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
