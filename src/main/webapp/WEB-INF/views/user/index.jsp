<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<title>Trang chủ</title>
<head>
	<!-- <style type="text/css">
		.shopBtn{
			background: #000000 !important;
		}
	</style> -->
</head>

<body>

	<!-- 
Body Section 
-->
	<%-- <h1>${menus.size()}</h1>  --%>
	<div class="row">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
					<c:forEach var="item" items="${ categorys }">
						<li><a href="<c:url value="/san-pham/${ item.id }"/>"><span
								class="icon-chevron-right"></span> ${item.name}</a></li>
						<li>
					</c:forEach>
					<!-- <li style="border: 0">&nbsp;</li>
					<li><a class="totalInCart" href="cart.html"><strong> Số tiền<span class="badge badge-warning pull-right"
								style="line-height: 18px;">$448.42</span>
						</strong></a></li> -->
				</ul>
			</div>
			<a>Địa chỉ shop</a>
			<div class="well well-small">
				<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1243.2401955605828!2d106.83039738706218!3d10.838438593377342!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x317521da28587931%3A0xbbb99753ceea5e0c!2sVinhomes%20Grand%20Park%20S1.03!5e0!3m2!1svi!2s!4v1652901627142!5m2!1svi!2s" width="200" height="600" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
				
			</div>
			

		
		</div>
		<div class="span9">
			<div class="well np">
				<div id="myCarousel" class="carousel slide homCar">
					<div class="carousel-inner">
						<c:forEach var="item" items="${ slides }" varStatus="index">
							<c:if test="${index.first}">
								<div class="item active">
							</c:if>

							<c:if test="${not index.first}">
								<div class="item">
							</c:if>
							<img style="width: 100%"
								src="<c:url value="${ item.img }"/>"
								alt="bootstrap ecommerce templates">
							<%-- <div class="carousel-caption">
								<h4>${ item.caption }</h4>
								<br>
								<p>
									<span>${ item.content }</span>
								</p>
							</div> --%>
					</div>
					</c:forEach>
				</div>
				<a class="left carousel-control" href="#myCarousel"
					data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
					href="#myCarousel" data-slide="next">&rsaquo;</a>
			</div>
		</div>

		<!--New Products-->
		<div class="well well-small">
			<h3>Sản phẩm mới</h3>
			<hr class="soften" />
			<div class="row-fluid">
				<div id="newProductCar" class="carousel slide">
					<div class="carousel-inner">
						<c:if test="${ products.size() > 0 }">
							<div class="item active">
								<ul class="thumbnails">
									<c:forEach var="item" items="${ products }" varStatus="loop">
										<li class="span3">
											<div class="thumbnail">
												<a class="zoomTool" href="chi-tiet-san-pham/${ item.id }"
													title="add to cart"><span class="icon-search"></span>
													QUICK VIEW</a> <a href="chi-tiet-san-pham/${ item.id }"><img
													src="<c:url value="${ item.img_product }"/>"
													alt=""></a>
											</div>
										</li>
										<c:if test="${ (loop.index + 1) % 4 == 0 || (loop.index + 1)  == products.size() }">
											</ul>
										</div>
										<c:if test="${ (loop.index + 1) < products.size() }">
											<div class="item">
												<ul class="thumbnails">
										</c:if>
						</c:if>
									</c:forEach>
						</c:if>

					</div>
					<a class="left carousel-control" href="#newProductCar"
						data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
						href="#newProductCar" data-slide="next">&rsaquo;</a>
				</div>
			</div>
		</div>

		<!--Featured Products-->
		<div class="well well-small">
			<h3>
				<a class="btn btn-mini pull-right" href="products.html"
					title="View more">VIew More<span class="icon-plus"></span></a> Sản
				phẩm nổi bật
			</h3>
			<hr class="soften" />
			<div class="row-fluid">
				<c:if test="${ products.size() > 0 }">
					<ul class="thumbnails">

						<c:forEach var="item" items="${ products }" varStatus="loop">
							<li class="span4">
								<div class="thumbnail">
									<a class="zoomTool" href="chi-tiet-san-pham/${ item.id }" title="add to cart"> QUICK VIEW</a> 
										<a href="chi-tiet-san-pham/${ item.id }">
										<img src="<c:url value="${ item.img_product }"/>" alt=""></a>
									<div class="caption">
										<h5>${ item.name_product }</h5>
										<h5><span class=""><fmt:formatNumber
													type="number" groupingUsed="true" value="${ item.price }" /> ₫</span></h5>
										
										<h4>
										
											<!-- <a class="defaultBtn" href="product_details.html"
												title="Click to view"><span class="icon-zoom-in"></span></a> -->
												<center>
													<a class="shopBtn" href="<c:url value="/AddCart/${ item.id }"/>" title="add to cart"><span
												class="">Thêm sản phẩm</span></a> 
												</center>
											
										</h4>
									</div>
								</div>
							</li>

							<c:if
								test="${ (loop.index + 1) % 3 == 0 || (loop.index + 1)  == products.size() }">
					</ul>
					<c:if test="${ (loop.index + 1) < products.size() }">
						<ul class="thumbnails">
					</c:if>
				</c:if>

				</c:forEach>

				</c:if>
			</div>
		</div>
		<hr>
		<div class="well well-small">
			<a class="btn btn-mini pull-right" href="#">xem thêm <span
				class="icon-plus"></span></a> tất cả sản phẩm
		</div>

	</div>
	</div>
</body>
