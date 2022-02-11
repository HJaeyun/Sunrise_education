package com.test.domain;

import lombok.Data;

@Data
public class Cust {
	private String custNo;
	private String SSN;
	private String regD;
	private String hgNm;
	private String birthD;
	private String hdpNo;
	private String lstOprTm;
	private String lstOprD;
	private String lstOprtEmpno;
	
	public Cust() {}

}
