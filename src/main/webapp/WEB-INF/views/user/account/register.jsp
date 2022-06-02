<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<head>
<title>Đăng ký tài khoản</title>

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
			<ul id="productDetail" class="nav nav-tabs">
				<li class="active"><a href="#home" data-toggle="tab">Đăng
						nhập</a></li>
				<li class=""><a href="#profile" data-toggle="tab">Đăng ký</a></li>

			</ul>
			<div id="myTabContent" class="tab-content tabWrapper">
				<div class="tab-pane fade active in " id="home">
					<h5>Đăng nhập</h5>
					<c:set var="salary" scope="session" value="${statusLogin}" />
					<c:if test="${salary}">
						<h1>
							<c:out value="${salary}" />
						</h1>
						<h1>${statusLogin}</h1>
					</c:if>
					<p style="color: red;">${ statusLogin }</p>

					<form:form action="dang-nhap" method="post" modelAttribute="user">
						<div class="control-group">
							<label class="control-label" for="inputEmail">Email</label>
							<div class="controls">
								<form:input type="email" class="span3"
									placeholder="Mời nhập Email" path="username" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="inputPassword">Mật khẩu</label>
							<div class="controls">
								<form:input type="password" class="span3"
									placeholder="Mời nhập mật khẩu" path="password" />
							</div>
						</div>
						<div class="control-group">
							<div class="controls">
								<button type="submit" class="defaultBtn">Đăng nhập</button>
								<a href="#">Quên mật khẩu?</a>
							</div>
						</div>
					</form:form>


				</div>
				<div class="tab-pane fade " id="profile">

					<c:if test="${ status }">
						<h1>${ status }</h1>
					</c:if>
					<p style="color: red;">${ status }</p>
					<form:form action="dang-ky" method="POST" modelAttribute="user">
						<div class="control-group">
							<label class="control-label" for="inputEmail">Email </label>
							<div class="controls">
								<form:input type="email" class="span3"
									placeholder="Mời nhập Email" path="username" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="inputEmail">Mật khẩu</label>
							<div class="controls">
								<form:input type="password" class="span3"
									placeholder="Mời nhập mật khẩu" path="password" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="inputEmail">Họ và tên</label>
							<div class="controls">
								<form:input type="text" class="span3"
									placeholder="Mời nhập họ và tên" path="display_name" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="inputEmail">Địa chỉ</label>
							<div class="controls">
								<form:input type="text" class="span3"
									placeholder="Mời nhập địa chỉ" path="address" />
							</div>
						</div>
						<div class="controls">
							<button type="submit" class="btn block">Đăng ký</button>
						</div>
					</form:form>
				</div>


			</div>


		</div>

	</div>

</body>

