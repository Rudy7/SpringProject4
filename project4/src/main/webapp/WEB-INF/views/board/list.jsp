<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<script src="${path.js}/bootstrap.js"></script>
	<script src="${path.js}/jquery-3.3.1.min.js"></script>
	<style>
		#tab-board-title{
			border: 1px solid gray;
			margin: 0 auto;
			margin-top: 80px;  
		}
		#tab-board{
			border: 1px solid gray;
			margin: 0 auto;
			margin-top: 80px;
			width: 70%;
		}
		#tab-board tr{
			border: 1px solid gray;
		}
		#tab-board tr td{
			border: 1px solid gray;
		}
		#tab-board-search{
			width: 100%;
		}
		#btn-board-search{
			width: 100%;
		}
		#btn-board-write{
			width: 100%;
		}
		.text-center{
		text-align: center;
		}
	</style>
</head>
<body>
	<table id="tab-board-title" >
		<tr>
			<td>게시판
			</td>
		</tr>
	</table>
	<table id="tab-board">
		<tr>
			<td colspan="4">
				<input id="tab-board-search" type="text" />
			</td>
			
			<td>
				<button id="btn-board-search">검색
				</button>
			</td>
			<td>
				<button id="btn-board-write">글쓰기
				</button>
			</td>
		</tr>
		<tr>
			<td class="text-center" >NO</td>
			<td class="text-center">제목</td>
			<td class="text-center">작성자</td>
			<td class="text-center">작성일</td>
			<td class="text-center">조회</td>
			<td class="text-center">좋아요</td>
		</tr>
		<tr>
			<td colspan="9">게시글이 없습니다. </td>
		</tr>
	</table>
</body>
	<script>
		$('#btn-board-write').on('click', function(){
			alert("글쓰기 클릭");	
			location.href="${path.context}/write"
		});
	</script>
</html>
