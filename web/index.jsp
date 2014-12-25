<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : 12.11.2014, 22:19:19
    Author     : Pomogalov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    if (request.getRemoteUser() == null) {
    request.getSession().setAttribute("notif", "Пожалуйста, пройдите авторизацию!");
    request.getSession().setAttribute("sessionUser", request.getRemoteUser());
    } else {
    request.getSession().setAttribute("notif", "Вы авторизованы в системе как пользователь: "+request.getRemoteUser() + " !");    
    }
%>
        <div id="main">
            <aside class="leftAside">
                <h2>Работа с системой</h2>
                <p>Чтобы начать работу с системой пройдите авторизацию и выберите интересующую организацию
                </p>
               
                <c:choose>
                    <c:when test="${sessionUser eq null}">
                        <a href="http://localhost:8080/reportglonass/login_user">Пройти авторизацию</a>
                    </c:when>
                    <c:otherwise>
                        <a href="http://localhost:8080/reportglonass/logout_user">Выйти из системы</a> 
                    </c:otherwise>
                </c:choose>                
                <br> </br>
            </aside>
            
    <c:if test="${notif ne null}">
            <div class="notif">
                <span>${notif}</span> 
            </div>
        </c:if>
            
            <section>
                <div id="iogv">
                    <h2>Государственные</h2>
                    <table class="table" border=1 cellpadding=0 cellspacing=0 width=290 style='border-collapse: collapse;table-layout:fixed;width:290pt'>
                        <col style='width:18pt'>
                        <col style='width:212pt'>
                        <col style='width:60pt'>
                    <tr>
                        <td>№</td>
                        <td>Наименование исполнительного органа государственной власти</td>
                        <td>Дата отчета</td>
                    </tr>
                
                <c:forEach var="user" items="${usersIOGV}">
                    <tr>
                        <td><div class="count2"></div></td>
                        <td><a href="common_phorm?login=${user.login}">${user.nameUser}</a></td>
                        <td>${user.dateLastReport}</td>
                    </tr>
  		</c:forEach>
                </table> 
                </div>    

            <div id="omsu">    
                <h2>Муниципальные</h2>
                <table class="table" border=1 cellpadding=0 cellspacing=0 width=487 style='border-collapse: collapse;table-layout:fixed;width:290pt'>
                        <col style='width:18pt'>
                        <col style='width:212pt'>
                        <col style='width:60pt'>
                    <tr>
                        <td>№</td>
                        <td>Наименование органа местного самоуправления</td>
                        <td>Дата отчета</td>
                    </tr>
                   
                <c:forEach var="user" items="${usersMunicipal}">
                    <tr>
                        <td><div class="count1"></div></td>
                        <td><a href="common_phorm?login=${user.login}&group=${user.groupUser}">${user.nameUser}</a></td>
                        <td>${user.dateLastReport}</td>
                    </tr>
  		</c:forEach>
                </table>                     
                    
            </div>
        </section>
            
</div>
