/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Session.UsersManager;

/**
 *
 * @author Помогалов
 */
public class addUserServlet extends HttpServlet {
@EJB
UsersManager userManager;
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
       
        
        PrintWriter printWriter=response.getWriter();
                 
            String login=null,pass=null,pass2=null, nams=null, grUser=null;
            Enumeration<String> parameters = request.getParameterNames();
            while (parameters.hasMoreElements()) {
                String parameter = parameters.nextElement();
            switch (parameter) {
                case "login":
                    login=request.getParameter(parameter);
                    break;
                case "password":
                    pass=request.getParameter(parameter);
                    break;
                case "password2":
                    pass2=request.getParameter(parameter);
                    break;
                case "nameUser":
                    nams=request.getParameter(parameter);
                    break;
                case "groupUser":
                    grUser=request.getParameter(parameter);
                    break;
                    
            }
        }
        //printWriter.println(nams);

            Integer codeOperation=userManager.addUser(login, pass, pass2, nams, grUser);
            switch (codeOperation) {
                case 0:
                    request.setAttribute("notif", "Пользователь "+login+" успешно создан!");
                    break;
                case 1:
                    request.setAttribute("notif", "Ошибка в базе данных!");
                    break;
                case 2:
                    request.setAttribute("notif", "Введенные пароли не совпадают");
                    break;
                case 3:
                    request.setAttribute("notif", "Повторите ввод еще раз! Пользователь "+login+" уже существует!");
                    break;
            }
           
            
            try
            {
                request.getRequestDispatcher("/registration").forward(request, response);        
            }
            catch (ServletException | IOException e)
            {
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

}
