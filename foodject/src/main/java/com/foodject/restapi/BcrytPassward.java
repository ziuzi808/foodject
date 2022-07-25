package com.foodject.restapi;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class BcrytPassward {  


    public String hashPassward(String pwd){
        String result = ""; 
	
        // 디비에 저장할 비밀번호 암호화
        result = BCrypt.hashpw(pwd, BCrypt.gensalt());

        return result;
    }

    // dbpwd = db에 저장되어있는 pwd, inputpwd = 사용자에게 입력받은 pwd
    public boolean checkPassward(String dbpwd, String inputpwd){

	
        String encrypted = BCrypt.hashpw(dbpwd, BCrypt.gensalt());
    if( BCrypt.checkpw( inputpwd, encrypted) ){
        return true;
    }
    return false;
}
}
