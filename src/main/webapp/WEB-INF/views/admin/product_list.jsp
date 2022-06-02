<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>

<title>Sản phẩm</title>
<style>
table, th, td {
  border: 1px solid black;
  
}
td {
  padding-right: 30px;
}
table{
	width: 100%;
}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<div class="page-wrapper">
           
            <div class="container-fluid">
               
               <c:url value="/home_admin/product_save" var="urlSave"/>
  <c:url value="/home_admin/product_view/" var="urlView"/>
  <c:url value="/home_admin/product_update/" var="urlUpdate"/>
  <c:url value="/home_admin/customerDelete/" var="urlDelete"/>
  <h1>Danh sách sản phẩm</h1>
  <button type="button" class="btn btn-primary"><a style="color: #fff" href="${urlSave}">Thêm sản phẩm</a></button>
  <br />
  <br />
  <table class="table">
    <tr class="table-dark">
      <th >Id</th>
      <th>Ảnh</th>
      <th>Tên</th>
      <th>GIá</th>
      <th>Kích thước</th>
      <th>Dung lượng</th>
      <th>Màu</th>
      <!-- <th>View</th> -->
      <th>Edit</th>
      <th>Delete</th>
    </tr>
    <c:if test="${not empty listProduct}">
      <c:forEach var="product" items="${listProduct}">
        <tr style="border: 1px black solid">
          <td>${product.id}</td>
		  <td><img src="<c:url value="${ product.img_product }"/> " alt="" style="width: 50%"></td>
          <td>${product.name_product}</td>
          <td><fmt:formatNumber type="number" groupingUsed="true" value="${product.price}" />₫</td>
          <td>${product.size}Ich</td>
          <td>${product.name_capacity}GB</td>
          <td><div  style=" width: 20px;   height: 20px; border: 1px solid black; background: ${product.code_color};"></div></td>
          <%-- <td> <a href="${urlView}/${product.id}">View</a></td> --%>
          <td> <a href="${urlUpdate}/${product.id}">Edit</a></td>
          <td> <a href="${urlDelete}/${product.id}">Delete</a></td>
        </tr>
      </c:forEach>
    </c:if>
  </table>
           </div>
           
        </div>
  
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</html>