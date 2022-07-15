package com.foodject.cust;

import java.nio.file.Paths;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.CustBiz;
import com.foodject.vo.CustVO;

@SpringBootTest
class CustSelectTest {


	
	@Test
	void contextLoads() {
		CustVO cust = null;
		String pimgpath = Paths.get(System.getProperty("user.dir"), "src", "main","resources","static", "custimg").toString();
		System.out.println(pimgpath);

		String imgpath = "foodject.jpg";
		String[] splits = imgpath.split("[.]");
		System.out.println(Arrays.toString(splits));
		System.out.println("test");
		System.out.println("id." +splits[1]);
		
	
	}
}
