package com.foodject.collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.CollectionBiz;
import com.foodject.vo.CollectionVO;

@SpringBootTest
class CollectionInsertTests {
	
	@Autowired
	CollectionBiz biz;
	
	@Test
	void contextLoads() {
		CollectionVO obj = new CollectionVO(0, "식사류 메인", 1);
		try {
			biz.register(obj);
			System.out.println("complete ...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
