<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Sửa</title>
</head>
<body>
 <div class="page-wrapper">
           
            <div class="container-fluid">
              
              <button type="button" class="btn btn-primary"><a style="color: #fff" href="<c:url value="/home_admin/product_list" />">Danh sách sản phẩm</a></button>
  <br />
  <h1>Chỉnh sửa sản phẩm:</h1>
  <c:url value="/home_admin/updateProduct" var="updateProduct" />
  <form:form action="${updateProduct}" method="POST" modelAttribute="product">
      Id: <form:input path="id" readonly="true" /> <br/> <br/>
      Tên sản phẩm: <form:input path="name_product" /> <br/> <br/>
     <%--  Loại sản phẩm 1: <form:select  name="id_category" path="id_category" >
      					<form:option  value="${product.id_category}">${product.id}</form:option >
      					</form:select > <br/> --%>
      Loại sản phẩm:   <form:select  name="id_category" path="id_category" >
			<c:forEach items="${categorys}" var="item">
				<form:option  value="${item.id}">${item.name}</form:option >
			</c:forEach>
		</form:select > <br/> 
	 Mã kích cở:   <form:select  name="id_size" path="id_size" >
			<c:forEach items="${sizes}" var="item">
				<form:option  value="${item.id}">${item.id}</form:option >
			</c:forEach>
		</form:select >   
		    kích cở:   <form:select  name="size" path="size" >
			<c:forEach items="${sizes}" var="item">
				<form:option  value="${item.size}">${item.size}</form:option >
			</c:forEach>
		</form:select > <br/>
		 Mã dung lượng:   <form:select  name="id_capacity" path="id_capacity" >
			<c:forEach items="${capacitys}" var="item">
				<form:option  value="${item.id}">${item.id}</form:option >
			</c:forEach>
		</form:select >   
		    Dung lượng:   <form:select  name="name_capacity" path="name_capacity" >
			<c:forEach items="${capacitys}" var="item">
				<form:option  value="${item.name_capacity}">${item.name_capacity}</form:option >
			</c:forEach>
		</form:select > <br/>
		Mã màu:   <form:select  name="id_color" path="id_color" >
			<c:forEach items="${colors}" var="item">
				<form:option  value="${item.id}">${item.id}</form:option >
			</c:forEach>
		</form:select >   
		    Màu:   <form:select  name="name_color" path="name_color" >
			<c:forEach items="${colors}" var="item">
				<form:option  value="${item.name_color}">${item.name_color}</form:option >
			</c:forEach>
		</form:select > 
		Code màu:   <form:select  name="code_color" path="code_color" >
			<c:forEach items="${colors}" var="item">
				<form:option  value="${item.code_color}">${item.code_color}</form:option >
			</c:forEach>
		</form:select > <br/>
		Giá: <form:input type="number" path="price" /> Giảm giá: <form:input type="text" path="sale" /> <br/>
     	Tile: <form:input type="text" path="title" /> <br/>
      	Sản phẩm nổi bật: Có: <form:radiobutton  path="highlight" value="1" /> Không: <form:radiobutton  path="highlight" value="0" /> <br/> <br/>
        Sản phẩm mới: Có: <form:radiobutton  path="new_product" value="1" /> Không: <form:radiobutton  path="new_product" value="0" /> <br/> <br/> 
      	Thông tin chi tiết: <form:textarea  row="10" cols="50" type="text" path="details" /> <br/>
      	Ngày nhập <form:input type="date"  path="created_at" />  
      	Ngày sửa <form:input type="date"  path="updated_at" /> <br/>
      	Ảnh: <form:input type="text" path="img_product" /> <br/>
    <button type="submit">Submit</button>
  </form:form>
                           
            </div>
           
        </div>
       </div>
  
</body>
</html>