<%--
  Created by IntelliJ IDEA.
  User: abolfazl.m
  Date: 9/4/2023
  Time: 10:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>niroye ensani</title>
      <script src="assets/save-validation.js"></script>
      <script src="assets/est-validation.js"></script>
      <script src="assets/up-validation.js"></script>
      <script src="assets/del-validation.js"></script>
  </head>
  <body>
  ---------insert------------------------------
      <form action="two-save.jsp" id="save-sub"><%-- save --%>
          <input type="text" id="save-id" name="save-id" placeholder="id">
          <input type="text" id="save-first-name" name="save-first-name" placeholder="first name">
          <input type="text" id="save-last-name" name="save-last-name" placeholder="last name">
          <input type="text" id="save-tedad-morekhasi" name="save-tedad-morekhasi" placeholder="tedad morekhasi">
          <input type="button" value="submit" onclick="saveValidation()">
      </form>
  ---------update------------------------------
      <form action="two-update.jsp" id="up-sub"><%-- update --%>
          <input type="text" id="up-id" name="up-id" placeholder="id">
          <input type="text" id="up-first-name" name="up-first-name" placeholder="first name">
          <input type="text" id="up-last-name" name="up-last-name" placeholder="last name">
          <input type="text" id="up-tedad-morekhasi" name="up-tedad-morekhasi" placeholder="tedad morekhasi">
          <input type="text" id="up-morekhasi-darkhasti" name="up-morekhasi-darkhasti" placeholder="morekhasi darkhasti">
          <input type="button" value="submit" onclick="upValidation()">
      </form>
  ---------delete------------------------------
      <form action="two-delete.jsp" id="del-sub"><%-- delete --%>
          <input type="text" id="del-id" name="del-id" placeholder="id">
          <input type="text" id="del-first-name" name="del-first-name" placeholder="first name">
          <input type="text" id="del-last-name" name="del-last-name" placeholder="last name">
          <input type="text" id="del-tedad-morekhasi" name="del-tedad-morekhasi" placeholder="tedad morekhasi">
          <input type="button" value="submit" onclick="deleteValidation()">
      </form>
  ---------estelam------------------------------
      <form action="estelam.jsp" id="est-sub"><%-- estelam --%>
            <input type="text" id="est-id" name="est-id" placeholder="id">
            <input type="button" value="estelam" onclick="estelamValidation()">
      </form>
  ---------show all------------------------------
      <form action="showAll.jsp"><%-- showAll --%>
          <input type="submit" value="show all">
      </form>
  </body>
</html>
