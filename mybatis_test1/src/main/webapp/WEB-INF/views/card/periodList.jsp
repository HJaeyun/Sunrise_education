<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기간별 입회신청 내역조회</title>
<style>
</style>
</head>
<body>
  <div class="container">
    <form>  
    <label for="start">기간</label>
    <input type="date" id="start" name="trip-start" value="2022-01-01" min="2018-01-01" max="2024-12-31">~
    <input type="date" id="start" name="trip-start" value="2022-01-01" min="2018-01-01" max="2024-12-31">   
    <label>신청구분</label><input type="text">
    <label>주민번호</label><input type="text">
    <button>조회</button>   
       <div class="periodList">
         <table border="1">
				<tr>
					<td align="center">접수일자</td>
					<td align="center">접수 일련번호</td>
					<td align="center">주민번호</td>
					<td align="center">성명(한글)</td>
					<td align="center">성명(영문)</td>
					<td align="center">신청구분</td>
					<td align="center">브랜드</td>
					<td align="center">핸드폰번호</td>
					<td align="center">불능 구분</td>
					<td align="center">불능 사유명</td>
				</tr>
				<tr>
					<td>.</td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</table>
       </div>
    </form>
  </div>
</body>
</html>