package com.LuJunHua.week2.homework;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        java.util.Date today = new java.util.Date();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1 align=center>"+"Name:Lu JunHua"+"</h1>");
        out.println("<h1 align=center>"+"ID:2019211001000820"+"</h1>");
        out.println("<h1 align=center>"+"Date:"+today+"</h1>");
        out.println("<h1 align=center>"+"LuJunHua"+"</h1>");
        out.println("</body>");
        out.println("<html>");
    }
}
