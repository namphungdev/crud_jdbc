<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<head>
<title>Chi tiết giỏ hàng</title>
</head>

<body>
	<!-- 
Body Section 
-->
	<div class="row">
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="/AppleShop/">Trang chủ</a> <span class="divider">/</span></li>
				<li class="active">Giỏ hàng</li>
			</ul>
			<div class="well well-small">	
			<c:if test="${ TotalPriceCart > 0}">
				<h1>
					Giỏ hàng của bạn <small class="pull-right">Bạn có ${TotalQuantyCart} sản phẩm trong giỏ hàng</small>
				</h1>
			</c:if>
			<c:if test="${ TotalPriceCart <= 0}">
				<h1>
					Giỏ hàng của bạn <small class="pull-right">Bạn không có sản phẩm trong giỏ hàng</small>
				</h1>
			</c:if>
				
			
			
				
				
				<hr class="soften" />

				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Hình ảnh</th>
							<th>Tên</th>
							<th>Màu sắc</th>
							<th>Giá bán</th>
							<th>Số lượng</th>
							<!-- <th>Chỉnh sửa</th> -->
							<th>Xóa</th>
							<th>Tổng tiền</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach var="item" items="${ Cart }">
							<tr>
								<td><img width="100"
									src="<c:url value="${item.value.product.img_product}"/>"
									alt=""></td>
								<td>${item.value.product.name_product}</td>
								
								<td><span class="shopBtn" style="background-color: ${item.value.product.code_color};"><span
										class="icon-ok"></span></span></td>

								<td><fmt:formatNumber type="number" groupingUsed="true" value="${item.value.product.price}" /> ₫</td>
								
								<td>
									<input 
									class="span1 edit-cart" style="max-width: 34px," placeholder="1" id="quanty-cart-${ item.key }" size="6"
									type="number" min="1" max="1000" value="${item.value.quanty}" data-id="${ item.key }" >  
									</br>
									
									<!-- 					
									<button type="button" class="qtyminus qty-btn ">-</button>
									<input style="max-width: 20px" type="text" size="4" name="updates[]" min="1"
									id="updates_1084365566" data-price="42000000" value="1"
									class="tc line-item-qty item-quantity span1">
									<button type="button" class="qtyplus qty-btn">+</button></td> -->
								<%-- <td>
									<button  data-id="${ item.key }"  class="btn btn-mini btn-danger edit-cart" type="button"> 
									<span class="icon-edit"></span>
									</button>
								</td> --%>
								<td>
									<a href="<c:url value="/DeleteCart/${ item.key }"/>" class="btn btn-mini btn-danger" type="button"> <span
										class="icon-remove"></span>
									</a>
								</td>
								<td><fmt:formatNumber type="number" groupingUsed="true" value="${item.value.totalPrice}" /> ₫</td>
							</tr>
								
						</c:forEach>
						
					</tbody>
				</table>
					 <span class="pull-right"> Tổng tiền: <fmt:formatNumber type="number" groupingUsed="true" value="${ TotalPriceCart }" /> ₫</span>
				<br />
				<a href="/AppleShop/" class="shopBtn btn-large"><span class="icon-arrow-left"></span> Tiếp tụp mua hàng </a>
				<c:if test="${ TotalPriceCart > 0}">			
					<a href="<c:url value="/checkout"/>" class="shopBtn btn-large pull-right">Thanh toán <span class="icon-arrow-right"></span></a>
				</c:if>
				
				
				
				



			</div>
		</div>
	</div>
<content tag="script">
<script>
		$(".edit-cart").on("change", function(){
			var id= $(this).data("id");
			var quanty = $("#quanty-cart-"+id).val();
			if(quanty == ""){
				alert("mời nhập số lượng");
				window.location = "EditCart/"+id+"/"+1;
			}else{
				window.location = "EditCart/"+id+"/"+quanty;				
			}
		});
		
		
	</script>
</content>
	
	
</body>

