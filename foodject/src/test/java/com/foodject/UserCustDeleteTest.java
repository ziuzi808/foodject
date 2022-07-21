package com.foodject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.UserCustBiz;
import com.foodject.vo.UserCustVO;

@SpringBootTest
class UserCustDeleteTest {

	@Autowired
	UserCustBiz biz;

	@Test
	void contextLoads() {
		UserCustVO c = new UserCustVO("id08",1);
		try {
			biz.modifysts(c);
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
