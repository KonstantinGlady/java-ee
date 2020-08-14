package ru.gik.ee.controllers;

import ru.gik.ee.repositories.ProductsRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductsController", urlPatterns = "/catalog")
public class ProductsController extends HttpServlet {

    private ProductsRepository repository;

    @Override
    public void init() throws ServletException {
        repository = new ProductsRepository();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("txt/html; charset=utf-8");
        req.setAttribute("products", repository.getProducts());
        String url = "/WEB-INF/";
        req.getRequestDispatcher(url += "catalog.jsp").forward(req, resp);
    }
}
