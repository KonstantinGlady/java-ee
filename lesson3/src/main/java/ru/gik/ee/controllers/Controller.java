package ru.gik.ee.controllers;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Controller", urlPatterns = {"", "/main", "/about","/cart","/order"})
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = "/WEB-INF/";
        switch (request.getServletPath()) {
            case "/":
            case "/main":
                url += "index.jsp";
                break;
           /* case "/catalog":
                url += "catalog.jsp";
                break;*/
            case "/about":
                url += "about.jsp";
                break;
            case "/cart":
                url += "cart.jsp";
                break;
            case "/order":
                url += "order.jsp";
                break;
        }
        request.getRequestDispatcher(url).forward(request, response);
    }

}

