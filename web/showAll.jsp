<%@ page import="model.entity.Sarbaz" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="controler.SarbazControler" %><%--
  Created by IntelliJ IDEA.
  User: abolfazl.m
  Date: 9/5/2023
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show all</title>
    <link rel="stylesheet" href="assets/bootstrap.css">
</head>
<body>
    <table class="table table-dark table-hover">
        <tr>
            <td>ID</td>
            <td>FIRST NAME</td>
            <td>LAST NAME</td>
            <td>TEDAD MOREKHASI BAGHI MANDE</td>
        </tr>
        <%
            List<Sarbaz> sarbazList;
            SarbazControler sarbazControler = new SarbazControler();
            sarbazList = sarbazControler.showAll();
            for (Sarbaz sarbaz : sarbazList) {
        %>
        <tr>
            <td><%=sarbaz.getId()%></td>
            <td><%=sarbaz.getFirstName()%></td>
            <td><%=sarbaz.getLast_name()%></td>
            <td><%=sarbaz.getTedadMorekhasi()%></td>
        </tr>
        <%
            }
        %>
    </table>
<p> back to home page <a href="index.jsp">click here</a></p>
</body>
</html>
