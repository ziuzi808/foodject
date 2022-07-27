package com.foodject.useropt;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.UserOptBiz;
import com.foodject.vo.UserOptVO;

@SpringBootTest
class UserSelelctByShopTests {
	
	@Autowired
	UserOptBiz biz;
	
	@Test
	void contextLoads() {
		int sid = 1;
		List<UserOptVO> list = null;
		try {
			list = biz.get_byShop(sid);
			for (UserOptVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
