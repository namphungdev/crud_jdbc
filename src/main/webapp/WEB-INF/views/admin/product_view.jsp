<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Chi tiết sản phẩm</title>
</head>
<body>
  <a href="<c:url value="/product_list"/>" >List Customer</a><br />
  <h1>View Product:</h1>  
   ID: ${product.id} <br/>
   Ảnh: <img src="<c:url value="${ product.img_product }"/> " alt="" style="width: 30%"> <br/>
   Name: ${product.name_product} <br/>
   Price: ${product.price} <br/>
   size: ${product.size} <br/>
   Capacity: ${product.name_capacity} <br/>
   Sale: ${product.sale} <br/>
   Loại sản phẩm: ${product.id_category} <br/>
   Title: ${product.title} <br/>
   Highlight: ${product.highlight} <br/>
   Sản phẩm mới: ${product.new_product} <br/>
   Thông tin chi tiết: ${product.details} <br/>
   Ngày nhập: ${product.created_at} <br/>
   Ngày sửa: ${product.updated_at} <br/>
   Màu: ${product.name_color} <br/>
   
</body>
</html>