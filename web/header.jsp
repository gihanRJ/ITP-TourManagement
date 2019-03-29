
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

        <div class="header-block" style="clear:both">
                <div class="left-block">
                    <div class="logotext">WELCOME TO OnlineTours.lk </div>
                    
                    <span class="tagline">your search for tour places ends here</span>
                </div>
                <div class="right-block">
                 
          <% HttpSession nsession = request.getSession(false);
          String data=(String)session.getAttribute( "sessname" );
        // out.println(data);
         if(data!=null) {
         %>
         <input type="submit" value="Logout" onclick="location.href='logout'" class="but" />
         <%}
        else
        {%>
            <div style="float: left"><input class="but" type="button" onClick="location.href='Login.jsp'"  value="Login" name="three" /></div>
            <div style="float: right"><input class="but" type="button" onClick="location.href='Registeration.jsp'"  value="Signup" name="three"/></div>
        <% 
           // out.println("Session is not active");
        }
        %>

   

   
                    

                    
                    
                
                    
                    
                </div> 
            <div/>
           
            <%-- Navigation Menu --%>
           <div id='cssmenu'>
            <ul>
             <li ><a href='http://localhost:8080/TourManagementSystem/home.jsp'><span>Home</span></a></li>
             <li><a href='http://localhost:8080/TourManagementSystem/hotel.jsp'><span>Tours</span></a></li>
             <li><a href='http://localhost:8080/TourManagementSystem/hotel.jsp'><span>Hotels</span></a></li>
             <li><a href='http://localhost:8080/TourManagementSystem/hotel.jsp'><span>look into our guides</span></a></li>
             <li><a href='http://localhost:8080/TourManagementSystem/hotel.jsp'><span>Book Your Own Tour</span></a></li>
             <li class='last'><a href='http://localhost:8080/TourManagementSystem/aboutus.jsp'><span>About US</span></a></li>
             <li><a href='posthotel.jsp'><span>New Hotel</span></a></li>
             <li><a href='posthotel.jsp'><span>Transport Services</span></a></li>
            </ul>
            </div>
            
           <%-- Slider start--%>
     <div class="rslides_container">
      <ul class="rslides" id="slider1">
       
          <li><img src="19.jpg" alt=""></li>
        <li><img src="21.jpg" alt=""></li>
        <li><img src="20.jpg" alt=""/></li>
        <li><img src="22.png" alt=""></li>
        <li><img src="23.jpg" alt=""></li>
        <li><img src="9.jpg" alt=""></li>
        <li><img src="10.jpg" alt=""></li>
        <li><img src="11.jpg" alt=""></li>
        <li><img src="12.jpg" alt=""></li>
        <li><img src="13.jpg" alt=""/></li>
        <li><img src="14.jpg" alt=""></li>
        <li><img src="15.jpg" alt=""></li>
        <li><img src="16.jpg" alt=""></li>
        <li><img src="17.jpg" alt=""></li>
        <li><img src="18.jpg" alt=""></li>
        
        
        
        
        
      </ul>
    </div>
           
           
   
            <%-- DATA BASE CONNECTIVITY--%>
            <%--
try{
        Class.forName("com.mysql.jdbc.Driver");
        out.println("driver loaded");
     Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root" ,"");
        out.println("Connect");
      Statement  st =  con.createStatement();
          out.println("conncetion successfull");
         
       
            
            out.println("recod is inserted");
            
}
            
            catch(Exception e)
                    {
                    
                    }
            out.close();
            
            --%>