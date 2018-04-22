<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상품 상세정보</h2>
	<table border="1">
		<tr>
			<td>
				<img src="#" width="340" height="300">
			</td>
			<td>
				<table border="1" style="height: 300px; width: 400px;">
					<tr align ="center">
						<td>상품명</td>
						<td>${product.name}</td>
					</tr>
					<tr align ="center">
						<td>가격</td>
						<td> <fmt:formatNumber value="${product.price}" pattern="###,###,###"/> </td>
					</tr>
					<tr align="center">
						<td>상품소개</td>
						<td>${product.explanation }</td>
					</tr>
					<tr align="center">
						<td colspan="2">
							<form name="" method="post" action="">
								<input type="hidden" name="id" value="${product.id}">
								<select name="amount">
									<c:forEach begin="1" end="10" var="i">
										<option value="${i}">${i}</option>
									</c:forEach>
								</select>
								<input type="button" value="장바구니에 담기">
							</form>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>