package com.foodject;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.HostShopBiz;
import com.foodject.vo.HostShopVO;

@SpringBootTest
class FoodjectApplicationTests {

	@Autowired
	HostShopBiz biz;

	@Test
	void contextLoads() {
		
		System.out.println("user.dir : "+System.getProperty("user.dir"));
		System.out.println("uos.name : "+System.getProperty("os.name").toLowerCase().startsWith("win"));
		
	}

}
