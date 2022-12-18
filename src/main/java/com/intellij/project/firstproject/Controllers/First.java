package com.intellij.project.firstproject.Controllers;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/First/*")
public class First extends HttpServlet implements Servlet{
    ServletConfig config=null;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config=config;
        System.out.println("servlet is initialized");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter out=res.getWriter();
        out.print("<html><body>");
        out.print("<b>hello simple servlet</b>");
        out.print("</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "copyright 2007-1010";
    }

    @Override
    public void destroy() {
        System.out.println("servlet is destroyed");
    }
}
