

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="top_section"> 
                 <h1 style="text-align:center">Welcome to Admin Panel</h1>
        </div>
        <div id="NAC">
         
            <h3>    <img src="<c:url value="/resources/img/nac.jpg" />" class="img-circle"/> Newa Art Ceramic </h3>         	
         
        </div>     
              
   
           
    
    <div class="row">
  <div class="col-sm-4">
      <section class="sidebar-left">  
          <div id="category">
              <h3>Manage Content</h3>
          </div>
     
      
      
          <%@include file="category_list.jsp" %>
      
      
      </section>
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
           