<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>전체 회원 리스트</title>
</head>
<body>
	<h1>전체 회원 리스트</h1>
	<table border="1">
		<thead>
			<tr align="center">
				<th>번호</th>
				<th>아이디</th>
				<th>이름</th>
				<th>지역</th>
				<th>성별</th>
				<th>취미</th>
				<th>가입일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.list}" var="m">
			<tr align="center">
				<td>${m.memberNo}</td>			
				<td>${m.memberId}</td>			
				<td>${m.memberName}</td>			
				<td>${m.memberAddr}</td>			
				<td>${m.gender}</td>			
				<td>${m.hobby}</td>			
				<td>${m.regDate}</td>			
			</tr>
		</c:forEach>
	</tbody>
</table>
<hr>
이름 또는 아이디 또는 주소로 검색하기<br>

<form action="/search" method="POST" accept-charset="utf-8">
	<input type="radio" name="searchSelect" value="name" placeholder="">이름
	<input type="radio" name="searchSelect" value="id" placeholder="">아이디
	<input type="radio" name="searchSelect" value="address" placeholder="">주소
	<input type="text" name="searchVal" placeholder="검색어 입력">
	<button type="submit">검색</button>
</form>
<hr> 
선택하여 출력(번호, 아이디, 가입일은 기본적으로 보임)
<form action="/search2" method="POST">
	<input type="checkbox"  name="name"/>이름
	<input type="checkbox"  name="addr"/>주소
	<input type="checkbox"  name="gender"/>성별
	<input type="checkbox"  name="hobby"/>취미
	<input type="submit" value="검색"/>
</form>
<hr> 
지역별로 출력
<form action="/search3" method="POST">
	<input type="checkbox" name="addr" value="서울시"/>서울
	<input type="checkbox" name="addr" value="경기도"/>경기
	<input type="checkbox" name="addr" value="인천시"/>인천
	<input type="checkbox" name="addr" value="강원도"/>강원
	<input type="checkbox" name="addr" value="전라도"/>전라
	<input type="checkbox" name="addr" value="충청도"/>충청
	<input type="checkbox" name="addr" value="경상도"/>경상
	<input type="checkbox" name="addr" value="제주도"/>제주
	<input type="submit" value="검색"/>
</form>
</body>
</html>