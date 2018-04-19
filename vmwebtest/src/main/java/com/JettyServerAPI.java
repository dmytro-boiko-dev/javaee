package com;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class JettyServerAPI {
    public static void main(String[] args) throws Exception {
        Server server = new Server(9999);
        ServletContextHandler handler = new ServletContextHandler(server, "/abc");

        handler.addServlet(WelcomeServlet.class, "/welcome");
        server.start();
        server.join();

    }
}
