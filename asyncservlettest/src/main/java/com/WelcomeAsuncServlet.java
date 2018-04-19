package com;

import javax.servlet.AsyncContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "welcome", urlPatterns = "/welcome", asyncSupported = true)
public class WelcomeAsuncServlet extends HttpServlet{
//    @Override
//    protected void doGet(HttpServletRequest req, final HttpServletResponse resp) throws IOException {
//        //startWorker(resp);
//        final AsyncContext asyncContext = req.startAsync();
//
//       // req.authenticate()
//       //         req.getRemoteUser()
//
//        asyncContext.start(new Thread(){
//            public void run(){
//                try {
//                    Thread.sleep(3000);
//                    resp.getWriter().println("message for client");
//                    asyncContext.complete();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    System.out.println(e.getMessage());
//                }
//            }
//        });
//
//
//
//    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/index.html");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        if(AuthChecker.loginCorrect(username, password)){
            RequestDispatcher dispatcher = req.getRequestDispatcher("app");
            dispatcher.forward(req, resp);
        } else {
            resp.getWriter().println("error");
        }
    }
}