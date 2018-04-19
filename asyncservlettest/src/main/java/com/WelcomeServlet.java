package com;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WelcomeServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        startWorker(resp);

    }

    private void startWorker(final HttpServletResponse resp) {
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    resp.getWriter().println("message for client");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
            }
        }.start();
    }
}
