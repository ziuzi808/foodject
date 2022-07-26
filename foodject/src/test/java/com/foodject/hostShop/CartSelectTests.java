package com.foodject.hostShop;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.HostMenuBiz;
import com.foodject.vo.HostMenuVO;

@SpringBootTest
class CartSelectTests {

	@Autowired
	HostMenuBiz biz;
	
	@Test
	void contextLoads() {
		List<HostMenuVO> list = null;
		try {
			list = biz.getcol(1);
			for (HostMenuVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


