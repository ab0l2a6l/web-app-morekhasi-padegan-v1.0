<%@ page import="model.entity.Sarbaz" %>
<%@ page import="controler.SarbazControler" %><%--
  Created by IntelliJ IDEA.
  User: abolfazl.m
  Date: 9/5/2023
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Sarbaz sarbaz = new Sarbaz();
    SarbazControler sarbazControler = new SarbazControler();
    sarbaz.setId(Long.parseLong(request.getParameter("save-id")));
    sarbaz.setFirstName(request.getParameter("save-first-name"));
    sarbaz.setLast_name(request.getParameter("save-last-name"));
    sarbaz.setTedadMorekhasi(Integer.parseInt(request.getParameter("save-tedad-morekhasi")));
    sarbazControler.save(sarbaz);

%>