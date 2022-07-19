package com.foodject.marker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.UserMarkerBiz;
import com.foodject.vo.MarkerVO;

@SpringBootTest
class MarkerInsertTests {
	
	@Autowired
	UserMarkerBiz biz;
	
	@Test
	void contextLoads() {
		int id = 2;
		MarkerVO obj = new MarkerVO(id, 36.8689974, 128.6017305);
		try {
			biz.modify(obj);

			obj = biz.get(id);
			System.out.println(obj);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
