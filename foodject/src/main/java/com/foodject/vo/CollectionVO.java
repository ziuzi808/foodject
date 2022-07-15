package com.foodject.vo;

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
public class CollectionVO {
	private int id;
	private String name;
	private int line;
	
	// for updateLine
	public CollectionVO(int id, int line) {
		this.id = id;
		this.line = line;
	}
	
	
}


