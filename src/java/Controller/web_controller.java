/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Report;
import Entity.Users;
import Session.ReportsManager;
import Session.UsersFacade;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Помогалов
 */
@WebServlet(name = "web_controller", loadOnStartup=1, urlPatterns = {"/common_phorm"})

public class web_controller extends HttpServlet {
@EJB
UsersFacade usersFacade;

    @Override
    public void init() throws ServletException {
//       getServletContext().setAttribute("usersIOGV", usersFacade.findAll());
       getServletContext().setAttribute("usersIOGV", usersFacade.getUsersGroup("iogv"));
       getServletContext().setAttribute("usersMunicipal", usersFacade.getUsersGroup("municipal"));
       String sessionUser = (String) getServletContext().getAttribute("sessionUser");
       if (sessionUser == null){
       getServletContext().setAttribute("notif", "Пожалуйста, пройдите авторизацию!");}
       else {
            String name_user = (String) getServletContext().getAttribute("sessionUser");
            getServletContext().setAttribute("notif", "WC Вы авторизованы в системе как пользователь: " + name_user + " !");}
       
    }
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
@SuppressWarnings("empty-statement")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userPath=request.getServletPath();
        Integer countReports = 0;        
        Date currentDate = new Date();

        String prnRep="";
        List<Users> userRep = null;
        List<Report> reportsUsr = null;
                
        PrintWriter printWriter=response.getWriter();
        getServletContext().setAttribute("sessionUser",request.getRemoteUser());
        if (request.authenticate(response)){
        //getServletContext().setAttribute("sessionUser",request.getRemoteUser());    
        getServletContext().setAttribute("notif", "Вы авторизованы в системе как пользователь: " + request.getRemoteUser() + " !");
        } else {
        //    getServletContext().setAttribute("sessionUser",null);
            getServletContext().setAttribute("notif", "Пожалуйста, пройдите авторизацию!");
        }
        
        
        if ("/common_phorm".equals(userPath)){
            String login = null;
            countReports = 0;
            userRep = null;
            reportsUsr = null;
            
            Enumeration<String> params = request.getParameterNames();
            while (params.hasMoreElements()) {
                String parameter = params.nextElement();
                login="login".equals(parameter)?request.getParameter(parameter):login;
            } 
            try{
                //printWriter.println(login);
                userRep = usersFacade.getUserLogin(login);
                if (userRep.size()>0) {
                    reportsUsr = userRep.get(0).getReportList();
                    countReports = reportsUsr.size();
                    //printWriter.println(Integer.toString(reportsUsr.size()));
                    getServletContext().setAttribute("reportToForm",reportsUsr );
                    getServletContext().setAttribute("countReports",countReports );
                    getServletContext().setAttribute("nameUserReports",userRep.get(0).getNameUser() );
                    getServletContext().setAttribute("login",login);
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
        
                if (countReports == 0) {
                    request.getRequestDispatcher("/WEB-INF/private/create_report.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("/WEB-INF/views/common_phorm.jsp").forward(request, response);
                //request.getRequestDispatcher("/WEB-INF/views"+userPath+".jsp").forward(request, response);
            }
    
    //request.getRequestDispatcher("/WEB-INF/views"+userPath+".jsp").forward(request, response);
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
