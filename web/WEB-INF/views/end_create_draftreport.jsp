<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="main">

<aside class="leftAside">
    <h2>Что нужно для продолжения работы</h2>
    <p>Ваши предварительные данные успешно сохранены! Для продолжения работы с системой перейдите на главную страницу
    </p>
     <a href="./">Перейти на главную страницу</a> 
      <br> </br>
</aside>
<article>
    <div class="h1">
    <h1>Закончен ввод предварительных данных для отчета</h1>
    </div>
    <div class="h2">
    <h2>по пользователю:     ${nameUserReports}</h2>    
    </div>
</article>

    <c:if test="${notif ne null}">
            <div class="notif">
                <span>${notif}</span> 
            </div>
        </c:if>

</div>

