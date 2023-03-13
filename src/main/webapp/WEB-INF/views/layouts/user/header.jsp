<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<head>
	<style type="text/css">
		.wrapper { 
  height: 100%;
  width: 100%;
  left:0;
  right: 0;
  top: 0;
  bottom: 0;
  position: absolute;
background: linear-gradient(124deg, #ff2400, #e81d1d, #e8b71d, #e3e81d, #1de840, #1ddde8, #2b1de8, #dd00f3, #dd00f3);
background-size: 1800% 1800%;

-webkit-animation: rainbow 18s ease infinite;
-z-animation: rainbow 18s ease infinite;
-o-animation: rainbow 18s ease infinite;
  animation: rainbow 18s ease infinite;}

@-webkit-keyframes rainbow {
    0%{background-position:0% 82%}
    50%{background-position:100% 19%}
    100%{background-position:0% 82%}
}
@-moz-keyframes rainbow {
    0%{background-position:0% 82%}
    50%{background-position:100% 19%}
    100%{background-position:0% 82%}
}
@-o-keyframes rainbow {
    0%{background-position:0% 82%}
    50%{background-position:100% 19%}
    100%{background-position:0% 82%}
}
@keyframes rainbow { 
    0%{background-position:0% 82%}
    50%{background-position:100% 19%}
    100%{background-position:0% 82%}
}
	</style>
</head>

<header id="header">
	<div class="row  " >
		  <%-- <div class="span4  ">	
			 <h1>
				<a class="logo " href="/AppleShop/"><img
					src="<c:url value="/assets/user/img/apple-imac.png"/> "
					alt="bootstrap sexy shop"> </a>
			</h1> 
		</div>   --%>
		<div>
			<img style="width: 100%" src="<c:url value="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-6d3INR8Yf7l9f6PhjJguCD3563lxtow4EQ&usqp=CAU"/> "
					alt="bootstrap sexy shop">
		
		</div>
		
		
	</div>
</header>

<!--
Navigation Bar Section 
-->
<div class="navbar">
	<div class="navbar-inner" style=" align-items: center;">
		<div class="container">
			<a data-target=".nav-collapse" data-toggle="collapse"
				class="btn btn-navbar"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a>
			<div class="nav-collapse " >
				<ul class="nav">
					<li class=""><a href="<c:url value="/${ item.url }"/>"></a></li>
					<li class=""><a href="<c:url value="/${ item.url }"/>"></a></li>
					<li class=""><a href="<c:url value="/${ item.url }"/>"></a></li>
					<li class=""><a href="<c:url value="/${ item.url }"/>"></a></li>
					<li class=""><a href="<c:url value="/${ item.url }"/>"></a></li>
					<li class=""><a href="<c:url value="/${ item.url }"/>"></a></li>
					<li class=""><a href="<c:url value="/${ item.url }"/>"></a></li>
					<li class=""><a href="<c:url value="/${ item.url }"/>"></a></li>
					<li class=""><a href="<c:url value="/${ item.url }"/>"></a></li>
					<li class=""><a href="<c:url value="/${ item.url }"/>"></a></li>
					<c:forEach var="item" items="${ menus }" varStatus="index">
						<c:if test="${index.first}">
								<li class="active">
						</c:if>
						
						<c:if test="${not index.first}">
							<li class="">
						</c:if>
						<a href="<c:url value="/${ item.url }"/>">${item.name} </a></li>
					</c:forEach>
					
					
				</ul>

				<form action="#" class="navbar-search pull-left">
					<input type="text" placeholder="Search" class="search-query span2">
				</form>
				<%-- <ul class="nav pull-right">
					<c:if test="${empty LoginInfo}">
						<li class="dropdown"><a data-toggle="dropdown"
							class="dropdown-toggle" href="#"><span class="icon-lock"></span>
								Đăng nhập <b class="caret"></b></a>
							<div class="dropdown-menu">
								<form class="form-horizontal loginFrm">
									<div class="control-group">
										<input type="text" class="span2" id="inputEmail"
											placeholder="Email">
									</div>
									<div class="control-group">
										<input type="password" class="span2" id="inputPassword"
											placeholder="Password">
									</div>
									<div class="control-group">
										<label class="checkbox"> <input type="checkbox">
											Remember me
										</label>
										<button type="submit" class="shopBtn btn-block">Sign
											in</button>
									</div>
								</form>
							</div></li>
					</c:if>
					<c:if test="${not empty LoginInfo}">
						<li><a href="#">${LoginInfo.display_name} <b class="caret"></b></a></li>
					</c:if>

				</ul> --%>
			</div>
		</div>
	</div>
</div>
