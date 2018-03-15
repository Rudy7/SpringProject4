<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<script src="${path.js}/jquery-3.3.1.min.js"></script>
	<script src="${path.js}/bootstrap.js"></script>
	<style>
		#tab-join-title{
			border: 1px solid gray;
			margin: 0 auto;
			margin-top: 80px;
		}
		#tab-join{
			border: 1px solid gray;
			margin: 0 auto;
			margin-top: 80px;
		}
		#tab-join tr{
			border: 1px solid gray;
		}
		#tab-join tr td{
			border: 1px solid gray;
		}
	</style>
</head>
<body>
	<table id="tab-join-title">
		<tr>
			<td>회원가입
			</td>
		</tr>
	</table>
	<table id="tab-join">
		<tr>
			<td>아이디
			</td>
			<td>
				<input id="input-id-join" type="text" />
			</td>
		</tr>
		<tr>
			<td>비밀번호
			</td>
			<td>
				<input id="input-pass-join" type="text" />
			</td>
		</tr>
		<tr>
			<td>이름
			</td>
			<td>
				<input id="input-name-join" type="text" />
			</td>
		</tr>
		<tr>
			<td>
				<button id="btn-join">가입하기</button>
			</td>
		</tr>
	</table> 
</body>
<script>
$('#btn-join').on('click', function(){
	alert("조인에서 확인클릭");
	var id = $('#input-id-join').val();
	var pass = $('#input-pass-join').val();
	var name = $('#input-name-join').val();
	location.href="${path.context}/mypage/"+id+"/"+pass+"/"+name;
});
</script>
</html>