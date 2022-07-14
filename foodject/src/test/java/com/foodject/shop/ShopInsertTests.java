package com.foodject.shop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.ShopBiz;
import com.foodject.vo.ShopVO;

@SpringBootTest
class ShopInsertTests {
	
	@Autowired
	ShopBiz biz;
	
	@Test
	void contextLoads() {
		ShopVO obj = new ShopVO("mid01", "취팔선", "9023-21390293-12", "ㅇㅇ시 ㅁㅁ동 123","01012340000", "cps.jpg", "중화요리 전문점 취팔선입니다. 5000원 이상 주문 가능", null,5000);
		try {
			biz.register(obj);
			System.out.println("complete ...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
