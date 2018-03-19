<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>mypage</title>
	<script src="${path.js}/jquery-3.3.1.min.js"></script>
	<script src="${path.js}/bootstrap.js"></script>
	<style>
		#tab-mypage-title{
			border: 1px solid gray;
			margin: 0 auto;
			margin-top: 80px;
		}
		#tab-mypage{
			border: 1px solid gray;
			margin: 0 auto;
			margin-top: 80px;
		}
		#tab-mypage tr{
			border: 1px solid gray;
		}
		#tab-mypage tr td{
			border: 1px solid gray;
		}
	</style>
</head>
<body>
	<table id="tab-mypage-title">
		<tr>
			<td>나의 페이지
			</td>
		</tr>
	</table>
	<table id="tab-mypage">
		<tr>
			<td>아이디
			</td>
			<td id="td-mypage-id">${loginUser.userid}
			</td>
		</tr>
		<tr>
			<td>이름
			</td>
			<td>${loginUser.name}
			</td>
		</tr>
		<tr>
			<td>가입날짜
			</td>
			<td>${loginUser.regdate}
			</td>
		</tr>
		<tr>
			<td>테스트-비밀번호
			</td>
			<td>${loginUser.password} 
			</td>
		</tr>
		<tr>
			<td>
				<button id="btn-board">게시판
				</button>
			</td>
			<td>
				<button id="btn-mypage">비밀번호 변경
				</button>
			</td>
			<td>
				<button id="btn-mypage-delete" >회원탈퇴
				</button>
			</td>
		</tr>
	</table>
</body>
<script>
$('#btn-mypage').on('click', function(){
	alert("수정버튼 클릭");
	location.href="${path.context}/update";
});
$('#btn-mypage-delete').on('click', function(){
	alert("회원탈퇴 클릭");
	location.href="${path.context}/delete";
});
$('#btn-board').on('click', function(){
	alert("게시판 클릭");
	location.href="${path.context}/list";
});
</script>
</html>
