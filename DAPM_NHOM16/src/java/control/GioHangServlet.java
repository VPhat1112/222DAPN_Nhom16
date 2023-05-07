/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import dao.DAO;
import entity.Account;
import entity.Category;
import entity.Giohang;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "GioHangServlet", urlPatterns = {"/GioHang"})
public class GioHangServlet extends HttpServlet {
    private DAO ProductDao= new DAO(); 
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
        HttpSession session = request.getSession();
        Giohang gh = new Giohang();
        int id = Integer.parseInt(request.getParameter("bid"));
        Account a = (Account) session.getAttribute("acc");
        int sid = a.getId();
        
        DAO dao = new DAO();
        dao.InsertToCart(sid, id, 100, 50);
        ArrayList list = (ArrayList) dao.getProductBySellID(id);
        //List<Category> listC = dao.getAllCategory();

        //request.setAttribute("ListCC", listC);
        request.setAttribute("ListP", list);
        request.getRequestDispatcher("ManagerProduct.jsp").forward(request, response);

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
        doPost(request, response);
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
//        HttpSession session =request.getSession();
//        Giohang cart = (Giohang) session.getAttribute("cart");
//        String msp = request.getParameter("pid");
//        String Command = request.getParameter("command");
//        ArrayList<Long> listBuy = null;
//        String url="";
//        try {
//            listBuy = (ArrayList<Long>) session.getAttribute("cartID");
//            long idBuy = 0;
//            if (request.getParameter("cartID") != null) {
//                idBuy = Long.parseLong(request.getParameter("cartID"));
//            }
//                Product p = ProductDao.getProductByID(msp);
//                switch (Command) {
//                    case "insert":
//                        if (listBuy == null) {
//                            listBuy = new ArrayList<>();
//                            session.setAttribute("cartID", listBuy);
//                        }
//                        if (listBuy.indexOf(idBuy) == -1) {
//                            cart.InsertToCart(p, 1);
//                            listBuy.add(idBuy);
//                        }
//                        url = "/Cart.jsp";
//                        break;
//                    default:
//                        break;
//                }
//            
//            RequestDispatcher rd=getServletContext().getRequestDispatcher(url);
//            rd.forward(request,response);
//        } catch (Exception e) {
//        }
        
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

}
