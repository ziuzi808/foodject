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
public class HostShopVO {
	private String id;
	private String mid;
	private String bnum;
	private String addr;
	private String phon;
	private String logo;
	private String info;
	private Date date;
	private int allmin;
	private int status;
	private int marker;
}


