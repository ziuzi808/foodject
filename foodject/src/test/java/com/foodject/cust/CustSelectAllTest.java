package com.foodject.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.CustBiz;
import com.foodject.vo.CustVO;

@SpringBootTest
class CustSelectAllTest {
	
	@Autowired
	CustBiz biz;

	@Test
	void contextLoads() {
		List<CustVO> list = null;
		try {
			list = biz.get();
			for (CustVO custVO : list) {
				System.out.println(custVO);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
