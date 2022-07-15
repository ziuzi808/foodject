package com.foodject.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.CustBiz;
import com.foodject.vo.CustVO;

@SpringBootTest
class CustSelectTest {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustVO cust = null;
		try {
			cust = biz.get("id01");
			System.out.println(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
