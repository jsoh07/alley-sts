<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- jstl core 쓸때 태그에 c 로 표시. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- jstl fmt 쓸때 위와 같음. fmt : formatter 형식 맞춰서 표시 -->
<%@ include file="../includes/header.jsp"%>

<div class="container">
<div class="row">
	<div class="col-lg-12">
		<div class="panel-panel-default" style="text-align: center;">
			<h1>로그인</h1>
			<h2>${error }</h2>
			<h2>${logout }</h2>
			
			<form method="post" action="/member/customLogin">
				<div class="form-group" style="padding-left: 35%;">
					<input type="text" name="userid" placeholder="userid" class="form-control"
						style="width: 400px;" >
				</div>
				<div class="form-group" style="padding-left: 35%;">
					<input type="password" name="userpw" placeholder="password" class="form-control"
						style="width: 400px;">	
				</div>
				<div class="form-group">
					<input type="checkbox" name="remember-me">자동 로그인
				</div>
				<div class="form-group">
					<input type="submit" value="login">
				</div>
				<input type="hidden" name="${_csrf.parameterName }"
					value="${_csrf.token }" />
			</form>
			
		</div>
	</div>
</div>
</div>

<%@ include file="../includes/footer.jsp"%>

