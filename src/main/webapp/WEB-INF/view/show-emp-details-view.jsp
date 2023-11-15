<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>

<h2>Добро пожаловать, дорогой</h2>
<br>
<br>
<br>
<br>
<%--${param.employeeName}!--%>

<%--Your name:${nameAttribute} ${description}--%>
Your name:${employee.name}
<br>
Your surname:${employee.surname}
<br>
Your salary:${employee.salary}
<br>
<br>
Your department:${employee.department}
<br>
<br>
Your car:${employee.carBrand}
<br>
<br>
Your phoneNumber:${employee.phoneNumber}
<br>
<br>
Your email:${employee.email}
<br>
<br>
Languages:
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
</body>
</html>
