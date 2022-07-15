package com.foodject.collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.CollectionBiz;

@SpringBootTest
class CollectionDeleteTests {
	
	@Autowired
	CollectionBiz biz;
	
	@Test
	void contextLoads() {
		int id = 8;
		try {
			biz.remove(id);
			System.out.println("complete ...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
