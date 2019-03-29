package Tourpak;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import db.DBUtils;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Oops
 */
public class PostHotel extends HttpServlet {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String s1 = request.getParameter("hname");
        String s2 = request.getParameter("city");
        String s3 = request.getParameter("address");
        String s4 = request.getParameter("car");
        String s5 = request.getParameter("description");
        String s6 = request.getParameter("contact");
        try {
            /* TODO output your page here. You may use following sample code. */
            // Class.forName("com.mysql.jdbc.Driver");
            //  out.println("driver loaded");
            // Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root" ,"");
            //  out.println("Connect");
            //Statement st = con.createStatement();

            DBUtils db = new DBUtils();
            db.st.executeUpdate("insert into travel.hotel (hotel_name,hotel_city,hotel_address,car,description,contact_no) values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "') ");
            response.sendRedirect("hotel.jsp");

        } catch (SQLException ex) {
            Logger.getLogger(PostHotel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    // public void edit (String hotel_name, String hotel_city, String address, String car, String description, String contact_no){
    //   String sql = "update travel set hotel_name=?,hotel_cty=?,address=?,car=?,description=?,contact_no=?";
    // PreparedStatement ps;}
    public void edit(String hid, String hotel_name, String hotel_city, String address, String car, String description, String contact_no) {
        try {
            String sql = "update travel set hotel_name='" + hotel_name + "',hotel_cty='" + hotel_city + "',address='" + address + "',car='" + car + "',description='" + description + "',contact_no='" + contact_no + "' where hid = '" + hid + "'";
            //PreparedStatement ps = DBUtils.getPreparedStatement(sql);
//            ps.setString(1, hotel_name);
//            ps.setString(2, hotel_city);
//            ps.setString(3, address);
//            ps.setString(4, car);
//            ps.setString(5, description);
//            ps.setString(6, contact_no);
//            ps.executeUpdate();

            DBUtils db = new DBUtils();
            db.st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(PostHotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int hid) {
        try {
            String sql = "delete News where id = '" + hid + "'";
//            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
//            ps.setInt(1, hid);

            DBUtils db = new DBUtils();
            db.st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(PostHotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
