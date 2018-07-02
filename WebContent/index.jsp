<%@page import="mybatis.member.model.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>메인 페이지</title>
</head>

<c:if test="${not empty sessionScope.member.memberId}">
<script type="text/javascript">
	window.onload = function(){
		location.href="/views/member/login.jsp";
	}
</script>
</c:if>

<body>
	<h2>회원로그인</h2>
	<form action="/login" method="POST" accept-charset="utf-8">
		아이디
		<input type="text" name="id" value="" placeholder="아이디">
		<br> 비밀번호
		<input type="password" name="pw" value="" placeholder="비밀번호">
		<br>
		<button type="submit">로그인</button>
	</form>
	<a href="/views/member/signup.jsp">회원가입</a>
</body>


</html>