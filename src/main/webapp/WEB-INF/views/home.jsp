<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>

<link rel="stylesheet" href="css/bootstrap.min2.css">

<title>Payment System</title>
</head>
<body>
<div class="ui_container">
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="collapse navbar-collapse" id="navbarsExample09">
		<ul class="navbar-nav nav nav-tabs mr-auto" role="tablist">
			<li class="active"><a href="receptionPage"
				class="nav-link active" role="tab" style="color: black;">tab1</a></li>
			<li><a href="defaultPage" class="nav-link" role="tab"
				style="color: black;">Main</a></li>
			<li class="active"><a href="evalTablePage"
				class="nav-link active" role="tab" style="color: black;">tab2</a></li>
		</ul>
		<form class="form-inline">
			<form class="navbar-form pull-left">
				<input class="form-control" type="text" name="pName"
					id="searchPatient" placeholder="상품이름" aria-label="상품이름">
				<button type="button" class="btn btn-primary">검색</button>
				<button type="button" class="btn btn-danger">LogOut</button>
			</form>
		</form>
	</div>
	</nav>
	<div class="tab-content">
			<div class="tab-pane active" id="tab2">
				<table width="880" cellpadding="0" cellspacing="0" border="1"
					id="evalRuleTable" class="tablesorter">
					<thead>
						<tr>
							<th style="font-size: 1.5rem">상품 ID</th>
							<th style="font-size: 1.5rem">상품 타입</th>
							<th style="font-size: 1.5rem">상품 이름</th>
							<th style="font-size: 1.5rem">설명</th>
							<th style="font-size: 1.5rem">가격</th>
							<th style="font-size: 1.5rem">수량</th>
							<th style="font-size: 1.5rem">장바구니</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${productList}" var="product">
							<tr>
								<td>${product.id}</td>
								<td>${product.type}</td>
								<td>${product.name}</td>
								<td>${product.explanation}</td>
								<td>${product.price}</td>
								<td>${product.inventory}</td>
								<td>
								<input type="text" placeholder="수량 입력" autofocus required>
								<input type="button" value="담기">
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<br /> <br />

				<ul class="nav justify-content-center">
					<form class="form-inline" id="search">
						<input type="number"
							style="font-size: 25px; width: 150px; text-align: center;"
							placeholder="최소점수" min="1" max="5">
						<h1>&nbsp;~&nbsp;</h1>
						<input type="number"
							style="font-size: 25px; width: 150px; text-align: center;"
							placeholder="최대점수" min="1" max="5">
							
						<button type="button" class="btn btn-secondary">검색</button>
					</form>
				</ul>
			</div>
		</div>
</div>





	<script type="text/javascript"> 
</script>
</body>
</html>
