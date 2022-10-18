package com.elvis.business;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This servlet program is used to print "Hello World"
 * on client browser using HttpServlet class.
 */

public class ElvisHelloWorld3 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // no-argument constructor
    public ElvisHelloWorld3 () {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h3> Hello guys! This is a hello world example using \'HttpServlet class\'. </h3>");
        printWriter.close();
    }
}
