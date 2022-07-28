package com.foodject.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

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
	private String slogo;
	private int mprice;
	private int status;
	private String mname;
	private String oname;
	private int oprice;
	private int oid;



	//delete
	public UserOrdersMyVO(String uid, int status) {
		this.uid = uid;
		this.status = status;
	}

	//selectmy
	public UserOrdersMyVO(String uid, Date odate, String sname, int oid, String slogo) {
		this.uid = uid;
		this.odate = odate;
		this.sname = sname;
		this.slogo = slogo;
		this.oid = oid;
	}

	//selectmenu
	public UserOrdersMyVO(String uid, int mprice, String mname, String oname, int oprice, int oid) {
		this.uid = uid;
		this.mprice = mprice;
		this.mname = mname;
		this.oname = oname;
		this.oprice = oprice;
		this.oid = oid;
	}


	
	
}
