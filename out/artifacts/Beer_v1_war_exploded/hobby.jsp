<%@ page import="classes.com.example.model.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="mine" uri="DiceFunctions" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Hobby Matcher</title>
</head>
<body>
The Friends who share your hobby of <%=request.getParameter("hobby")%> is :
<% Person person1 = (Person) request.getAttribute("person"); %>
<%= person1.getName()%>

<br>
We can use JSP action tag to do it as well :
<jsp:useBean id="person" type="classes.com.example.model.Person" class="classes.com.example.model.Friends"
             scope="request"/>
<jsp:getProperty name="person" property="name"/>

<br>
We can EL as well :
${person.name}

<br>
We can use EL with [] as well :
${person["name"]}

<br>
Let's try to use implicit object in EL to retrieve info from client :<br>
Username : ${param.username}<br>
Password : ${param.password}<br>

<br>
Let's use tag library :
${mine:rollIt()}

<br>
When Doing loop, without JSTL :
<%! List<String> singerList = new ArrayList<String>(); %>
<% singerList.add("Justin Bieber");
    singerList.add("Eminem");
    singerList.add("Micheal Jackson");%>

<table border="1">
    <tr>
        <%
            for (int i = 0; i < singerList.size(); i++) {%>
        <td><%=singerList.get(i)%>
        </td>
        <%
            }
        %>
    </tr>
</table>

<br>
Now Let's use JSTL :
<table border="1">
    <c:forEach var="movie" items="${movies}" varStatus="status">
        <tr>
            <td>${status.count}</td><td>${movie}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>