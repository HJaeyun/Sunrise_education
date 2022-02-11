package com.test.domain;

import lombok.Data;

@Data
public class Bill {
	private String custNo;//
	private String stlAct;//
	private String bnkCd;//
	private String dpsNm;//
	private String stlMtd;//
	private String stlDd;//
	private String prcsClas;
	private String stmtSndMtd;//
	private String stmtDeniClas;
	private String billZip;//
	private String billAdr1;//
	private String billAdr2;//
	private String emailAdr;//
	private String lstOprTm;
	private String lstOprD;
	private String lstOprtEmpno;
	
	public Bill() {}

}
