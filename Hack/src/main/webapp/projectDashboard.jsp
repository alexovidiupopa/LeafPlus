<%@ page import="java.util.List" %>
<%@ page import="Model.Entities.Project" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: Razvan
  Date: 23-Nov-19
  Time: 1:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Project Dashboard</title>
</head>
<body>
<%
    List<Project> projects = (List) request.getAttribute("projects");
    Iterator it = projects.iterator();
    out.println("<br>We have <br><br>");
    while(it.hasNext()){
        out.println(it.next()+"<br>");
    }
%>
</body>
</html>
