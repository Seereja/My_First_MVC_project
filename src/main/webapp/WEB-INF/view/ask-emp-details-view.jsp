<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<body>

<h2>Уважаемый сотрудник, пожалуйста, заполните свои данные</h2>

<br>
<br>

<%--<form action="showDetails" method="get">--%>
<%--    <input type="text" name="employeeName"--%>
<%--           placeholder="Введите ваше имя"/>--%>

<%--    <input type="submit">--%>

<%--</form>--%>


<form:form action="showDetails" modelAttribute="employee" method="post">

    Name<form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname<form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary<form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    phoneNumber<form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    Department<form:select path="department">
    <%--    <form:option value="Information Technology" label="IT"/>--%>
    <%--    <form:option value="Human Resourses" label="HR"/>--%>
    <%--    <form:option value="Sales" label="Sales"/>--%>
    <%--    заменили на hashMap--%>
    <form:options items="${employee.departments}"/>
    <br><br>
</form:select>
    <br>
    With car you want?
    <%--    <br>--%>
    <%--    BMV <form:radiobutton path="carBrand" value="BMV"/>--%>
    <%--    <br>--%>
    <%--    AUDI <form:radiobutton path="carBrand" value="AUDI"/>--%>
    <%--    <br>--%>
    <%--    LADA<form:radiobutton path="carBrand" value="LADA"/>--%>
    <%--    <br>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>
    Foreign languages(s)
    <%--    EN <form:checkbox path="languages" value="Englesh"/>--%>
    <%--    DE <form:checkbox path="languages" value="Deutch"/>--%>
    <%--    FR <form:checkbox path="languages" value="French"/>--%>
    <form:checkboxes path="languages" items="${employee.languageList}"/>


    <input type="submit" value="OK">
</form:form>
</body>

</html>