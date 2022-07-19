package com.foodject.marker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.UserMarkerBiz;
import com.foodject.vo.MarkerVO;

@SpringBootTest
class MarkerSelelctTests {
	
	@Autowired
	UserMarkerBiz biz;
	
	@Test
	void contextLoads() {
		MarkerVO obj = null;
		try {
			obj = biz.get(1);
			
			System.out.println(obj);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
