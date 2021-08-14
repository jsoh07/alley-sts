<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- jstl core 쓸때 태그에 c 로 표시. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- jstl fmt 쓸때 위와 같음. fmt : formatter 형식 맞춰서 표시 -->
<%@ include file="includes/header.jsp"%>

<div class="container" style="text-align: center;">
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<h1>로그아웃 하시겠습니까?</h1>
			<h2>${error }</h2>
			<h2>${logout }</h2>
			
			<div class="panel-body">
				<form role="form" method="post" action="/customLogout">
					<fieldset>
						<!-- 관련 요소를 묶는 역할 -->
						<a href="index.html" class="btn btn-lg btn-success btn-block">
						logout</a>
					</fieldset>
					<input type="hidden" name="${_csrf.parameterName }"
						value="${_csrf.token }" />
				</form>
			
			</div>
		</div>
	</div>
</div>
</div>

<%@ include file="includes/footer.jsp"%>

<script>
$(".btn-success").on("click",function(e){
	e.preventDefault();
	$("form").submit();
});
</script>

<c:if test="${param.logout != null }">
	<script>
	$(document).ready(function(){
		alert("로그아웃");
	});	
	</script>
</c:if>