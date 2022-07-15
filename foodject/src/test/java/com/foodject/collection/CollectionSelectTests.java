package com.foodject.collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.CollectionBiz;
import com.foodject.vo.CollectionVO;

@SpringBootTest
class CollectionSelectTests {
	
	@Autowired
	CollectionBiz biz;
	
	@Test
	void contextLoads() {
		CollectionVO obj = null;
		try {
			obj = biz.get(1);
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
