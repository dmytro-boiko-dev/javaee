<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>users</title>
</head>
<body>
<form action="<%=request.getContextPath().concat("/welcome-spring/users/save")%>" method="post">
    <input type="text" name="id" id="id" value="0" hidden/>
    <input type="text" name="name" id="name"/>
    <input type="text" name="surname" id="surname"/>
    <input type="submit" value="save/update"/>

</form>

<table border="2" width="100%">
    <c:forEach items="${usersList}" var="user">
        <tr onclick="
                document.getElementById('id').values='${user.id}';
                document.getElementById('name').values='${user.name}';
                document.getElementById('surname').values='${user.surname}';
                ">
            <td>
                <c:out value="${user.id}"/>
            </td>
            <td>
                <c:out value="${user.name}"/>
            </td>
            <td>
                <c:out value="${user.surname}"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
