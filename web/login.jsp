<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/5
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>
<h1>Login</h1>
<form method="post" action="/LuJunHua2019211001000820_war_exploded/login">
    <table>
        <tr> <td>Username:</td> <td><input type="text" name="Username" required><br/></td></tr>
        <tr> <td>password:</td> <td><input type="password" name="password" required minlength="8"><br/></td></tr>
        <tr> <td></td><td><input type="submit" value="Login"/></td>  </tr>
    </table>
</form>
<%@include file="footer.jsp"%>
