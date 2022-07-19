package com.foodject.marker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.UserMarkerBiz;
import com.foodject.vo.MarkerVO;

@SpringBootTest
class MarkerUpdateTests {
	
	@Autowired
	UserMarkerBiz biz;
	
	@Test
	void contextLoads() {
		
		MarkerVO obj = new MarkerVO(36.8689974, 128.6017305);
		try {
			biz.register(obj);

			obj = biz.get(5);
			System.out.println(obj);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
