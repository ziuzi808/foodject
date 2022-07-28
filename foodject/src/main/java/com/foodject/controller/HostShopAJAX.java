package com.foodject.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Iterator;

import javax.servlet.http.HttpSession;

import com.foodject.biz.HostManagerBiz;
import com.foodject.restapi.NaverORC;
import com.foodject.vo.HostManagerVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@RestController
@RequestMapping("/host/shop")
public class HostShopAJAX {

	@Autowired
	HostManagerBiz mbiz;
	@Autowired
	NaverORC orc;
	
	@RequestMapping("checkbnum")
	public Object checkbnum(MultipartHttpServletRequest  mfsr, HttpSession session) {
		// HostManagerVO manager = (HostManagerVO) session.getAttribute("loginshop");
		Object obj = null;
		if( mfsr == null ){
			System.out.println(mfsr);

			return "0";
		}
		MultipartFile bnumcheck = null;
		String filename = "";
		Iterator<String> it = mfsr.getFileNames();
		while( it.hasNext() ){
			filename = it.next();
			bnumcheck = mfsr.getFile(filename);
		}
		byte [] data;

		String filePath = "";
		String savename = bnumcheck.getOriginalFilename();
		
		String[] splitname = savename.split("[.]");


		System.out.println(splitname.length);
		savename = "bnumimg" +  "." + splitname[splitname.length - 1];
		if (System.getProperty("os.name").toLowerCase().startsWith("win")){
			// 파일이 저장 안되시면 user.dir 뒤에 foodject를 지우거나 추가하세요!! 본인 경로에 맞게 설정해야됩니다 꼭 foodject가 아닐수도있어요
            filePath = Paths.get(System.getProperty("user.dir"), "foodject","src", "main","resources","static","foodject" ).toString() 
				+File.separator+ savename;
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
			obj = orc.checkNaverORC(filePath);
			

		} catch (IOException e) {
			
		}

		return obj;
	}
	

}

