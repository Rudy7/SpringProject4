<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<script src="${path.js}/jquery-3.3.1.min.js"></script>
	<script src="${path.js}/bootstrap.js"></script>
	<style>
		#tab-update-title{
			border: 1px solid gray;
			margin: 0 auto;
			margin-top: 80px;
		}
		#tab-update{
			border: 1px solid gray;
			margin: 0 auto;
			margin-top: 80px;
		}
		#tab-update tr{
			border: 1px solid gray;
		}
		#tab-update tr td{
			border: 1px solid gray;
		}
	</style>
</head>
<body>
	<table id="tab-update-title">
		<tr>
			<td>비밀번호 변경
			</td>
		</tr>
	</table>
	<table id="tab-update">
		<tr>
			<td>현재 비밀번호
			</td>
			<td>
				<input id="input-update-before" type="text" />
			</td>
		</tr>
		<tr>
			<td>변경할 비밀번호
			</td>
			<td>
				<input id="input-update-after" type="text" />
			</td>
		</tr>
		<tr>
			<td>
				<button id="btn-update">변경하기
				</button>
			</td>
		</tr>
	</table>
</body>
<script>
	$('#btn-update').on('click', function(){
		alert("업데이트 버튼클릭");
		var befPass = $('#input-update-before').val();
		var aftPass = $('#input-update-after').val();
		location.href="${path.context}/passUpdate/"+befPass+"/"+aftPass;
	});	
</script>
</html>

