package com.foodject.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
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
public class CustVO {
	private String id;
	private String pwd;
	private String nick;
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birth;
	private Date date;
	private String phon;
	private String addr;
	private int status;
	private String img;
	private MultipartFile mf;
	
	public CustVO(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	public CustVO(String id, String pwd, String name, Date birth, String phon, String addr) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.birth = birth;
		this.phon = phon;
		this.addr = addr;
	}
	public CustVO(String id, String pwd, String name, String phon, String addr) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phon = phon;
		this.addr = addr;
	}
	public CustVO(String id, String pwd, String nick, String name, Date birth, String phon, String addr, int status,
			MultipartFile mf) {
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
		this.name = name;
		this.birth = birth;
		this.phon = phon;
		this.addr = addr;
		this.status = status;
		this.mf = mf;
	}
	public CustVO(String id, String pwd, String nick, String name, Date birth, String phon, String addr, int status) {
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
		this.name = name;
		this.birth = birth;
		this.phon = phon;
		this.addr = addr;
		this.status = status;
	}
	public CustVO(String id, String pwd, String nick, String name, Date birth, String phon, String addr, int status,
			String img) {
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
		this.name = name;
		this.birth = birth;
		this.phon = phon;
		this.addr = addr;
		this.status = status;
		this.img = img;
	}

	
}


