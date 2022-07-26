package com.foodject.vo;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HostShopVO {
	private String id;
	private String mid;
	private String name;
	private String bnum;
	private String addr;
	private String addrd;
	private String phon;
	private String logo;
	private String info;
	private Date date;
	private int allmin;
	private int status;
	private int marker;
	private MultipartFile mf;
	private MultipartFile bnumcheck;
	
	public HostShopVO(String name, String bnum, String addr, String addrd, String phon, String info, int allmin,
			MultipartFile mf) {
		this.name = name;
		this.bnum = bnum;
		this.addr = addr;
		this.addrd = addrd;
		this.phon = phon;
		this.info = info;
		this.allmin = allmin;
		this.mf = mf;
	}

	public HostShopVO(MultipartFile bnumcheck) {
		this.bnumcheck = bnumcheck;
	}




}


