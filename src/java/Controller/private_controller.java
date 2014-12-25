/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pomogalov
 */
@WebServlet(name = "private_controller", urlPatterns = {"/private"})
//@ServletSecurity( @HttpConstraint(rolesAllowed = {"private"}) )

public class private_controller extends HttpServlet {

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
        if (null != request.getServletPath())switch (request.getServletPath()) {
/*            case "/registration":
                request.setAttribute("name", request.getUserPrincipal().getName());
                request.getRequestDispatcher("WEB-INF/administration/registration.jsp").forward(request, response);
                break;
            case "/create_report":
//                request.setAttribute("name", request.getUserPrincipal().getName());
                request.getRequestDispatcher("WEB-INF/private/create_report.jsp").forward(request, response);
                break;
*/
            case "/private":
                request.setAttribute("sessionUser", request.getUserPrincipal().getName());
                request.setAttribute("notif", "P Вы зарегистровались в системе как пользователь: "+request.getUserPrincipal().getName()+"!");
                request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
                break;
            case "/log_out":
               HttpSession session = request.getSession(false);
                if (session!= null){
                    session.invalidate();
                }
                out.println("OKKKKKKK");
                request.logout();
                //response.sendRedirect("/");
                request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
                break; 
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
      request.setAttribute("sessionUser", request.getUserPrincipal().getName());
      request.setAttribute("notif", "P Вы зарегистровались в системе как пользователь: "+request.getUserPrincipal().getName()+"!");   
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

}
