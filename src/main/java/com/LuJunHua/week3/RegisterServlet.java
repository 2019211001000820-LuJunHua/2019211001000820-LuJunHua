package com.LuJunHua.week3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Username = req.getParameter("Username");
        String Password = req.getParameter("Password");
        String Email = req.getParameter("Email");
        String Gender = req.getParameter("Gender");
        String BirthDate = req.getParameter("BirthDate");

        PrintWriter writer = resp.getWriter();
        writer.println("<br/>");
        writer.println("<br/>Username: " + Username);
        writer.println("<br/>Password: " + Password);
        writer.println("<br/>Email: " + Email);
        writer.println("<br/>Gender: " + Gender);
        writer.println("<br/>BirthDate: "  + BirthDate);
        writer.println("<br/>");

        writer.close();
    }
}