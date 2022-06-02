<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
<jsp:useBean id="t" class="AppleShop.Dao.UsersDao" scope="request" ></jsp:useBean>
<title>Thanh toán</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>
	<div class="row">
	
		<div class="span9">
			<ul class="breadcrumb">
				<li><a href="/AppleShop/">Trang chủ</a> <span class="divider">/</span></li>
				<li class="active">Người dùng</li>
			</ul>
			<h3>Người dùng</h3>
			<hr class="soft" />

			<div class="row">
				<div class="span9">
					<div class="well" >
						<form:form action="checkout" method="POST" modelAttribute="bills" class="form-horizontal">  
							<h3>Thanh toán đơn hàng</h3>
							
							<div class="control-group">
								<label class="control-label">Họ và tên <sup>*</sup></label>
								<div class="controls">
									 <form:input type="text"  placeholder="Mời nhập họ và tên" path="display_name" value="${LoginInfo.display_name}"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Email <sup>*</sup></label>
								<div class="controls">
									 <form:input type="email"  placeholder="Mời nhập Email" path="username" value="${LoginInfo.username}" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Số điện thoại <sup>*</sup></label>
								<div class="controls">
									 <form:input type="number"  placeholder="Mời nhập số điện thoại" path="phone" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Địa chỉ <sup>*</sup></label>
								<div class="controls">
									 <form:textarea   row="5" cols="30" path="address" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Ghi chú <sup>*</sup></label>
								<div class="controls">
									 <form:textarea   row="5" cols="30"  path="note" /> <br>
									 <form:input  id ="day-now" type="text"  path="NgayMua"  /><br>
									 <form:input   type="text" value="Đang chờ xử lý"  path="TrangThai"  /><br>
									 <form:input   type="text"  value="Đang vận chuyển" path="VanChuyen"  />
									 
								</div>
								
								
							</div>
							
							
							<div class="control-group">
								<div class="controls">
									<input type="submit" name="submitAccount" href="<c:url value="/checkout"/>"
										class="shopBtn exclusive">
								</div>
							</div>
						</form:form>


					</div>
				</div>

			</div>

		</div>
	</div>
	
	<script type="text/javascript">
		var today = new Date();
		var date = today.getDate() + '/' + (today.getMonth() + 1) + '/'+ today.getFullYear();
		document.getElementById("day-now").value= date;
	</script>
	
</body>


