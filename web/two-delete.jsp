<%@ page import="model.entity.Sarbaz" %>
<%@ page import="controler.SarbazControler" %><%--
  Created by IntelliJ IDEA.
  User: abolfazl.m
  Date: 9/5/2023
  Time: 12:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  Sarbaz sarbaz = new Sarbaz();
  sarbaz.setId(Long.parseLong(request.getParameter("del-id")));
  sarbaz.setFirstName(request.getParameter("del-first-name"));
  sarbaz.setLast_name(request.getParameter("del-last-name"));
  sarbaz.setTedadMorekhasi(Integer.parseInt(request.getParameter("del-tedad-morekhasi")));
  SarbazControler sarbazControler = new SarbazControler();
  if(sarbazControler.delete(sarbaz))
    response.sendRedirect("three.jsp");
  else
    response.sendRedirect("exeption.jsp");
%>