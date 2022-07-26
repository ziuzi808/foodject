package com.foodject.controller;


import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

import javax.servlet.http.HttpSession;

import com.foodject.biz.HostManagerBiz;
import com.foodject.vo.HostManagerVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/host/shop")
public class HostShopAJAX {

	@Autowired
	HostManagerBiz mbiz;
	
	@RequestMapping("checkbnum")
	public Object checkbnum(MultipartFile bnumcheck, HttpSession session) {
		HostManagerVO manager = (HostManagerVO) session.getAttribute("loginshop");
		System.out.println("mamager id : " + manager.getId());
		System.out.println("checkbnum.java ");
		if( bnumcheck == null ){
			System.out.println(bnumcheck);
			System.out.println("널입니다.");
			return "0";
		}else{
			System.out.println("널이 아닙니다.");
		}

		System.out.println("bnumcheck : " + bnumcheck.getOriginalFilename());
		byte [] data;

		String filePath = "";
		String savename = "";
		String[] splitname = bnumcheck.getOriginalFilename().split(".");
		savename = "bnumimg" +  "." + splitname[splitname.length -1];
		if (System.getProperty("os.name").toLowerCase().startsWith("win")){
			// 파일이 저장 안되시면 user.dir 뒤에 foodject를 지우거나 추가하세요!! 본인 경로에 맞게 설정해야됩니다 꼭 foodject가 아닐수도있어요
            filePath = Paths.get(System.getProperty("user.dir"), "src", "main","resources","static","foodject" ).toString() 
				+ savename;
        } else{
            filePath = "/root/apache-tomcat-8.5.27/webapps/ROOT/WEB-INF/classes/static/foodject/"+ savename;
        }

		
		// System.out.println("Os name : "+System.getProperty("os.name").toLowerCase().startsWith("win"));
        System.out.println("path Result : " + filePath);

		try {
			data = bnumcheck.getBytes();
			FileOutputStream fo =
					new FileOutputStream(filePath);
			fo.write(data);
			fo.close();


		} catch (IOException e) {
			
		}

		return "";
	}
	

}

