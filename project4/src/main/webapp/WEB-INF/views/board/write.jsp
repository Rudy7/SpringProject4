<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<script src="${path.js}/jquery-3.3.1.min.js"></script>
	<script src="${path.js}/bootstrap.js"></script>
	<style>
		#tab-board-title{
			border: 1px solid gray;
			margin: 0 auto;
			margin-top: 80px;
		}
		#tab-board-main{
			border: 1px solid gray;
			margin: 0 auto;
			margin-top: 80px;
			width: 70%;
		}
		#tab-board-main tr{
			border: 1px solid gray;
		}
		#tab-board-main tr td{
			border: 1px solid gray;
		}
		.text-center{
			width: 99%;
			text-align: center;
		}
		#btn-board-enter{
			border: 1px solid gray;
			margin-right: 1px;
			width: 40%
		}
		#btn-board-enter{
			border: 1px solid gray;
			margin-right: 1px;
			width: 30%
		}
		#btn-board-cancel{
			border: 1px solid gray;
			margin-right: 1px;
			width: 30%
		}
		#td-board-enter{
			width: 100px;
		}
		#td-board-img{
			width: 100px;
		}
		#input-board-write{
			width: 99%;
			height: 300px;
		}
	</style>
</head>
<body>
	<table id="tab-board-title">
		<tr>
			<td>글쓰기
			</td>
		</tr>
	</table>
	<table id="tab-board-main">
		<tr>
			<td id="td-board-enter" class="text-center">제목</td>
			<td colspan="5">
				<input id="input-board-title" class="text-center" type="text" />
			</td>
		</tr>
		<tr>
			<td id="td-board-img" class="text-center">이미지첨부</td>
			<td colspan="5"></td>
		</tr>
		<tr>
			<td colspan="6">
				<input id="input-board-write" type="text" placeholder="내용" />
			</td>
		</tr>
		<tr>
			<td  colspan="5">
			</td>
			<td id="td-board-down">
				<button id="btn-board-enter">확인
				</button>
				<button id="btn-board-cancel">취소
				</button>
			</td>
		</tr>
	</table>
</body>
	<script>
		$('#btn-board-enter').on('click', function(){
			alert("write 도착 ");
			var title = $('#input-board-title').val();
			var content = $('#input-board-write').val();
			location.href="${path.context}/list/"+ title +"/"+ content;
		});
	</script>
</html>