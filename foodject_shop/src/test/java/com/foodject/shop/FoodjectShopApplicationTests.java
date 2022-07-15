package com.foodject.shop;

import java.nio.file.Paths;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FoodjectShopApplicationTests {

	@Test
	void contextLoads() {
		
		String pimgpath = Paths.get(System.getProperty("user.dir")).toString();
		
		System.out.println("pimgpath : " + pimgpath);
		
	}

}
