<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ include file="../includes/header.jsp"%>


<!-- Section-->
<section class="py-5">
	<div class="container px-4 px-lg-5 mt-5">
		
		<c:forEach var="alist" items="${alist }">
		<!-- 골목이름 -->
		<div><p class="a">
		<c:out value="${alist.subtitle }" />
		</p></div>
		<div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">	
			<div class="col mb-5">
				<div class="card h-100">
					<!-- 음식 사진 -->
					<img class="card-img-top"
						src="${alist.mainimage }" 
						style="height: 200px;" />
					<!-- 식당 정보 -->
					<div class="card-body p-4">
						<div class="text-center">
							<!-- 식당 이름 -->
							<h5 class="fw-bolder">
							<c:out value="${alist.storename }" />
							</h5>
							<!-- 식당 주소 -->
							<c:out value="${alist.address }" />
						</div>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>
		
	</div>
</section>


<%@ include file="../includes/footer.jsp"%>