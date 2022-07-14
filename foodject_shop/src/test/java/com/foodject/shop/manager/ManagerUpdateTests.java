package com.foodject.shop.manager;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.shop.biz.ManagerBiz;
import com.foodject.shop.vo.ManagerVO;

@SpringBootTest
class ManagerUpdateTests {

	@Autowired
	ManagerBiz biz;
	@Test
	void contextLoads() {
		String day = "2022-08-16";
		Date d = Date.valueOf(day);
		ManagerVO c = new ManagerVO("mid02","pwd02","park","em02",d,"phon02");
		try {
			biz.modify(c);
			System.out.println("Modify OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
