package com.foodject.vo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class MarkerVO {
	private int id;
	private double latt;
	private double logt;
	private int cid;
	
	
	//for update
	public MarkerVO(int id, double latt, double logt) {
		this.id = id;
		this.latt = latt;
		this.logt = logt;
	}

	//for selectMain
	public MarkerVO(double latt, double logt, int cid) {
		this.latt = latt;
		this.logt = logt;
		this.cid = cid;
	}

	//for insert
	public MarkerVO(double latt, double logt) {
		this.latt = latt;
		this.logt = logt;
	}
	
	
}