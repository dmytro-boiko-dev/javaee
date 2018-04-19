package com.controllers;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/welcome")
public class WelcomeFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String login = servletRequest.getParameter("login");
        if (login == null) {
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            response.setStatus(401);
            return;
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }


}
