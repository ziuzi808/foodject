package com.foodject.vo;

import java.util.Date;

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
public class ShopVO {
	private int id;
	private String mid;
	private String name;
	private String bnum;
	private String addr;
	private String phon;
	private String logo;
	private String info;
	private Date date;
	private int allmin;
	private int status;
	
	
	public ShopVO(String mid, String name, String bnum, String addr, String phon, String logo, String info, Date date,
			int allmin) {
		this.mid = mid;
		this.name = name;
		this.bnum = bnum;
		this.addr = addr;
		this.phon = phon;
		this.logo = logo;
		this.info = info;
		this.date = date;
		this.allmin = allmin;
	}

	//for update
	public ShopVO(int id, String mid, String name, String addr, String phon, String logo, String info, int allmin) {
		this.id = id;
		this.mid = mid;
		this.name = name;
		this.addr = addr;
		this.phon = phon;
		this.logo = logo;
		this.info = info;
		this.allmin = allmin;
	}
	
	//for updateSts
	public ShopVO(int id, int status) {
		this.id = id;
		this.status = status;
	}
	

	
}


