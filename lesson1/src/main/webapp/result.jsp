<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>
<%
    int oper = Integer.parseInt(request.getParameter("oper"));
    double val1 = Double.parseDouble(request.getParameter("firstNum"));
    double val2 = Double.parseDouble(request.getParameter("secondNum"));
    double result = 0;
    switch(oper){
        case 1: result = val1 + val2;
            break;
        case 2: result = val1 - val2;
            break;
        case 3: result = val1 / val2;
            break;
        case 4: result = val1 * val2;
            break;
    }
%>
<h2>Результаты расчетов</h2>
<div>Число №1 = <%=val1%> </div>
<div>Число №2 = <%=val2%> </div>
<div>Ответ = <%=result%> </div>
<div><a href='index.jsp'>Вернуться на страницу с калькулятором.</a></div>
</body>
</html>

