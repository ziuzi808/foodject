package com.foodject.shop.manager;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.shop.biz.ManagerBiz;
import com.foodject.shop.vo.ManagerVO;

@SpringBootTest
class ManagerInsertTests {

	@Autowired
	ManagerBiz biz;
	@Test
	void contextLoads() {
		String day = "2022-10-16";
		Date d = Date.valueOf(day);
		
		ManagerVO c = new ManagerVO("mid02", "pwd02","kim", "em02", d, "phon02");
		try {
			biz.register(c);
			System.out.println("Registered OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
