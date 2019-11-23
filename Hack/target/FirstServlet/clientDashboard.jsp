<%@ page import="Model.Entities.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 23-Nov-19
  Time: 1:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Clients Dashboard</title>
</head>
<body>
<%
    List<Student> result = (List<Student>) request.getAttribute("students");
    Iterator it = result.iterator();
    while(it.hasNext()){
        out.println(it.next() + "<br>");
    }
    %>
</body>
</html>
