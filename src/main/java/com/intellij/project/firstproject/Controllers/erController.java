package com.intellij.project.firstproject.Controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/erController/*")
public class erController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Throwable throwable = (Throwable)
                req.getAttribute("java.lang.Throwable");

        Integer statusCode = (Integer)
                req.getAttribute("javax.servlet.error.status_code");
        String servletName = (String)
                req.getAttribute("javax.servlet.error.servlet_name");
        resp.getWriter().write(String.valueOf(throwable)+" "+servletName);
    }
}
