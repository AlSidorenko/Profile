<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 16.12.2019
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Statistic</title>
</head>
<body>
    <br/>
    <p><b> Statistic </b></p>

<%
    Map<String, Map<String, Integer>> statistic = (Map<String, Map<String, Integer>>) request.getAttribute("statistic");
    for (String numb : statistic.keySet()) {
        out.print("<p>");
        out.print("Question № " + numb + "<br>");
        Map<String, Integer> question = statistic.get(numb);
        for (String key : question.keySet()) {
            out.print("<br>");
            out.print(key + " - " + question.get(key));
        }
        out.print("</p>");
    }
%>
</body>
</html>
