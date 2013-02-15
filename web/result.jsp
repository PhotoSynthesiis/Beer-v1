<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="classes.com.example.model.Counter" %>
<html>
<body>
<h1>Beer Recommendations JSP</h1>

<p>
    <%
        List<String> styles = (List<String>) request.getAttribute("styles");
        Iterator iterator = styles.iterator();
        PrintWriter writer = response.getWriter();
        while (iterator.hasNext()) {
            writer.println("<br> why not try : " + iterator.next());
        }
        writer.println("<br> <strong>servlet init-param :</strong> " + request.getAttribute("cqBeer"));
        writer.println("<br> <strong>servlet init-param :</strong> " + request.getAttribute("qdBeer"));

        writer.println(("<br> <strong>context init-param :</strong> " + request.getServletContext().getAttribute("occupation")));
    %>
    should present JSP result (Counter model): <%= Counter.getCount() %><br>
    <%! int count = 0; %>
    should present JSP result (inner declaration): <%= count++%>
</p>
</body>
</html>