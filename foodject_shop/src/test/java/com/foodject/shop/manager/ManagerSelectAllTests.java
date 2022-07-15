package com.foodject.shop.manager;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.shop.biz.ManagerBiz;
import com.foodject.shop.vo.ManagerVO;

@SpringBootTest
class ManagerSelectAllTests {
	@Autowired
	ManagerBiz biz;
	@Test
	void contextLoads() {
		List<ManagerVO> list = null;
		try {
			list = biz .get();
			for (ManagerVO managerVO : list) {
				System.out.println(managerVO);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
