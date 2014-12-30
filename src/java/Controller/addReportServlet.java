/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Users;
import Session.LogsManager;
import Session.ReportsManager;
import Session.UsersFacade;
import Session.UsersManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
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
public class addReportServlet extends HttpServlet {
@EJB
ReportsManager reportManager;
@EJB
UsersFacade usersFacade;
@EJB
LogsManager logManager;
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
        PrintWriter out = response.getWriter();
        List<Users> userR;
        String login;
               
        Integer icatM1StateAll=0, icatM1StateEquip=0, icatM1StateRNIS=0, icatM1StateOther=0; 
        String catM1StateAll=null, catM1StateEquip=null, catM1StateRNIS=null, catM1StateOther=null;
        Integer icatM1MunicAll=0, icatM1MunicEquip=0, icatM1MunicRNIS=0, icatM1MunicOther=0; 
        String catM1MunicAll=null, catM1MunicEquip=null, catM1MunicRNIS=null, catM1MunicOther=null;
        Integer icatM1CommercAll=0, icatM1CommercEquip=0, icatM1CommercRNIS=0, icatM1CommercOther=0; 
        String catM1CommercAll=null, catM1CommercEquip=null, catM1CommercRNIS=null, catM1CommercOther=null;
        
        Integer icatM2M3StateAll=0, icatM2M3StateEquip=0, icatM2M3StateRNIS=0, icatM2M3StateOther=0; 
        String catM2M3StateAll=null, catM2M3StateEquip=null, catM2M3StateRNIS=null, catM2M3StateOther=null;
        Integer icatM2M3MunicAll=0, icatM2M3MunicEquip=0, icatM2M3MunicRNIS=0, icatM2M3MunicOther=0; 
        String catM2M3MunicAll=null, catM2M3MunicEquip=null, catM2M3MunicRNIS=null, catM2M3MunicOther=null;
        Integer icatM2M3CommercAll=0, icatM2M3CommercEquip=0, icatM2M3CommercRNIS=0, icatM2M3CommercOther=0; 
        String catM2M3CommercAll=null, catM2M3CommercEquip=null, catM2M3CommercRNIS=null, catM2M3CommercOther=null;
        
        Integer icatLargeStateAll=0, icatLargeStateEquip=0, icatLargeStateRNIS=0, icatLargeStateOther=0; 
        String catLargeStateAll=null, catLargeStateEquip=null, catLargeStateRNIS=null, catLargeStateOther=null;
        Integer icatLargeMunicAll=0, icatLargeMunicEquip=0, icatLargeMunicRNIS=0, icatLargeMunicOther=0; 
        String catLargeMunicAll=null, catLargeMunicEquip=null, catLargeMunicRNIS=null, catLargeMunicOther=null;
        Integer icatLargeCommercAll=0, icatLargeCommercEquip=0, icatLargeCommercRNIS=0, icatLargeCommercOther=0; 
        String catLargeCommercAll=null, catLargeCommercEquip=null, catLargeCommercRNIS=null, catLargeCommercOther=null;

        Integer icatDangerStateAll=0, icatDangerStateEquip=0, icatDangerStateRNIS=0, icatDangerStateOther=0; 
        String catDangerStateAll=null, catDangerStateEquip=null, catDangerStateRNIS=null, catDangerStateOther=null;
        Integer icatDangerMunicAll=0, icatDangerMunicEquip=0, icatDangerMunicRNIS=0, icatDangerMunicOther=0; 
        String catDangerMunicAll=null, catDangerMunicEquip=null, catDangerMunicRNIS=null, catDangerMunicOther=null;
        Integer icatDangerCommercAll=0, icatDangerCommercEquip=0, icatDangerCommercRNIS=0, icatDangerCommercOther=0; 
        String catDangerCommercAll=null, catDangerCommercEquip=null, catDangerCommercRNIS=null, catDangerCommercOther=null;

        Integer icatSchoolStateAll=0, icatSchoolStateEquip=0, icatSchoolStateRNIS=0, icatSchoolStateOther=0; 
        String catSchoolStateAll=null, catSchoolStateEquip=null, catSchoolStateRNIS=null, catSchoolStateOther=null;
        Integer icatSchoolMunicAll=0, icatSchoolMunicEquip=0, icatSchoolMunicRNIS=0, icatSchoolMunicOther=0; 
        String catSchoolMunicAll=null, catSchoolMunicEquip=null, catSchoolMunicRNIS=null, catSchoolMunicOther=null;
        Integer icatSchoolCommercAll=0, icatSchoolCommercEquip=0, icatSchoolCommercRNIS=0, icatSchoolCommercOther=0; 
        String catSchoolCommercAll=null, catSchoolCommercEquip=null, catSchoolCommercRNIS=null, catSchoolCommercOther=null;

        Integer icatGKHStateAll=0, icatGKHStateEquip=0, icatGKHStateRNIS=0, icatGKHStateOther=0; 
        String catGKHStateAll=null, catGKHStateEquip=null, catGKHStateRNIS=null, catGKHStateOther=null;
        Integer icatGKHMunicAll=0, icatGKHMunicEquip=0, icatGKHMunicRNIS=0, icatGKHMunicOther=0; 
        String catGKHMunicAll=null, catGKHMunicEquip=null, catGKHMunicRNIS=null, catGKHMunicOther=null;
        Integer icatGKHCommercAll=0, icatGKHCommercEquip=0, icatGKHCommercRNIS=0, icatGKHCommercOther=0; 
        String catGKHCommercAll=null, catGKHCommercEquip=null, catGKHCommercRNIS=null, catGKHCommercOther=null;

        Integer icatDepartStateAll=0, icatDepartStateEquip=0, icatDepartStateRNIS=0, icatDepartStateOther=0; 
        String catDepartStateAll=null, catDepartStateEquip=null, catDepartStateRNIS=null, catDepartStateOther=null;
        Integer icatDepartMunicAll=0, icatDepartMunicEquip=0, icatDepartMunicRNIS=0, icatDepartMunicOther=0; 
        String catDepartMunicAll=null, catDepartMunicEquip=null, catDepartMunicRNIS=null, catDepartMunicOther=null;
        Integer icatDepartCommercAll=0, icatDepartCommercEquip=0, icatDepartCommercRNIS=0, icatDepartCommercOther=0; 
        String catDepartCommercAll=null, catDepartCommercEquip=null, catDepartCommercRNIS=null, catDepartCommercOther=null;
        
        String name_user = request.getRemoteUser();
        login = (String) getServletContext().getAttribute("login");

    if (request.authenticate(response)){
        getServletContext().setAttribute("notif", "Вы авторизованы в системе как пользователь: "+request.getRemoteUser() + " !");
        if (name_user.equals(login)) {
        
            Enumeration<String> parameters = request.getParameterNames();
            while (parameters.hasMoreElements()) {
                String parameter = parameters.nextElement();
            switch (parameter) {
// begin Получаем все по M1                
                case "catM1StateAll":
                    catM1StateAll=request.getParameter(parameter);
                    break;
                case "catM1StateEquip":
                    catM1StateEquip=request.getParameter(parameter);
                    break;
                case "catM1StateRNIS":
                    catM1StateRNIS=request.getParameter(parameter);
                    break;
                case "catM1StateOther":
                    catM1StateOther=request.getParameter(parameter);
                    break;

                case "catM1MunicAll":
                    catM1MunicAll=request.getParameter(parameter);
                    break;
                case "catM1MunicEquip":
                    catM1MunicEquip=request.getParameter(parameter);
                    break;
                case "catM1MunicRNIS":
                    catM1MunicRNIS=request.getParameter(parameter);
                    break;
                case "catM1MunicOther":
                    catM1MunicOther=request.getParameter(parameter);
                    break;

                case "catM1CommercAll":
                    catM1CommercAll=request.getParameter(parameter);
                    break;
                case "catM1CommercEquip":
                    catM1CommercEquip=request.getParameter(parameter);
                    break;
                case "catM1CommercRNIS":
                    catM1CommercRNIS=request.getParameter(parameter);
                    break;
                case "catM1CommercOther":
                    catM1CommercOther=request.getParameter(parameter);
                    break;
// end Получаем все по M1                
// begin Получаем все по M2M3                
                case "catM2M3StateAll":
                    catM2M3StateAll=request.getParameter(parameter);
                    break;
                case "catM2M3StateEquip":
                    catM2M3StateEquip=request.getParameter(parameter);
                    break;
                case "catM2M3StateRNIS":
                    catM2M3StateRNIS=request.getParameter(parameter);
                    break;
                case "catM2M3StateOther":
                    catM2M3StateOther=request.getParameter(parameter);
                    break;

                case "catM2M3MunicAll":
                    catM2M3MunicAll=request.getParameter(parameter);
                    break;
                case "catM2M3MunicEquip":
                    catM2M3MunicEquip=request.getParameter(parameter);
                    break;
                case "catM2M3MunicRNIS":
                    catM2M3MunicRNIS=request.getParameter(parameter);
                    break;
                case "catM2M3MunicOther":
                    catM2M3MunicOther=request.getParameter(parameter);
                    break;

                case "catM2M3CommercAll":
                    catM2M3CommercAll=request.getParameter(parameter);
                    break;
                case "catM2M3CommercEquip":
                    catM2M3CommercEquip=request.getParameter(parameter);
                    break;
                case "catM2M3CommercRNIS":
                    catM2M3CommercRNIS=request.getParameter(parameter);
                    break;
                case "catM2M3CommercOther":
                    catM2M3CommercOther=request.getParameter(parameter);
                    break;
// end Получаем все по M2M3                
// begin Получаем все по Large                
                case "catLargeStateAll":
                    catLargeStateAll=request.getParameter(parameter);
                    break;
                case "catLargeStateEquip":
                    catLargeStateEquip=request.getParameter(parameter);
                    break;
                case "catLargeStateRNIS":
                    catLargeStateRNIS=request.getParameter(parameter);
                    break;
                case "catLargeStateOther":
                    catLargeStateOther=request.getParameter(parameter);
                    break;

                case "catLargeMunicAll":
                    catLargeMunicAll=request.getParameter(parameter);
                    break;
                case "catLargeMunicEquip":
                    catLargeMunicEquip=request.getParameter(parameter);
                    break;
                case "catLargeMunicRNIS":
                    catLargeMunicRNIS=request.getParameter(parameter);
                    break;
                case "catLargeMunicOther":
                    catLargeMunicOther=request.getParameter(parameter);
                    break;

                case "catLargeCommercAll":
                    catLargeCommercAll=request.getParameter(parameter);
                    break;
                case "catLargeCommercEquip":
                    catLargeCommercEquip=request.getParameter(parameter);
                    break;
                case "catLargeCommercRNIS":
                    catLargeCommercRNIS=request.getParameter(parameter);
                    break;
                case "catLargeCommercOther":
                    catLargeCommercOther=request.getParameter(parameter);
                    break;
// end Получаем все по Large                
// begin Получаем все по Danger                
                case "catDangerStateAll":
                    catDangerStateAll=request.getParameter(parameter);
                    break;
                case "catDangerStateEquip":
                    catDangerStateEquip=request.getParameter(parameter);
                    break;
                case "catDangerStateRNIS":
                    catDangerStateRNIS=request.getParameter(parameter);
                    break;
                case "catDangerStateOther":
                    catDangerStateOther=request.getParameter(parameter);
                    break;

                case "catDangerMunicAll":
                    catDangerMunicAll=request.getParameter(parameter);
                    break;
                case "catDangerMunicEquip":
                    catDangerMunicEquip=request.getParameter(parameter);
                    break;
                case "catDangerMunicRNIS":
                    catDangerMunicRNIS=request.getParameter(parameter);
                    break;
                case "catDangerMunicOther":
                    catDangerMunicOther=request.getParameter(parameter);
                    break;

                case "catDangerCommercAll":
                    catDangerCommercAll=request.getParameter(parameter);
                    break;
                case "catDangerCommercEquip":
                    catDangerCommercEquip=request.getParameter(parameter);
                    break;
                case "catDangerCommercRNIS":
                    catDangerCommercRNIS=request.getParameter(parameter);
                    break;
                case "catDangerCommercOther":
                    catDangerCommercOther=request.getParameter(parameter);
                    break;
// end Получаем все по Danger                
// begin Получаем все по School                
                case "catSchoolStateAll":
                    catSchoolStateAll=request.getParameter(parameter);
                    break;
                case "catSchoolStateEquip":
                    catSchoolStateEquip=request.getParameter(parameter);
                    break;
                case "catSchoolStateRNIS":
                    catSchoolStateRNIS=request.getParameter(parameter);
                    break;
                case "catSchoolStateOther":
                    catSchoolStateOther=request.getParameter(parameter);
                    break;

                case "catSchoolMunicAll":
                    catSchoolMunicAll=request.getParameter(parameter);
                    break;
                case "catSchoolMunicEquip":
                    catSchoolMunicEquip=request.getParameter(parameter);
                    break;
                case "catSchoolMunicRNIS":
                    catSchoolMunicRNIS=request.getParameter(parameter);
                    break;
                case "catSchoolMunicOther":
                    catSchoolMunicOther=request.getParameter(parameter);
                    break;

                case "catSchoolCommercAll":
                    catSchoolCommercAll=request.getParameter(parameter);
                    break;
                case "catSchoolCommercEquip":
                    catSchoolCommercEquip=request.getParameter(parameter);
                    break;
                case "catSchoolCommercRNIS":
                    catSchoolCommercRNIS=request.getParameter(parameter);
                    break;
                case "catSchoolCommercOther":
                    catSchoolCommercOther=request.getParameter(parameter);
                    break;
// end Получаем все по School                
// begin Получаем все по GKH                
                case "catGKHStateAll":
                    catGKHStateAll=request.getParameter(parameter);
                    break;
                case "catGKHStateEquip":
                    catGKHStateEquip=request.getParameter(parameter);
                    break;
                case "catGKHStateRNIS":
                    catGKHStateRNIS=request.getParameter(parameter);
                    break;
                case "catGKHStateOther":
                    catGKHStateOther=request.getParameter(parameter);
                    break;

                case "catGKHMunicAll":
                    catGKHMunicAll=request.getParameter(parameter);
                    break;
                case "catGKHMunicEquip":
                    catGKHMunicEquip=request.getParameter(parameter);
                    break;
                case "catGKHMunicRNIS":
                    catGKHMunicRNIS=request.getParameter(parameter);
                    break;
                case "catGKHMunicOther":
                    catGKHMunicOther=request.getParameter(parameter);
                    break;

                case "catGKHCommercAll":
                    catGKHCommercAll=request.getParameter(parameter);
                    break;
                case "catGKHCommercEquip":
                    catGKHCommercEquip=request.getParameter(parameter);
                    break;
                case "catGKHCommercRNIS":
                    catGKHCommercRNIS=request.getParameter(parameter);
                    break;
                case "catGKHCommercOther":
                    catGKHCommercOther=request.getParameter(parameter);
                    break;
// end Получаем все по GKH                
// begin Получаем все по Depart                
                case "catDepartStateAll":
                    catDepartStateAll=request.getParameter(parameter);
                    break;
                case "catDepartStateEquip":
                    catDepartStateEquip=request.getParameter(parameter);
                    break;
                case "catDepartStateRNIS":
                    catDepartStateRNIS=request.getParameter(parameter);
                    break;
                case "catDepartStateOther":
                    catDepartStateOther=request.getParameter(parameter);
                    break;

                case "catDepartMunicAll":
                    catDepartMunicAll=request.getParameter(parameter);
                    break;
                case "catDepartMunicEquip":
                    catDepartMunicEquip=request.getParameter(parameter);
                    break;
                case "catDepartMunicRNIS":
                    catDepartMunicRNIS=request.getParameter(parameter);
                    break;
                case "catDepartMunicOther":
                    catDepartMunicOther=request.getParameter(parameter);
                    break;

                case "catDepartCommercAll":
                    catDepartCommercAll=request.getParameter(parameter);
                    break;
                case "catDepartCommercEquip":
                    catDepartCommercEquip=request.getParameter(parameter);
                    break;
                case "catDepartCommercRNIS":
                    catDepartCommercRNIS=request.getParameter(parameter);
                    break;
                case "catDepartCommercOther":
                    catDepartCommercOther=request.getParameter(parameter);
                    break;
// end Получаем все по Depart                
            }
        }
        //Преобразуем данные
//begin M1            
        if (catM1StateAll != null){ try {icatM1StateAll = Integer.parseInt(catM1StateAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM1StateEquip != null){ try {icatM1StateEquip = Integer.parseInt(catM1StateEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM1StateRNIS != null){ try {icatM1StateRNIS = Integer.parseInt(catM1StateRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM1StateOther != null){ try {icatM1StateOther = Integer.parseInt(catM1StateOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catM1MunicAll != null){ try {icatM1MunicAll = Integer.parseInt(catM1MunicAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM1MunicEquip != null){ try {icatM1MunicEquip = Integer.parseInt(catM1MunicEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM1MunicRNIS != null){ try {icatM1MunicRNIS = Integer.parseInt(catM1MunicRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM1MunicOther != null){ try {icatM1MunicOther = Integer.parseInt(catM1MunicOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catM1CommercAll != null){ try {icatM1CommercAll = Integer.parseInt(catM1CommercAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM1CommercEquip != null){ try {icatM1CommercEquip = Integer.parseInt(catM1CommercEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM1CommercRNIS != null){ try {icatM1CommercRNIS = Integer.parseInt(catM1CommercRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM1CommercOther != null){ try {icatM1CommercOther = Integer.parseInt(catM1CommercOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
//end M1            
//begin M2M3            
        if (catM2M3StateAll != null){ try {icatM2M3StateAll = Integer.parseInt(catM2M3StateAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM2M3StateEquip != null){ try {icatM2M3StateEquip = Integer.parseInt(catM2M3StateEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM2M3StateRNIS != null){ try {icatM2M3StateRNIS = Integer.parseInt(catM2M3StateRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM2M3StateOther != null){ try {icatM2M3StateOther = Integer.parseInt(catM2M3StateOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catM2M3MunicAll != null){ try {icatM2M3MunicAll = Integer.parseInt(catM2M3MunicAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM2M3MunicEquip != null){ try {icatM2M3MunicEquip = Integer.parseInt(catM2M3MunicEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM2M3MunicRNIS != null){ try {icatM2M3MunicRNIS = Integer.parseInt(catM2M3MunicRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM2M3MunicOther != null){ try {icatM2M3MunicOther = Integer.parseInt(catM2M3MunicOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catM2M3CommercAll != null){ try {icatM2M3CommercAll = Integer.parseInt(catM2M3CommercAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM2M3CommercEquip != null){ try {icatM2M3CommercEquip = Integer.parseInt(catM2M3CommercEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM2M3CommercRNIS != null){ try {icatM2M3CommercRNIS = Integer.parseInt(catM2M3CommercRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catM2M3CommercOther != null){ try {icatM2M3CommercOther = Integer.parseInt(catM2M3CommercOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
//end M2M3            
//begin Large            
        if (catLargeStateAll != null){ try {icatLargeStateAll = Integer.parseInt(catLargeStateAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catLargeStateEquip != null){ try {icatLargeStateEquip = Integer.parseInt(catLargeStateEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catLargeStateRNIS != null){ try {icatLargeStateRNIS = Integer.parseInt(catLargeStateRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catLargeStateOther != null){ try {icatLargeStateOther = Integer.parseInt(catLargeStateOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catLargeMunicAll != null){ try {icatLargeMunicAll = Integer.parseInt(catLargeMunicAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catLargeMunicEquip != null){ try {icatLargeMunicEquip = Integer.parseInt(catLargeMunicEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catLargeMunicRNIS != null){ try {icatLargeMunicRNIS = Integer.parseInt(catLargeMunicRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catLargeMunicOther != null){ try {icatLargeMunicOther = Integer.parseInt(catLargeMunicOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catLargeCommercAll != null){ try {icatLargeCommercAll = Integer.parseInt(catLargeCommercAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catLargeCommercEquip != null){ try {icatLargeCommercEquip = Integer.parseInt(catLargeCommercEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catLargeCommercRNIS != null){ try {icatLargeCommercRNIS = Integer.parseInt(catLargeCommercRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catLargeCommercOther != null){ try {icatLargeCommercOther = Integer.parseInt(catLargeCommercOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
//end Large            
//begin Danger            
        if (catDangerStateAll != null){ try {icatDangerStateAll = Integer.parseInt(catDangerStateAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDangerStateEquip != null){ try {icatDangerStateEquip = Integer.parseInt(catDangerStateEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDangerStateRNIS != null){ try {icatDangerStateRNIS = Integer.parseInt(catDangerStateRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDangerStateOther != null){ try {icatDangerStateOther = Integer.parseInt(catDangerStateOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catDangerMunicAll != null){ try {icatDangerMunicAll = Integer.parseInt(catDangerMunicAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDangerMunicEquip != null){ try {icatDangerMunicEquip = Integer.parseInt(catDangerMunicEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDangerMunicRNIS != null){ try {icatDangerMunicRNIS = Integer.parseInt(catDangerMunicRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDangerMunicOther != null){ try {icatDangerMunicOther = Integer.parseInt(catDangerMunicOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catDangerCommercAll != null){ try {icatDangerCommercAll = Integer.parseInt(catDangerCommercAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDangerCommercEquip != null){ try {icatDangerCommercEquip = Integer.parseInt(catDangerCommercEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDangerCommercRNIS != null){ try {icatDangerCommercRNIS = Integer.parseInt(catDangerCommercRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDangerCommercOther != null){ try {icatDangerCommercOther = Integer.parseInt(catDangerCommercOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
//end Danger            
//begin School            
        if (catSchoolStateAll != null){ try {icatSchoolStateAll = Integer.parseInt(catSchoolStateAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catSchoolStateEquip != null){ try {icatSchoolStateEquip = Integer.parseInt(catSchoolStateEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catSchoolStateRNIS != null){ try {icatSchoolStateRNIS = Integer.parseInt(catSchoolStateRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catSchoolStateOther != null){ try {icatSchoolStateOther = Integer.parseInt(catSchoolStateOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catSchoolMunicAll != null){ try {icatSchoolMunicAll = Integer.parseInt(catSchoolMunicAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catSchoolMunicEquip != null){ try {icatSchoolMunicEquip = Integer.parseInt(catSchoolMunicEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catSchoolMunicRNIS != null){ try {icatSchoolMunicRNIS = Integer.parseInt(catSchoolMunicRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catSchoolMunicOther != null){ try {icatSchoolMunicOther = Integer.parseInt(catSchoolMunicOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catSchoolCommercAll != null){ try {icatSchoolCommercAll = Integer.parseInt(catSchoolCommercAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catSchoolCommercEquip != null){ try {icatSchoolCommercEquip = Integer.parseInt(catSchoolCommercEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catSchoolCommercRNIS != null){ try {icatSchoolCommercRNIS = Integer.parseInt(catSchoolCommercRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catSchoolCommercOther != null){ try {icatSchoolCommercOther = Integer.parseInt(catSchoolCommercOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
//end School            
//begin GKH            
        if (catGKHStateAll != null){ try {icatGKHStateAll = Integer.parseInt(catGKHStateAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catGKHStateEquip != null){ try {icatGKHStateEquip = Integer.parseInt(catGKHStateEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catGKHStateRNIS != null){ try {icatGKHStateRNIS = Integer.parseInt(catGKHStateRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catGKHStateOther != null){ try {icatGKHStateOther = Integer.parseInt(catGKHStateOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catGKHMunicAll != null){ try {icatGKHMunicAll = Integer.parseInt(catGKHMunicAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catGKHMunicEquip != null){ try {icatGKHMunicEquip = Integer.parseInt(catGKHMunicEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catGKHMunicRNIS != null){ try {icatGKHMunicRNIS = Integer.parseInt(catGKHMunicRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catGKHMunicOther != null){ try {icatGKHMunicOther = Integer.parseInt(catGKHMunicOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catGKHCommercAll != null){ try {icatGKHCommercAll = Integer.parseInt(catGKHCommercAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catGKHCommercEquip != null){ try {icatGKHCommercEquip = Integer.parseInt(catGKHCommercEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catGKHCommercRNIS != null){ try {icatGKHCommercRNIS = Integer.parseInt(catGKHCommercRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catGKHCommercOther != null){ try {icatGKHCommercOther = Integer.parseInt(catGKHCommercOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
//end GKH            
//begin Depart            
        if (catDepartStateAll != null){ try {icatDepartStateAll = Integer.parseInt(catDepartStateAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDepartStateEquip != null){ try {icatDepartStateEquip = Integer.parseInt(catDepartStateEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDepartStateRNIS != null){ try {icatDepartStateRNIS = Integer.parseInt(catDepartStateRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDepartStateOther != null){ try {icatDepartStateOther = Integer.parseInt(catDepartStateOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catDepartMunicAll != null){ try {icatDepartMunicAll = Integer.parseInt(catDepartMunicAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDepartMunicEquip != null){ try {icatDepartMunicEquip = Integer.parseInt(catDepartMunicEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDepartMunicRNIS != null){ try {icatDepartMunicRNIS = Integer.parseInt(catDepartMunicRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDepartMunicOther != null){ try {icatDepartMunicOther = Integer.parseInt(catDepartMunicOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }

        if (catDepartCommercAll != null){ try {icatDepartCommercAll = Integer.parseInt(catDepartCommercAll);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDepartCommercEquip != null){ try {icatDepartCommercEquip = Integer.parseInt(catDepartCommercEquip);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDepartCommercRNIS != null){ try {icatDepartCommercRNIS = Integer.parseInt(catDepartCommercRNIS);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
        if (catDepartCommercOther != null){ try {icatDepartCommercOther = Integer.parseInt(catDepartCommercOther);} catch (NumberFormatException e) {System.err.println("Неверный формат строки!");} }
//end Depart            
        
        //login = (String) getServletContext().getAttribute("login");
        userR = (List<Users>) usersFacade.getUserLogin(login);
//        out.println(userR.get(0).getNameUser());
        Date currentDate = new Date();
            Integer codeReportOperation = reportManager.addReport(
			userR.get(0), currentDate,
                        icatM1StateAll, icatM1StateEquip, icatM1StateRNIS, icatM1StateOther,
			icatM1MunicAll, icatM1MunicEquip, icatM1MunicRNIS, icatM1MunicOther,
			icatM1CommercAll, icatM1CommercEquip, icatM1CommercRNIS, icatM1CommercOther,
			
			icatM2M3StateAll, icatM2M3StateEquip, icatM2M3StateRNIS, icatM2M3StateOther, 
			icatM2M3MunicAll, icatM2M3MunicEquip, icatM2M3MunicRNIS, icatM2M3MunicOther, 
			icatM2M3CommercAll, icatM2M3CommercEquip, icatM2M3CommercRNIS, icatM2M3CommercOther, 
        
			icatLargeStateAll, icatLargeStateEquip, icatLargeStateRNIS, icatLargeStateOther, 
			icatLargeMunicAll, icatLargeMunicEquip, icatLargeMunicRNIS, icatLargeMunicOther, 
			icatLargeCommercAll, icatLargeCommercEquip, icatLargeCommercRNIS, icatLargeCommercOther, 

			icatDangerStateAll, icatDangerStateEquip, icatDangerStateRNIS, icatDangerStateOther, 
			icatDangerMunicAll, icatDangerMunicEquip, icatDangerMunicRNIS, icatDangerMunicOther, 
			icatDangerCommercAll, icatDangerCommercEquip, icatDangerCommercRNIS, icatDangerCommercOther, 

                        icatSchoolStateAll, icatSchoolStateEquip, icatSchoolStateRNIS, icatSchoolStateOther, 
                        icatSchoolMunicAll, icatSchoolMunicEquip, icatSchoolMunicRNIS, icatSchoolMunicOther, 
                        icatSchoolCommercAll, icatSchoolCommercEquip, icatSchoolCommercRNIS, icatSchoolCommercOther, 

                        icatGKHStateAll, icatGKHStateEquip, icatGKHStateRNIS, icatGKHStateOther, 
                        icatGKHMunicAll, icatGKHMunicEquip, icatGKHMunicRNIS, icatGKHMunicOther, 
                        icatGKHCommercAll, icatGKHCommercEquip, icatGKHCommercRNIS, icatGKHCommercOther, 

                        icatDepartStateAll, icatDepartStateEquip, icatDepartStateRNIS, icatDepartStateOther, 
                        icatDepartMunicAll, icatDepartMunicEquip, icatDepartMunicRNIS, icatDepartMunicOther, 
                        icatDepartCommercAll, icatDepartCommercEquip, icatDepartCommercRNIS, icatDepartCommercOther 
			);

            switch (codeReportOperation) {
                case 0:
                    request.setAttribute("notif", "Ошибка в базе данных!");
                    break;
                case 1:
                    request.setAttribute("notif", "Отчет успешно записан");
                    break;
            }
            Integer codeLogOperation = logManager.addLogUser(userR.get(0), currentDate, "Создан отчет");
            userManager.newDateUser(userR.get(0), currentDate);
        
        //========================================================================================
       request.getRequestDispatcher("/WEB-INF/views/end_create_report.jsp").forward(request, response);
    
                } else {request.getRequestDispatcher("/WEB-INF/views/error_user_login_report.jsp").forward(request, response);}

    } //authenticate
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
