package com.foodject.hostShop;

import java.util.List;

import com.foodject.biz.HostCollectionBiz;
import com.foodject.vo.HostCollectionVO;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CartSelectTests {

	@Autowired
	HostCollectionBiz biz;
	
	@Test
	void contextLoads() {
		List<HostCollectionVO> list = null;
		try {
			list = biz.getcol(1);
			for (HostCollectionVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


