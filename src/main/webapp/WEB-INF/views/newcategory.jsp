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
  
        <form action="${pageContext.request.contextPath}/Admin/Category/Add" method="POST">
            <h1>Add Category</h1>
            <input type="text" name="cate_title"/>
            <input type="submit" name="add_cat" value="Add Category"/>

        </form>
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
