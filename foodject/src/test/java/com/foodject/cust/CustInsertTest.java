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
class CustInsertTest {
	
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
		
		
//id=id01, pwd=pwd01, nick=nick01, name=name01, birth=Sat Jan 01 00:00:00 KST 2000, date=Thu Jul 14 00:00:00 KST 2022, phon=01012345670, addr=Seoul, status=1, img=img1.jpg
		CustVO cust = new CustVO("id99","pwd99","nick99","name99",date,"0109999","JEJU",1,"img99");
		try {
			biz.register(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
