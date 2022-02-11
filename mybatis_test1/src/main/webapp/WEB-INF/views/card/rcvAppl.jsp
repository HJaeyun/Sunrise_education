<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 입회신청서</title>
</head>
<body>
  <div class="container">
    <form method="post" action="/card/rcvAppl">
         <table border="1">
			    <tr>
					<td align="center">주민번호</td>
					<td><input type="text" id="SSN" name="SSN"></td>
					<td align="center">접수 일자</td>
					<td><input type="text" id="rcvD" name="rcvD"></td>
					<td align="center">접수 일련 번호</td>
					<td><input type="text" id="rcvSeqNo" name="rcvSeqNo"><button type="button" onclick="#">조회</button></td>
			    </tr>
				<tr>
					<td align="center">신청일자</td>
					<td><input type="text" id="applD" name="applD"></td>
					<td align="center">접수구분</td>
					<td align="left" colspan=1>
					<select name="applClas" id="applClas">
                        <option value="11">최초신규</option>
                        <option value="12">추가신규</option>
                        <option value="21">재발급</option>
                     </select>
                     </td>
					<td align="center">브랜드</td>
					<td align="left" colspan=1>
					<select name="BRD" id="BRD">
                        <option value="1">MASTER</option>
                        <option value="2">VISA</option>
                        <option value="3">JCB</option>
                     </select>
                     </td>
				</tr>
				<tr>
					<td align="center">성명(한글)</td>
					<td><input type="text" id="hgNm" name="hgNm"></td>
					<td align="center">성명(영문)</td>
					<td><input type="text" id="engNm" name="engNm"></td>
					<td align="center">생년월일</td>
					<td><input type="text" id="birthD" name="birthD"></td>
				</tr>
				<tr>
					<td align="center">결제일자</td>
					<td align="left" colspan=1>
					<select name="stlDd" id="stlDd">
                        <option value="05">05일</option>
                        <option value="10">10일</option>
                        <option value="15">15일</option>
                        <option value="20">20일</option>
                        <option value="25">25일</option>
                        <option value="99">말일</option>
                     </select>
                     </td>
					<td align="center">결제방법</td>
					<td align="left" colspan=1>
					<select name="stlMtd" id="stlMtd">
                        <option value="1">지로</option>
                        <option value="2">자동이체</option>
                        <option value="3">CMS</option>
                     </select>
                     </td>
					<td align="center">결제은행</td>
					<td align="left" colspan=1>
					<select name="bnkCd" id="bnkCd">
                        <option value="002">산업은행</option>
                        <option value="003">기업은행</option>
                        <option value="004">국민은행</option>
                        <option value="005">외환은행</option>
                        <option value="007">수협</option>
                        <option value="011">농협</option>
                        <option value="012">지역농협</option>
                        <option value="020">우리은행</option>
                        <option value="023">CS제일</option>
                     </select>
                     </td>
				</tr>
				<tr>
					<td align="center">결제계좌</td>
					<td colspan="2"><input type="text" id="stlAct" name="stlAct"><button type="button" onclick="#">...</button></td>
					<td align="center">결제계좌 확인여부</td>
					<td></td>
				</tr>
				<tr>
					<td align="center">청구서 발송방법</td>
					<td align="left" colspan=1>
					<select name="stmtSndMtd" id="stmtSndMtd">
                        <option value="1">우편</option>
                        <option value="2">E-MAIL</option>
                        <option value="3">청구서사절</option>
                     </select>
                     </td>
					<td align="center">우편번호</td>
					<td><input type="text" id="billadrZip" name="billadrZip"><button type="button" onclick="#">...</button></td>
					<td><input type="text" id="billadrAdr1" name="billadrAdr1"></td>
					<td><input type="text" id="billadrAdr2" name="billadrAdr2"></td>
				</tr>
				<tr>
					<td align="center">이메일</td>
					<td><input type="text" id="emailAdr" name="emailAdr"></td>
					<td align="center">휴대폰 번호</td>
					<td><input type="text" id="hdpNo" name="hdpNo"></td>
					<td align="center">비밀번호</td>
					<td><input type="text" id="scrtNo" name="scrtNo"></td>
				</tr>
				<tr>
					<td align="center">불능 구분</td>
					<td colspan="2"><input type="text" id="impsbClas" name="impsbClas"></td>
					<td align="center">불능 사유명</td>
					<td colspan="2"><input type="text" id="impsbCd" name="impsbCd"></td>
				</tr>
			</table>
			<br>
		<button type="submit" class="button">등록</button>
		<button type="button" onclick="#">수정</button>	
		<button type="button" onclick="#">초기화</button>		
	</form>
  </div>
</body>
</html>