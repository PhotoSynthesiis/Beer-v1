package classes.com.example.web;

import classes.com.example.model.HobbyMatcher;
import classes.com.example.model.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HobbyServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("hobby.jsp");

        HobbyMatcher matcher = new HobbyMatcher();
        String hobby = request.getParameter("hobby");
        Person person = matcher.getMembers(hobby);

        String[] movies = {"King Lear", "Sky Fall", "古惑仔", "Cloud Altas"};

        request.setAttribute("person", person);
        request.setAttribute("movies", movies);

        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
