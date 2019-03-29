package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"home.css\">\n");
      out.write("         <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("         <style>\n");
      out.write("            \n");
      out.write("        .but{\n");
      out.write("  \n");
      out.write("        width: 100px; height: 40px;\n");
      out.write("        color : red;\n");
      out.write("\n");
      out.write("   border-top: 1px solid #96d1f8;\n");
      out.write("   background: #65a9d7;\n");
      out.write("   background: -webkit-gradient(linear, left top, left bottom, from(#728cdb), to(#65a9d7));\n");
      out.write("   background: -webkit-linear-gradient(top, #728cdb, #65a9d7);\n");
      out.write("   background: -moz-linear-gradient(top, #728cdb, #65a9d7);\n");
      out.write("   background: -ms-linear-gradient(top, #728cdb, #65a9d7);\n");
      out.write("   background: -o-linear-gradient(top, #728cdb, #65a9d7);\n");
      out.write("   padding: 5px 10px;\n");
      out.write("   -webkit-border-radius: 8px;\n");
      out.write("   -moz-border-radius: 8px;\n");
      out.write("   border-radius: 8px;\n");
      out.write("   -webkit-box-shadow: rgba(0,0,0,1) 0 1px 0;\n");
      out.write("   -moz-box-shadow: rgba(0,0,0,1) 0 1px 0;\n");
      out.write("   box-shadow: rgba(0,0,0,1) 0 1px 0;\n");
      out.write("   text-shadow: rgba(0,0,0,.4) 0 1px 0;\n");
      out.write("   color: white;\n");
      out.write("   font-size: 20px;\n");
      out.write("   font-family: Georgia, serif;\n");
      out.write("   text-decoration: none;\n");
      out.write("   vertical-align: middle;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("<link href=\"responsiveslides.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"themes.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n");
      out.write("<script src=\"responsiveslides.min.js\" type=\"text/javascript\"></script>\n");
      out.write("  <script>\n");
      out.write("      \n");
      out.write("      $(function () {\n");
      out.write("\n");
      out.write("      // Slideshow 1\n");
      out.write("      $(\"#slider1\").responsiveSlides({\n");
      out.write("        auto: true,\n");
      out.write("        pager: false,\n");
      out.write("        nav: true,\n");
      out.write("        speed: 500,\n");
      out.write("        maxwidth: 1200,\n");
      out.write("        namespace: \"centered-btns\"\n");
      out.write("      });\n");
      out.write("   });\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"header-block\" style=\"clear:both\">\n");
      out.write("                <div class=\"left-block\">\n");
      out.write("                    <div class=\"logotext\">WELCOME TO OnlineTours.lk </div>\n");
      out.write("                    \n");
      out.write("                    <span class=\"tagline\">your search for tour places ends here</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right-block\">\n");
      out.write("                 \n");
      out.write("          ");
 HttpSession nsession = request.getSession(false);
          String data=(String)session.getAttribute( "sessname" );
        // out.println(data);
         if(data!=null) {
         
      out.write("\n");
      out.write("         <input type=\"submit\" value=\"Logout\" onclick=\"location.href='logout'\" class=\"but\" />\n");
      out.write("         ");
}
        else
        {
      out.write("\n");
      out.write("            <div style=\"float: left\"><input class=\"but\" type=\"button\" onClick=\"location.href='Login.jsp'\"  value=\"Login\" name=\"three\" /></div>\n");
      out.write("            <div style=\"float: right\"><input class=\"but\" type=\"button\" onClick=\"location.href='Registeration.jsp'\"  value=\"Signup\" name=\"three\"/></div>\n");
      out.write("        ");
 
           // out.println("Session is not active");
        }
        
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("   \n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div> \n");
      out.write("            <div/>\n");
      out.write("           \n");
      out.write("            ");
      out.write("\n");
      out.write("           <div id='cssmenu'>\n");
      out.write("            <ul>\n");
      out.write("             <li ><a href='http://localhost:8080/indiatours/home.jsp'><span>Home</span></a></li>\n");
      out.write("             <li><a href='http://localhost:8080/indiatours/hotel.jsp'><span>Tours</span></a></li>\n");
      out.write("             <li><a href='http://localhost:8080/indiatours/hotel.jsp'><span>Hotels</span></a></li>\n");
      out.write("             <li><a href='http://localhost:8080/indiatours/hotel.jsp'><span>look into our guides</span></a></li>\n");
      out.write("             <li><a href='http://localhost:8080/indiatours/hotel.jsp'><span>Book Your Own Tour</span></a></li>\n");
      out.write("             <li class='last'><a href='http://localhost:8080/indiatours/aboutus.jsp'><span>Contact US</span></a></li>\n");
      out.write("             <li><a href='posthotel.jsp'><span>New Hotel</span></a></li>\n");
      out.write("             <li><a href='posthotel.jsp'><span>Transport Services</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("           ");
      out.write("\n");
      out.write("     <div class=\"rslides_container\">\n");
      out.write("      <ul class=\"rslides\" id=\"slider1\">\n");
      out.write("       \n");
      out.write("          <li><img src=\"19.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"21.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"20.jpg\" alt=\"\"/></li>\n");
      out.write("        <li><img src=\"22.png\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"23.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"9.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"10.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"11.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"12.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"13.jpg\" alt=\"\"/></li>\n");
      out.write("        <li><img src=\"14.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"15.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"16.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"17.jpg\" alt=\"\"></li>\n");
      out.write("        <li><img src=\"18.jpg\" alt=\"\"></li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("   \n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("    <div  style=\" background-color: #5882FA;box-shadow: 10px 10px 5px #888888;width: 104%; margin-left: -23px;margin-top: 270px; \">\n");
      out.write("        <h2 class=\"heading\" style=\"margin-left: 20px;\"> Welcome to Tours.lk  </h2>\n");
      out.write("        <p  style=\"color:  #ffffff; font-size: 16px; font-family: verdana; margin-left: 50px; padding-bottom: 20px;\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("          </p>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    <div  class=\"tours-block\"style=\" width:95.5%; margin-left: -23px; margin-right: 250px; clear: both;\">\n");
      out.write("        \n");
      out.write("       <h2 class=\"heading\" style=\"margin-top: 5px; margin-left: -15px;\"> hotels in Sri lanka  </h2>\n");
      out.write("         <h2 class=\"heading\" style=\"margin-top: 5px;\"><a href=\"http://localhost:8080/indiatours/hotel.jsp\">Best Hotels</a> </h2>\n");
      out.write("         <div style=\"  width: 700px; clear: both; float: left;\">\n");
      out.write("             <p  style=\"color:  #ffffff; font-size: 16px; font-family: verdana;\">\n");
      out.write("          Compare Prices & Save Money on Online tours (Sri Lanka's Largest Travel Website). Millions of hotel reviews. Easy price comparison. Candid traveler photos. Types: Hotels, Resorts, All Inclusive Resorts, Boutique Hotels, Extended Stay Hotels, B&B, Inns, Villas.\n");
      out.write("         </p>\n");
      out.write("         </div>\n");
      out.write("         <div style=\"margin-left: 800px; margin-top: -90px;\">\n");
      out.write("         \n");
      out.write("         <span ><img src=\"aaa.jpg\" alt=\"\"></span>\n");
      out.write("         </div>\n");
      out.write("    </div>\n");
      out.write("    ...............................................................................................................\n");
      out.write("    <div  class=\"tours-block\"style=\" width:95.5%; margin-left: -23px; margin-right: 250px; clear: both;\">\n");
      out.write("        \n");
      out.write("       <h2 class=\"heading\" style=\"margin-top: 5px; margin-left: -15px;\"> Tours  </h2>\n");
      out.write("         <h2 class=\"heading\" style=\"margin-top: 5px;\"><a href=\"http://localhost:8080/indiatours/hotel.jsp\">Tours We offer</a> </h2>\n");
      out.write("         <div style=\"  width: 700px; clear: both; float: left;\">\n");
      out.write("             <p  style=\"color:  #ffffff; font-size: 16px; font-family: verdana;\">\n");
      out.write(" Compare Prices & Save Money on Online tours (Sri Lanka's Largest Travel Website). Millions of hotel reviews. Easy price comparison. Candid traveler photos. Types: Hotels, Resorts, All Inclusive Resorts, Boutique Hotels, Extended Stay Hotels, B&B, Inns, Villas. \n");
      out.write("         </p>\n");
      out.write("         </div>\n");
      out.write("         <div style=\"margin-left: 800px; margin-top: -90px;\">\n");
      out.write("         <span ><img src=\"bbb.jpg\" alt=\"\"></span>\n");
      out.write("         </div>\n");
      out.write("    </div>\n");
      out.write("     ...............................................................................................................\n");
      out.write("     <div  class=\"tours-block\"style=\" width:95.5%; margin-left: -23px; margin-right: 250px; clear: both;\">\n");
      out.write("        \n");
      out.write("       <h2 class=\"heading\" style=\"margin-top: 5px; margin-left: -15px;\"> Guides </h2>\n");
      out.write("         <h2 class=\"heading\" style=\"margin-top: 5px;\"><a href=\"http://localhost:8080/indiatours/hotel.jsp\">Guides We have</a> </h2>\n");
      out.write("         <div style=\"  width: 700px; clear: both; float: left;\">\n");
      out.write("             <p  style=\"color:  #ffffff; font-size: 16px; font-family: verdana;\">\n");
      out.write(" Compare Prices & Save Money on Online tours (Sri Lanka's Largest Travel Website). Millions of hotel reviews. Easy price comparison. Candid traveler photos. Types: Hotels, Resorts, All Inclusive Resorts, Boutique Hotels, Extended Stay Hotels, B&B, Inns, Villas. \n");
      out.write("         </p>\n");
      out.write("         </div>\n");
      out.write("         <div style=\"margin-left: 800px; margin-top: -90px;\">\n");
      out.write("         <span ><img src=\"ccc.jpg\" alt=\"\"></span>\n");
      out.write("         </div>\n");
      out.write("    </div>\n");
      out.write("     ...............................................................................................................\n");
      out.write("     \n");
      out.write("     <div  class=\"tours-block\"style=\" width:95.5%; margin-left: -23px; margin-right: 250px; clear: both;\">\n");
      out.write("        \n");
      out.write("       <h2 class=\"heading\" style=\"margin-top: 5px; margin-left: -15px;\"> Transport  </h2>\n");
      out.write("         <h2 class=\"heading\" style=\"margin-top: 5px;\"><a href=\"http://localhost:8080/indiatours/hotel.jsp\">Transport Services we offer</a> </h2>\n");
      out.write("         <div style=\"  width: 700px; clear: both; float: left;\">\n");
      out.write("             <p  style=\"color:  #ffffff; font-size: 16px; font-family: verdana;\">\n");
      out.write("        Compare Prices & Save Money on Online tours (Sri Lanka's Largest Travel Website). Millions of hotel reviews. Easy price comparison. Candid traveler photos. Types: Hotels, Resorts, All Inclusive Resorts, Boutique Hotels, Extended Stay Hotels, B&B, Inns, Villas. \n");
      out.write("         </p>\n");
      out.write("         </div>\n");
      out.write("         <div style=\"margin-left: 800px; margin-top: -90px;\">\n");
      out.write("         <span ><img src=\"ddd.jpg\" alt=\"\"></span>\n");
      out.write("         </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("     ...............................................................................................................\n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <footer style=\" margin-top: 0px;\">\n");
      out.write("           \n");
      out.write("</footer> \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
