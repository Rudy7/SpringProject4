<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
	<script src="${path.js}/jquery-3.3.1.min.js"></script>
	<script src="${path.js}/bootstrap.js"></script>
	<style>
		#tab-login-title{
			border: 1px solid gray;
			margin: 0 auto;
			margin-top: 80px;
		}
		#tab-login{
			border: 1px solid gray;
			margin: 0 auto;
			margin-top: 80px;
		}
		#tab-login tr{
			border: 1px solid gray ;
		}
		#tab-login tr td{
			border: 1px solid gray ;
		}
	    #a-login {
			border: 1px solid gray ;	
		} 
	</style>
</head>
<body>
	<table id="tab-login-title">
		<tr>
			<td>로그인
			</td>
		</tr>
	</table>
	<table id="tab-login">
		<tr>
			<td>
				<input id="input-uid" type="text" placeholder="id" value="jyw"/>
			</td>
			<td rowspan="2">
				<button id="btn-login">로그인</button>
			</td>
		</tr>
		<tr>
			<td>
				<input id="input-passwd" type="text" placeholder="pass" value="5252"/>
			</td>
		</tr>
		<tr>
			<td>
 	 			<a id="a-login" href="#">회원가입</a>
			</td>		
		</tr>
	</table>
</body>
<script>
$('#btn-login').on('click', function(){
	 alert("로그인버튼 클릭"); 
     var id = $('#input-uid').val();
	 var pass = $('#input-passwd').val(); 
	location.href="${path.context}/login/"+id+"/"+pass;
});
$('#a-login').on('click', function(){
	alert("회원가입 클릭");
	location.href="${path.context}/join";
}); 
</script>
</html>