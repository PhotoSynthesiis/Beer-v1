package classes.com.example.web;

import classes.com.example.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BeerSelect extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String color = request.getParameter("color");

        String cqBeer = getServletConfig().getInitParameter("Chongqing Beer");
        String qdBeer = getServletConfig().getInitParameter("Tsingdao Beer");

        request.setAttribute("cqBeer", cqBeer);
        request.setAttribute("qdBeer", qdBeer);

        BeerExpert expert = new BeerExpert();
        List<String> advices = expert.getBrands(color);
        request.setAttribute("styles", advices);

        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");  // 告诉Container，它的兄弟伙在哪里，名字叫什么
        dispatcher.forward(request, response); // 把当前的request和response传递给兄弟伙
    }
}
