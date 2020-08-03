package ru.gik.javaEE.errors;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(urlPatterns = "/error_403")
public class Error_403 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try (Writer writer = resp.getWriter()) {
            writer.write("<html><head><title>Error handler servlet</title></head><body>");
            writer.write("<h2>Error description</h2>");
            writer.write("<h2>403 forbidden</h2>");
            writer.write("</body></html>");
        }
    }
}
