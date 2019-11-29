<%@ page import="java.io.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title></title>
</head>
<body>
    <%
        PrintWriter writer = response.getWriter();
        for(int i=0; i < 10; i++){
            writer.println(i);
        }
    %>

    <form method="post" action="<%=request.getContextPath().concat("/users/")%>">
        <input type="text" name="name" id="name"/>
        <input type="submit" value="add user"/>
    </form>

    <%
        Object usersList = request.getAttribute("usersList");
        response.getWriter().println(usersList);
    %>

</body>
</html>