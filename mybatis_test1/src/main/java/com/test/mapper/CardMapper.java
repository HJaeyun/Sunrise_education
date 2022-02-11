package com.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.test.domain.Bill;
import com.test.domain.Crd;
import com.test.domain.Cust;
import com.test.domain.RcvAppl;

@Mapper
public interface CardMapper {

	int rcvApplInsert(RcvAppl rcvAppl);  
	
	int custInsert(Cust cust);
	
	int crdInsert(Crd crd);
	
	int billInsert(Bill bill);
	
	String findCustNo(RcvAppl rcvAppl); // 고객 번호 찾기(12: 신규 신청)
	
	String beforeCrdNo(RcvAppl rcvAppl);  // 이전 카드번호 찾기 (21: 재발급)
	
	int beforeCrdStatus(Crd crd);  // 최종 카드 여부
	
	int impsb1(RcvAppl rcvAppl);  // 불능코드 01
	
	int impsb4(RcvAppl rcvAppl);  // 불능코드 04
	
	int impsb5(RcvAppl rcvAppl);  // 불능코드 05
}
