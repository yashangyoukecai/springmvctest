<%--
  Created by IntelliJ IDEA.
  User: wklmogujie
  Date: 15/10/26
  Time: 下午8:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<body>
<div>
  <form action="/user/login" id="loginform" method="post">
    <table align="center" style="padding: 100px">
      <tr>
        <td>姓名：<input type="text" name="Username" id="Username" /> *必需 </td>
        <td><form:errors path="*"/></td>
      </tr>
      <tr>
        <td>密码：<input type="password" name="password" id="password"> *必需 </td>
      </tr>
      <tr>
        <td><input type="submit"></td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>
