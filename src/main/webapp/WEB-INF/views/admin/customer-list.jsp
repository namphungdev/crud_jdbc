<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>Helo Spring MVC + JDBC</title>
<style>
table, th, td {
  border: 1px solid black;
}
td {
  padding-right: 30px;
}
</style>
</head>
<body>
  <c:url value="/customer-save" var="urlSave"/>
  <c:url value="/customer-view/" var="urlView"/>
  <c:url value="/customer-update/" var="urlUpdate"/>
  <c:url value="/customerDelete/" var="urlDelete"/>
  <h1>List Customer:</h1>
  <button type="button" class="btn btn-primary"><a style="color: #fff" href="${urlSave}">Add Customer</a></button>
  
  <br />
  <br />
  <table>
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Address</th>
      <th>View</th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>
    <c:if test="${not empty listCustomer}">
      <c:forEach var="customer" items="${listCustomer}">
        <tr style="border: 1px black solid">
          <td>${customer.id}</td>
          <td>${customer.name}</td>
          <td>${customer.address}</td>
          <td> <a href="${urlView}/${customer.id}">Xem</a></td>
          <td> <a href="${urlUpdate}/${customer.id}">Edit</a></td>
          <td> <a href="${urlDelete}/${customer.id}">Delete</a></td>
        </tr>
      </c:forEach>
    </c:if>
  </table>
</body>
</html>