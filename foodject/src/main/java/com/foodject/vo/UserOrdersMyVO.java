package com.foodject.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserOrdersMyVO {

	
	private String uid;
	private Date odate;
	private String sname;
	private int mprice;
	private int status;
	private String mname;
	private String oname;
	private int oprice;
	
	public UserOrdersMyVO(String uid, Date odate, String sname, int mprice, String mname, String oname, int oprice) {
		this.uid = uid;
		this.odate = odate;
		this.sname = sname;
		this.mprice = mprice;
		this.mname = mname;
		this.oname = oname;
		this.oprice = oprice;
	}

	public UserOrdersMyVO(String uid, Date odate, String sname, int status, String mname, String oname) {
		this.uid = uid;
		this.odate = odate;
		this.sname = sname;
		this.status = status;
		this.mname = mname;
		this.oname = oname;
	}

	public UserOrdersMyVO(String uid, Date odate, String sname, int status, String mname) {
		this.uid = uid;
		this.odate = odate;
		this.sname = sname;
		this.status = status;
		this.mname = mname;
	}

	public UserOrdersMyVO(String uid, int status) {
		this.uid = uid;
		this.status = status;
	}
	
	

	
	
}
