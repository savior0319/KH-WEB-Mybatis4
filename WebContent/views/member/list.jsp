<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>검색 회원</title>
</head>
<body>
	<h1>검색 회원 리스트</h1>
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
</body>
</html>