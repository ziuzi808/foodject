package com.foodject.collection;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.CollectionBiz;
import com.foodject.vo.CollectionVO;

@SpringBootTest
class CollectionSelectAllTests {
	
	@Autowired
	CollectionBiz biz;
	
	@Test
	void contextLoads() {
		List<CollectionVO> list = null;
		try {
			list = biz.get();
			for (CollectionVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
