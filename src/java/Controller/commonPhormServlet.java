/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Draftreport;
import Entity.Report;
import Entity.Users;
import Session.UsersFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Помогалов
 */
public class commonPhormServlet extends HttpServlet {
@EJB
UsersFacade usersFacade;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    List<Users> userRep = null;
    List<Draftreport> draftreportsUsr = null;
    Integer countDraftreports = 0; 
    
       String name_user = request.getRemoteUser();
       String login = (String) getServletContext().getAttribute("login");
        PrintWriter out = response.getWriter();
//        out.println("login:" + login + " --- name_user:" + name_user);

        if (request.authenticate(response)){
        getServletContext().setAttribute("notif", "Вы авторизованы в системе как пользователь: "+request.getRemoteUser() + " !");
        if (name_user == null ? login == null : name_user.equals(login)) {
            try{
                userRep = usersFacade.getUserLogin(login);
                if (userRep.size()>0) {
                    
                    draftreportsUsr = userRep.get(0).getDraftreportList();
                    countDraftreports = draftreportsUsr.size();
                    //out.println(countDraftreports);
                    getServletContext().setAttribute("countDraftreports",countDraftreports);
                    getServletContext().setAttribute("draftreportToForm",draftreportsUsr);
                    getServletContext().setAttribute("nameUserReports",userRep.get(0).getNameUser());
                        if (countDraftreports == 1) {
                            request.getRequestDispatcher("/WEB-INF/private/create_draft_report.jsp").forward(request, response);
                        } else {
                            request.getRequestDispatcher("/WEB-INF/private/create_report.jsp").forward(request, response);
                        }   
                }
                }catch(Exception e){
                    e.printStackTrace();
            }
            } else {request.getRequestDispatcher("/WEB-INF/views/error_user_login_report.jsp").forward(request, response);}
        }
        else { 
        request.getRequestDispatcher("/WEB-INF/private/login.jsp").forward(request, response);
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
    if (request.authenticate(response)){
        getServletContext().setAttribute("sessionUser",request.getRemoteUser());    
        getServletContext().setAttribute("notif", "Вы авторизованы в системе как пользователь: " + request.getRemoteUser() + " !");
        } else {
            getServletContext().setAttribute("sessionUser",null);
            getServletContext().setAttribute("notif", "Пожалуйста, пройдите авторизацию!");
        }    
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
        if (request.authenticate(response)){
        getServletContext().setAttribute("sessionUser",request.getRemoteUser());    
        getServletContext().setAttribute("notif", "Вы авторизованы в системе как пользователь: " + request.getRemoteUser() + " !");
        } else {
            getServletContext().setAttribute("sessionUser",null);
            getServletContext().setAttribute("notif", "Пожалуйста, пройдите авторизацию!");
        }
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
