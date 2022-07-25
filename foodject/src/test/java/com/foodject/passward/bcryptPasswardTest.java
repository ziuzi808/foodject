package com.foodject.passward;

import com.foodject.biz.HostShopBiz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;

@SpringBootTest
class bcryptPasswardTest {

	@Autowired
	HostShopBiz biz;
	
	@Test
	void contextLoads() {
			System.out.println("bcryptPasswardTest");
			String password = "32434d";
			String dbpwd = "";
			// 디비에 저장할 비밀번호 암호화

			String encrypted = BCrypt.hashpw(password, BCrypt.gensalt());
			System.out.println("BCrypt.gensalt() : " + BCrypt.gensalt());
			System.out.println("encrypted : " + encrypted);

			dbpwd = encrypted;
			

			// 로그인시 디비에 저장된 암호화된 문자열과 사용자가 입력한 비밀번호로 checkpw 검증
			System.out.println(BCrypt.checkpw(password, encrypted)); // true
			System.out.println(BCrypt.checkpw(password + "1", encrypted)); // false

			System.out.println("테스팅 중입니다");

			// 디비에 저장할 비밀번호 암호화
			System.out.println("testing data-----------------------------------------------");
			String encrypted1 = BCrypt.hashpw(password, BCrypt.gensalt());
			System.out.println("BCrypt.gensalt() : " + BCrypt.gensalt());
			System.out.println("encrypted1 : " + encrypted1);

			
			String pwd1 = "$2a$10$8Cg73mPSSid/z4YrnXCCyO.kRNBiDElKf6Ux3SkpyuVK6x/RTjXeW";
			// 로그인시 디비에 저장된 암호화된 문자열과 사용자가 입력한 비밀번호로 checkpw 검증
			System.out.println(BCrypt.checkpw(password, dbpwd)); // true
			System.out.println(BCrypt.checkpw(password + "1", dbpwd)); // false



		
	}

}
