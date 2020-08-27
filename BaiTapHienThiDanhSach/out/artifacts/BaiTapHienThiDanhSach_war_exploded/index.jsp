<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 27/8/2020
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>DanhSachKhachHang</title>
  </head>
  <body>
<c:forEach items="ArrayList hello=new ArrayList<String>(){
        {
            add(\"1\");
            add(\"2\");
            add(\"3\");
            add(\"4\");
            add(\"5\");
            add(\"6\");
        }
    }" var="person">
    <p>items <c:out value = "${person}"/></p>
</c:forEach>

 </body>
</html>
