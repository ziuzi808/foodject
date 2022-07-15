package com.foodject.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.CustBiz;

@SpringBootTest
class CustDeleteTest {
	
	@Autowired
	CustBiz biz;

	@Test
	void contextLoads() {
		try {
			biz.remove("id99");
			System.out.println("deteted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
