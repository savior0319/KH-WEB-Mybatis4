<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>마이페이지</title>
</head>
<body>
	<form action="/modify" method="POST" accept-charset="utf-8">
		아이디
		<input type="text" name="id" value="${requestScope.myinfo.memberId}" readonly>
		<br> 비밀번호
		<input type="password" name="pw" value="${requestScope.myinfo.memberPw}">
		<br> 비밀번호 확인
		<input type="password" name="pwre" value="${requestScope.myinfo.memberPw}">
		<br> 이름
		<input type="text" name="name" value="${requestScope.myinfo.memberName}" readonly>
		<br> 지역
		<input type="text" name="addr" value="${requestScope.myinfo.memberAddr}" readonly>
		<br> 성별
		<c:set value="${requestScope.myinfo.gender}" var="gen" />
		<c:choose>
		<c:when test="${gen eq '여'}">
		<input type="radio" name="" value="" placeholder="" checked>남자 	
		<input type="radio" name="" value="" placeholder="" disabled>여자 
		<br>
	</c:when>
	<c:otherwise>
	<input type="radio" name="" value="" placeholder="" disabled>남자 	
	<input type="radio" name="" value="" placeholder="" checked>여자 
	<br>
</c:otherwise>
</c:choose>
취미 ${requestScope.myinfo.hobby}<br> 가입일 ${requestScope.myinfo.regDate}<br>
<button type="submit">변경하기</button>
</form>
</body>
</html>