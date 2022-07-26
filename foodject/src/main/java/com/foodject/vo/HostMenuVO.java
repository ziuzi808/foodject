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
public class HostMenuVO {
	private int id;
	private int sid;
	private int cid;
	private int collid;
	private String name;
	private int price;
	private int line;
	private Date date;
	
	private String category;
	private String cname;
	
	
	
	
	//for update(4)
	public HostMenuVO(int id, int collid, String name, int price) {
		this.id = id;
		this.collid = collid;
		this.name = name;
		this.price = price;
	}
	
	//for updateLine(2)
	public HostMenuVO(int id, int line) {
		this.id = id;
		this.line = line;
	}

	//for insert(6)
	public HostMenuVO(int sid, int cid, int collid, String name, int price, int line) {
		this.sid = sid;
		this.cid = cid;
		this.collid = collid;
		this.name = name;
		this.price = price;
		this.line = line;
	}

	public HostMenuVO(int sid, String cname) {
		super();
		this.sid = sid;
		this.cname = cname;
	}
	
	
	
}


