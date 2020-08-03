package ru.gik.javaEE.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "BasicServlet", urlPatterns = "basic_servlet")
public class BasicServlet implements Servlet {

private static Logger logger = LoggerFactory.getLogger(BasicServlet.class);
private transient ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("new request");
        servletResponse.getWriter().println("<h1> Servlet basic</h1>");
    }

    @Override
    public String getServletInfo() {
        return "BasicServlet";
    }

    @Override
    public void destroy() {
       logger.info("servlet {} destroyed", getServletInfo());
    }
}
