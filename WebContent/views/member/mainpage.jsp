<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>메인 페이지</title>
</head>
<body>
	<h2>[${sessionScope.member.memberName}]님 환영합니다</h2>

	<a href="/logout" title="">로그아웃</a><br>
	<a href="/myInfo" title="">마이정보 보기</a><br>
	<a href="/withDraw" title="">회원 탈퇴</a><br>
	<a href="/allMember" title="">전체회원 보기(관리자 전용)</a><br>
</body>
</html>