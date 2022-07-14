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
	
	
	
	
	//for updateSts (2)
	public ShopVO(int id, int status) {
		this.id = id;
		this.status = status;
	}

	//for update (7)
	public ShopVO(int id, String name, String addr, String phon, String logo, String info, int allmin) {
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.phon = phon;
		this.logo = logo;
		this.info = info;
		this.allmin = allmin;
	}

	//for insert (9)
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
	
	
	
	
	
}


