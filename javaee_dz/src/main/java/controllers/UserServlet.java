package controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//this is controller
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //connecting to HTML file
        RequestDispatcher view = req.getRequestDispatcher("/page_template.html");
        view.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String button1 = req.getParameter("button1");
        String getUsername = req.getParameter("username");

        if (button1 != null){
            PrintWriter writer = resp.getWriter(); // this is for talk with client
            writer.println("Hello " + getUsername);

            //PrintWriter alert = resp.getWriter();
            //alert.println("<script>alert(" + getUsername + ");</script>");

        }
    }
}
