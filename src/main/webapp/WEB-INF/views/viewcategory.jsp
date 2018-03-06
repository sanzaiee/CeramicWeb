<%-- 
    Document   : index
    Created on : Feb 8, 2018, 11:01:28 AM
    Author     : sanzaie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA_Compatible" content="IE=edge">
<meta name="viewport" content="width= device-width, initial-scale= 1">
	<title></title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css"/>">
	<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/font-awesome.min.css"/>">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/slick/slick.css"/>">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/slick/slick-theme.css"/>">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/animate.min.css"/>">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/component.css"/>">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/admin.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/cat.css"/>">
        
        
</head>
<body data-stellar-background-ratio="0.5">


   
<div id="top_section"> 
                 <h1 style="text-align:center">Welcome to Admin Panel</h1>
        </div>
        <div id="NAC">
         
            <h3>    <img src="<c:url value="/resources/img/nac.jpg" />" class="img-circle"/> Newa Art Ceramic </h3>         	
         
        </div>     
              
   
           
<div class="row">
  <div class="col-sm-4">=
      <section class="sidebar-left">  
          <div id="category">
              <h3>Manage Content</h3>
          </div>
     
          <%@include file="category_list.jsp" %>
       </section>
  </div>
  <div class="col-sm-8">
    <div class="main-content">
    
        
        
        
        
        
         <table class="table table-striped custab">
    <thead>
    <a href="${pageContext.request.contextPath}/Admin/Category/Add" class="btn btn-primary btn-xs pull-right"><b>+</b> Add new categories</a>
        <tr>
            	<th >Category Id</th>
 		<th >Category Title</th>
		<th class="text-center">Action</th>
        </tr>
    </thead>
            <tr>
                <td>${category.cate_id}</td>
                <td>${category.cate_title}</td>
<!--                <td class="text-center">
                <a class='btn btn-info btn-xs' href="${pageContext.request.contextPath}/Admin/Category/Edit/${category.cate_id}"><span class="glyphicon glyphicon-edit"></span> Edit</a> 
                <a href="${pageContext.request.contextPath}/Admin/Category/Delete/${category.cate_id}" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Del</a>
                </td>
                   -->
                    </tr>
        
                  <c:forEach items="${categorydata}" var="category">
 
            <tr align="center">
                <td>${category.cate_id}</td>
                <td>${category.cate_title}</td>
 <td class="text-center">
                <a class='btn btn-info btn-xs' href="${pageContext.request.contextPath}/Admin/Category/Edit/${category.cate_id}"><span class="glyphicon glyphicon-edit"></span> Edit</a> 
                <a href="${pageContext.request.contextPath}/Admin/Category/Delete/${category.cate_id}" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Del</a>
                </td>
                   
            </tr>
            </c:forEach>
    </table>
   
        
        
        
        
        
<!--    
         <table align="center" width="100%" cellspacing=0 cellpadding=0>
            <tr align="center">
            <td colspan=6><h2>View All Categories</h2></td>
            </tr>
             <tr align="Center" bgcolor="gray">
 		<th >Category Id</th>
 		<th >Category Title</th>
		<th >Edit</th>
		<th >Delete</th>

            </tr>
            <c:forEach items="${categorydata}" var="category">
 
            <tr align="center">
                <td>${category.cate_id}</td>
                <td>${category.cate_title}</td>
                <td><a href="${pageContext.request.contextPath}/Admin/Category/Edit/${category.cate_id}">Edit</a></td>
                <td><a href="${pageContext.request.contextPath}/Admin/Category/Delete/${category.cate_id}">Delete</a></td>
 
 
            </tr>
            </c:forEach>
        </table>-->
    </div>
  </div>
</div>

    
    <div id="bottom_section">
            <ul>
             		<li><a href="#">Contact Us</a></li>  
                  	 <li><a href="#">Customer Support</a></li>  
              		<li><a href="#">About Us</a></li>  
                  	 <li><a href="#">Company Profile</a></li>  
               </ul>
            
            
            </div>
           















    
    <script src="<c:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery-migrate-3.0.0.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.stellar.min.js"/>"></script>
<script src="<c:url value="/resources/js/wow.min.js"/>"></script>
	<script>
		$(function () {
			$.stellar();
			new WOW().init();
		});
	</script>
<script src="<c:url value="/resources/slick/slick.min.js"/>"></script>
<script src="<c:url value="/resources/js/app.js"/>"></script>
</body>
</html>
