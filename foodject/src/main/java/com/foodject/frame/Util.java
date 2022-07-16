package com.foodject.frame;

import java.io.FileOutputStream;
import java.io.IOException;

import com.foodject.vo.UserCustVO;


public class Util {

	public static void saveFile(UserCustVO cust, String custdir) {
		byte [] data;
		String img = cust.getMf().getOriginalFilename();

		String[] splitname = img.split("[.]");
		String idname = cust.getId();
		String savename = idname + "." + splitname[splitname.length -1];

		try {
			data = cust.getMf().getBytes();
			FileOutputStream fo =
					new FileOutputStream(custdir+ "/" + savename);
			fo.write(data);
			fo.close();
		} catch (IOException e) {
			
		}
		


	}

}
