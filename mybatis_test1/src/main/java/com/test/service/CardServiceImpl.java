package com.test.service;

import org.springframework.stereotype.Service;

import com.test.domain.Bill;
import com.test.domain.Crd;
import com.test.domain.Cust;
import com.test.domain.RcvAppl;
import com.test.mapper.CardMapper;


@Service("cardService")
public class CardServiceImpl implements CardService {
	
	private CardMapper cardMapper;
	
	public CardServiceImpl(CardMapper cardMapper) {
		this.cardMapper = cardMapper;
	}

	@Override
	public int rcvApplInsert(RcvAppl rcvAppl) {
		
		int impbs1 = cardMapper.impsb1(rcvAppl);
		int impbs4 = cardMapper.impsb4(rcvAppl);
		int impbs5 = cardMapper.impsb5(rcvAppl);
		
		
		if (impbs1 > 0) {
			rcvAppl.setImpsbClas("1");
			rcvAppl.setImpsbCd("01");
			cardMapper.rcvApplInsert(rcvAppl);
		} else if ((rcvAppl.getApplClas().equals("11") || rcvAppl.getApplClas().equals("12")) && impbs4 > 0) {
			rcvAppl.setImpsbClas("4");
			rcvAppl.setImpsbCd("04");
			cardMapper.rcvApplInsert(rcvAppl);
		} else if ( rcvAppl.getApplClas().equals("21") && impbs5 == 0) {
			rcvAppl.setImpsbClas("5");
			rcvAppl.setImpsbCd("05");
			cardMapper.rcvApplInsert(rcvAppl);
		} else {
			if("11".equals(rcvAppl.getApplClas())) {
				cardMapper.rcvApplInsert(rcvAppl);
				
				String custNo = cardMapper.findCustNo(rcvAppl);
				
				Cust cust = new Cust();
				cust.setBirthD(rcvAppl.getBirthD());
				cust.setHdpNo(rcvAppl.getHdpNo());
				cust.setSSN(rcvAppl.getSSN());
				cust.setHgNm(rcvAppl.getHgNm());
				int result = cardMapper.custInsert(cust);
				
				Crd crd = new Crd();
				crd.setCustNo(custNo);
				if("1".equals(rcvAppl.getBRD())) {
					crd.setCrdNo("5310");
					crd.setMgtBbrn(rcvAppl.getMgtBbrn());
					crd.setSSN(rcvAppl.getSSN());
					crd.setBRD(rcvAppl.getBRD());
					crd.setScrtNo(rcvAppl.getScrtNo());
					crd.setEngNm(rcvAppl.getEngNm());
					result = cardMapper.crdInsert(crd);
				} else if("2".equals(rcvAppl.getBRD())) {
					crd.setCrdNo("4906");
					crd.setMgtBbrn(rcvAppl.getMgtBbrn());
					crd.setSSN(rcvAppl.getSSN());
					crd.setBRD(rcvAppl.getBRD());
					crd.setScrtNo(rcvAppl.getScrtNo());
					crd.setEngNm(rcvAppl.getEngNm());
					result = cardMapper.crdInsert(crd);
				} else if("3".equals(rcvAppl.getBRD())) {
					crd.setCrdNo("3560");
					crd.setMgtBbrn(rcvAppl.getMgtBbrn());
					crd.setSSN(rcvAppl.getSSN());
					crd.setBRD(rcvAppl.getBRD());
					crd.setScrtNo(rcvAppl.getScrtNo());
					crd.setEngNm(rcvAppl.getEngNm());
					result = cardMapper.crdInsert(crd);
				}
				
				
				Bill bill = new Bill();
				bill.setCustNo(cust.getCustNo());
				bill.setStlAct(rcvAppl.getStlAct());
				bill.setBnkCd(rcvAppl.getBnkCd());
				bill.setDpsNm(rcvAppl.getHgNm());
				bill.setStlMtd(rcvAppl.getStlMtd());
				bill.setStlDd(rcvAppl.getStlDd());
				bill.setStmtSndMtd(rcvAppl.getStmtSndMtd());
				bill.setBillZip(rcvAppl.getBilladrZip());
				bill.setBillAdr1(rcvAppl.getBilladrAdr1());
				bill.setBillAdr2(rcvAppl.getBilladrAdr2());
				bill.setEmailAdr(rcvAppl.getEmailAdr());
				result = cardMapper.billInsert(bill);
				
			} else if ("12".equals(rcvAppl.getApplClas())) {
				cardMapper.rcvApplInsert(rcvAppl);
				
				String custNo = cardMapper.findCustNo(rcvAppl);
				
				Crd crd = new Crd();
				crd.setCustNo(custNo);
				if("1".equals(rcvAppl.getBRD())) {
					crd.setCrdNo("5310");
					crd.setMgtBbrn(rcvAppl.getMgtBbrn());
					crd.setSSN(rcvAppl.getSSN());
					crd.setBRD(rcvAppl.getBRD());
					crd.setScrtNo(rcvAppl.getScrtNo());
					crd.setEngNm(rcvAppl.getEngNm());
					int result = cardMapper.crdInsert(crd);
				} else if("2".equals(rcvAppl.getBRD())) {
					crd.setCrdNo("4906");
					crd.setMgtBbrn(rcvAppl.getMgtBbrn());
					crd.setSSN(rcvAppl.getSSN());
					crd.setBRD(rcvAppl.getBRD());
					crd.setScrtNo(rcvAppl.getScrtNo());
					crd.setEngNm(rcvAppl.getEngNm());
					int result = cardMapper.crdInsert(crd);
				} else if("3".equals(rcvAppl.getBRD())) {
					crd.setCrdNo("3560");
					crd.setMgtBbrn(rcvAppl.getMgtBbrn());
					crd.setSSN(rcvAppl.getSSN());
					crd.setBRD(rcvAppl.getBRD());
					crd.setScrtNo(rcvAppl.getScrtNo());
					crd.setEngNm(rcvAppl.getEngNm());
					int result = cardMapper.crdInsert(crd);
				}
				
			} else if ("21".equals(rcvAppl.getApplClas())) {
				cardMapper.rcvApplInsert(rcvAppl);
				
				String custNo = cardMapper.findCustNo(rcvAppl);
				String beforeCrdNo = cardMapper.beforeCrdNo(rcvAppl);
				
				Crd crd = new Crd();
				crd.setCustNo(custNo);
				if("1".equals(rcvAppl.getBRD())) {
					crd.setCrdNo("5310");
					crd.setMgtBbrn(rcvAppl.getMgtBbrn());
					crd.setSSN(rcvAppl.getSSN());
					crd.setBRD(rcvAppl.getBRD());
					crd.setScrtNo(rcvAppl.getScrtNo());
					crd.setEngNm(rcvAppl.getEngNm());
					crd.setBfCrdNo(beforeCrdNo);
					int result = cardMapper.crdInsert(crd);
					result = cardMapper.beforeCrdStatus(crd);
				} else if("2".equals(rcvAppl.getBRD())) {
					crd.setCrdNo("4906");
					crd.setMgtBbrn(rcvAppl.getMgtBbrn());
					crd.setSSN(rcvAppl.getSSN());
					crd.setBRD(rcvAppl.getBRD());
					crd.setScrtNo(rcvAppl.getScrtNo());
					crd.setEngNm(rcvAppl.getEngNm());
					crd.setBfCrdNo(beforeCrdNo);
					int result = cardMapper.crdInsert(crd);
					result = cardMapper.beforeCrdStatus(crd);
				} else if("3".equals(rcvAppl.getBRD())) {
					crd.setCrdNo("3560");
					crd.setCrdNo("5310");
					crd.setMgtBbrn(rcvAppl.getMgtBbrn());
					crd.setSSN(rcvAppl.getSSN());
					crd.setBRD(rcvAppl.getBRD());
					crd.setScrtNo(rcvAppl.getScrtNo());
					crd.setEngNm(rcvAppl.getEngNm());
					crd.setBfCrdNo(beforeCrdNo);
					int result = cardMapper.crdInsert(crd);
					result = cardMapper.beforeCrdStatus(crd);
				}
			}
		}
		
		return 0; 
		
		
		
	}

}
