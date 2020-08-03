package ru.gik.javaEE.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Product", urlPatterns = "/product")
public class Product extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(Product.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("new get product");
        resp.getWriter().printf("<h1>Продукты</h1>");
        resp.getWriter().printf("<a href="+req.getContextPath()+"/cart>Cart</a></br>");
        resp.getWriter().printf("<a href="+req.getContextPath()+"/main>Main</a></br>");
        resp.getWriter().printf("<a href="+req.getContextPath()+"/catalog>Catalog</a></br>");
        resp.getWriter().printf("<a href="+req.getContextPath()+"/order>Order</a></br>");
    }
}
