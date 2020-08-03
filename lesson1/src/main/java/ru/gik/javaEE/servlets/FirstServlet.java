package ru.gik.javaEE.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
public class FirstServlet extends HttpServlet {

    Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("get method");
        resp.getWriter().printf("<h1>new get request</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("post method");
        resp.getWriter().printf("<h1> new post request</h1>");
    }
}
