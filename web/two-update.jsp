<%@ page import="model.entity.Sarbaz" %>
<%@ page import="controler.SarbazControler" %><%--
  Created by IntelliJ IDEA.
  User: abolfazl.m
  Date: 9/5/2023
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Sarbaz sarbaz = new Sarbaz();
    SarbazControler sarbazControler = new SarbazControler();

    int tedad = Integer.parseInt(request.getParameter("up-morekhasi-darkhasti"));

    sarbaz.setId(Long.parseLong(request.getParameter("up-id")));
    sarbaz.setFirstName(request.getParameter("up-first-name"));
    sarbaz.setLast_name(request.getParameter("up-last-name"));
    sarbaz.setTedadMorekhasi(Integer.parseInt(request.getParameter("up-tedad-morekhasi")));
    int result = sarbazControler.update(sarbaz , tedad );
    if (result == 1)
        response.sendRedirect("three.jsp");
    else if (result == -1)
        response.sendRedirect("exeption.jsp");
    else {
        response.sendRedirect("exep-update.jsp");
    }
%>
