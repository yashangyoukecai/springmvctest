<%--
  Created by IntelliJ IDEA.
  User: wklmogujie
  Date: 15/10/24
  Time: 下午3:16
  To change this template use File | Settings | File Templates.
--%>
<!-- register.jsp 注册展示页面-->
<form method="post">
  username:<input type="text" name="username" value="${user.username}"><br/>
  password:<input type="password" name="username"><br/>
  city:<select>
  <c:forEach items="${cityList }" var="city">
    <option>${city}</option>
  </c:forEach>
</select><br/>
  <input type="submit" value="注册"/>
</form>
