<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>회원 가입</title>
</head>
<body>
	<h1>회원 가입 정보</h1>
	<form action="/signup" method="POST" accept-charset="utf-8">
		아이디 <input type="text" name="id" value="" placeholder="아이디"><br>
		비밀번호 <input type="password" name="pw" value="" placeholder="비밀번호"><br>
		비밀번호 확인<input type="password" name="" value="" placeholder="비밀번호 확인"><br>
		이름 <input type="text" name="name" value="" placeholder="이름"><br>
		지역
		<input type="radio" name="location" value="서울시">서울
		<input type="radio" name="location" value="경기도">경기
		<input type="radio" name="location" value="인천시">인천
		<input type="radio" name="location" value="강원도">강원
		<input type="radio" name="location" value="전라도">전라
		<input type="radio" name="location" value="충청도">충청
		<input type="radio" name="location" value="경상도">경상
		<input type="radio" name="location" value="제주도">제주<br>
		성별
		<input type="radio" name="gender" value="남">남성
		<input type="radio" name="gender" value="여">여성<br>
		취미
		<input type="checkbox" name="hobby" value="여행">여행
		<input type="checkbox" name="hobby" value="음악감상">음악감상
		<input type="checkbox" name="hobby" value="춤">춤
		<input type="checkbox" name="hobby" value="공부">공부<br>
		<button type="submit">회원가입</button>
	</form>
</body>
</html>