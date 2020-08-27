<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 27/8/2020
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="calculate.jsp" method="post">
      <input type="number" id="a" name="a">
      <select name="operand">
        <option>+</option>
        <option>-</option>
        <option>*</option>
        <option>/</option>
      </select>
      <input type="number" id="b" name="b">
     <input type="submit">
    </form>
  </body>
</html>
