<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 16.12.2019
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    </b></p>
    <form action='/statistic' method='POST'>

        <br>
        <p><b>What is your gender?</b></p>
        <p><input name="gender" type="radio" value="Male"> Male</p>
        <p><input name="gender" type="radio" value="Female"> Female</p>

        <br>
        <p><b>Which language do you prefer?</b></p>
        <p><input name="language" type="radio" value="English"> English</p>
        <p><input name="language" type="radio" value="Deutsch"> Deutsch</p>
        <p><input name="language" type="radio" value="French"> French</p>

        <br>
        <p><b>Do you have children?</b></p>
        <p><input name="children" type="radio" value="Yes"> Yes </p>
        <p><input name="children" type="radio" value="No"> No </p>

        <input type="submit" value="Send">
    </form>

</body>
</html>
