<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="title-infor-account text-center">
		<h1>Tài khoản của bạn </h1>
	</div>
	<hr/>
<div class="col-xs-12" id="customer_sidebar">
						<h2 class="title-detail">Thông tin tài khoản</h2>
						
						<h4 class="name_account">${LoginInfo.display_name}</h4>
						

						<p class="email ">${LoginInfo.username}</p>
						<div class="address ">													
							<p> ${LoginInfo.address}</p>							
							
							
						</div>
					</div>
	<div class="col-xs-12 customer-table-wrap" id="customer_orders">	
						<div class="customer_order customer-table-bg">		
							
							<h3 class="title-detail">
								Danh sách đơn hàng mới nhất
							</h3>
							<div class="table-responsive">
								<table class="table">
									<thead>
										<tr>
											<th class="order_number text-center">Mã đơn hàng</th>
											<th class="date text-center">Ngày đặt</th>
											<th class="total text-right">Thành tiền</th>
											<th class="payment_status text-center">Trạng thái thanh toán</th>
											<th class="fulfillment_status text-center">Vận chuyển</th>
										</tr>
									</thead>
									<tbody>
						<c:if test="${not empty bills}">
							<c:forEach var="bill" items="${bills}">
							<tr class="even cancelled_order">
											<td class="text-center"><a href="<c:url value="/billdetail/${ bill.id }"/>" title="">#${bill.id}</a></td>
											<td class="text-center"><span>30/12/2021</span></td>
											<td class="text-right"><span class="total money"><fmt:formatNumber type="number" groupingUsed="true" value="${bill.total}" /> ₫</span></td>
																						<td class="text-center"><span class="status_pending">Đang chờ xử lý</span></td>
											
																						<td class="text-center"><span class="status_not fulfilled">Chưa giao hàng</span></td>
											
										</tr>
								<%-- <tr style="border: 1px black solid">
									<td>${product.id}</td>
									<td><img src="<c:url value="${ product.img_product }"/> "
										alt="" style="width: 50%"></td>
									<td>${product.name_product}</td>
									<td><fmt:formatNumber type="number" groupingUsed="true"
											value="${product.price}" />₫</td>
									<td>${product.size}Ich</td>
									<td>${product.name_capacity}GB</td>
									<td><div
											style=" width: 20px;   height: 20px; border: 1px solid black; background: ${product.code_color};"></div></td>
									<td><a href="${urlView}/${product.id}">View</a></td>
									<td><a href="${urlUpdate}/${product.id}">Edit</a></td>
									<td><a href="${urlDelete}/${product.id}">Delete</a></td>
								</tr> --%>
							</c:forEach>
						</c:if>
															
										
										<!-- <tr class="even cancelled_order">
											<td class="text-center"><a href="/account/orders/ed0e33a3419a43b4bc00472e9e23574f" title="">#299216</a></td>
											<td class="text-center"><span>30/12/2021</span></td>
											<td class="text-right"><span class="total money">292,000₫</span></td>
																						<td class="text-center"><span class="status_pending">Đang chờ xử lý</span></td>
											
																						<td class="text-center"><span class="status_not fulfilled">Chưa giao hàng</span></td>
											
										</tr>
										
										<tr class="odd ">
											<td class="text-center"><a href="/account/orders/fa2079c3e1644493831dc4e6f59a95cf" title="">#297196</a></td>
											<td class="text-center"><span>29/12/2021</span></td>
											<td class="text-right"><span class="total money">292,000₫</span></td>
											
											<td class="text-center"><span class="status_paid">Đã hoàn tất</span></td>
											
											
											<td class="text-center"><span class="status_fulfilled">Đã giao hàng</span></td>
											
										</tr> -->
										
									</tbody>
								</table>
							</div>
							
						</div>
					</div>
</body>
</html>