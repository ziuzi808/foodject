package com.foodject.collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.CollectionBiz;
import com.foodject.vo.CollectionVO;

@SpringBootTest
class CollectionUpdateLineTests {
	
	@Autowired
	CollectionBiz biz;
	
	@Test
	void contextLoads() {
		int id = 8;
		CollectionVO obj = new CollectionVO(id, 1);
		try {
			biz.modifyLine(obj);
			System.out.println("complete ...");
			System.out.println(biz.get(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
