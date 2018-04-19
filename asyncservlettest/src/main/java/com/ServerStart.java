package com;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.thread.QueuedThreadPool;

import java.net.InetSocketAddress;

public class ServerStart {
    public static void main(String[] args) throws Exception {

        InetSocketAddress address = new InetSocketAddress("localhost", 9999);
        Server server = new Server(address);

        QueuedThreadPool queuedThreadPool = new QueuedThreadPool(5, 1);


        // ServerConnector localhost = new ServerConnector(server, "localhost", 9999);
        //server.setConnectors(new Connector[] {});

        ServletContextHandler servletContextHandler = new ServletContextHandler();
        servletContextHandler.setContextPath("/web-context");

        ServletHolder servletHolder = new ServletHolder(WelcomeAsuncServlet.class); //servlet
        servletContextHandler.addServlet(servletHolder, "/welcome");
        servletHolder.setAsyncSupported(true); // add async

        server.setHandler(servletContextHandler);
        server.start();
        server.join();

    }
}
