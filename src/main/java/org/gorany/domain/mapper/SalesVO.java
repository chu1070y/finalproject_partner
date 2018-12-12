package org.gorany.domain.mapper;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class SalesVO {

	
	private String orderdate;
	private int month;
	private String start;
	private String end;
	private String week;
	private int total;
	
	
	
}
