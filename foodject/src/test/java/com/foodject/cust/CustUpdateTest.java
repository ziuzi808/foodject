package com.foodject.cust;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodject.biz.CustBiz;
import com.foodject.vo.CustVO;

@SpringBootTest
class CustUpdateTest {
	
	@Autowired
	CustBiz biz;

	@Test
	void contextLoads() {
		String dateStr = "2000년 01월 01일 01시 01분 01초";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		Date date = null;
		try {
			date = formatter.parse(dateStr);
			System.out.println(date);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		
		CustVO cust = new CustVO("id99","pwd990","nick990","name99",date,"010-99-990","JEJU",1,"img99");
		try {
			biz.modify(cust);
			System.out.println("updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
