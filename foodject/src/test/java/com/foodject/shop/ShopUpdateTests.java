package com.foodject.shop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.ShopBiz;
import com.foodject.vo.ShopVO;

@SpringBootTest
class ShopUpdateTests {
	
	@Autowired
	ShopBiz biz;
	
	@Test
	void contextLoads() {
		ShopVO obj = new ShopVO(3, "취팔선", "ㅇㅇ시 ㅁㅁ동 12","01012340001", "cps.jpg", "중화요리 전문점 취팔선입니다. 5000원 이상 주문 가능", 5000);
		try {
			biz.modify(obj);
			System.out.println("complete ...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
