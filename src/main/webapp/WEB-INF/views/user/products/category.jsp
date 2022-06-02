<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<head>
<title>Sản phẩm</title>
<style>
.pagination {
	display: flex;
	justify-content: center;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
	transition: background-color .3s;
	border: 1px solid #ddd;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
	border: 1px solid #4CAF50;
}

.pagination a:hover:not(.active) {
	background-color: #ddd;
}
</style>
</head>

<body>
	<%-- <h1>${ AllproductsByID.size() }</h1>  --%>
	<div class="well well-small">
		<div class="row-fluid">
			<div class="row">
				<span style="margin-left: 25px; font-weight: bold;">Danh sách
					sản phẩm</span> 
					
					
					<select class="pull-right">
						<option>A - Z</option>
						<option>Cao - Thấp</option>
					</select>
				
				
			</div>
			<!-- </div> -->
			<%-- <h1>tong san pham theo idCategory ${productsPaginate.size()}</h1> 
			<h1>idCategory ${idCategory}</h1>   --%>
			<c:if test="${ productsPaginate.size() == 0 }">
				<h1 style="text-align: center;">Không có sản phẩm</h1>  
			</c:if>
			
			<c:if test="${ productsPaginate.size() > 0 }">
				<div class="row-fluid">
					<ul class="thumbnails">
						<c:forEach var="item" items="${ productsPaginate }"
							varStatus="loop">
							<li class="span4">
								<div class="thumbnail">
									<a href="product_details.html" class="overlay"></a> <a
										class="zoomTool" href="product_details.html"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="<c:url value="/chi-tiet-san-pham/${ item.id}"/>"><img
										src="<c:url value="${ item.img_product }"/>" alt=""></a>
									<div class="caption cntr">
										<p>${ item.name_product }</p>
										<p>
											<strong><fmt:formatNumber type="number"
													groupingUsed="true" value="${ item.price }" /> ₫</strong>
										</p>
										<h4>
											<a class="shopBtn" href="#" title="add to cart"> Add to
												cart </a>
										</h4>
										<div class="actionList">
											<a class="pull-left" href="#">Add to Wish List </a> <a
												class="pull-left" href="#"> Add to Compare </a>
										</div>
										<br class="clr">
									</div>
								</div>
							</li>

							<c:if
								test="${ (loop.index + 1) % 3 == 0 || (loop.index + 1)  == productsPaginate.size() }">
					</ul>
				</div>
				<c:if test="${ (loop.index + 1) < productsPaginate.size() }">
					<div class="row-fluid">
						<ul class="thumbnails">
				</c:if>
			</c:if>

			</c:forEach>

			</c:if>
		</div>


		<div class="pagination">
			<c:forEach var="item" begin="1" end="${paginatesInfo.totalPage }" varStatus="loop">
			<c:if test="${ (loop.index ) ==  paginatesInfo.currentPage}">
				<a href="<c:url value="/san-pham/${idCategory}/${loop.index }"/>" class="active">${ loop.index }</a>
			</c:if>
			<c:if test="${ (loop.index ) !=  paginatesInfo.currentPage}">
				<a href="<c:url value="/san-pham/${idCategory}/${loop.index }"/>">${ loop.index }</a> 
			</c:if>
			
			
			
			</c:forEach>
		</div>
</body>

