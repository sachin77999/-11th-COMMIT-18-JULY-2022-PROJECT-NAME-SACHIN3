/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author hp
 */
public class FirstServlet implements Servlet {
    
    ServletConfig conf;
    
    public void init(ServletConfig conf)
    {
     this.conf=conf;
     System.out.println("creating object");
    }
    
    
    public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
    {
        System.out.println("servicing");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is my output from servlet method</h1>");
        out.println("<h1>Today date and time is "+ new Date().toString()+"</h1>");
        

    }
    public void destroy(){
        System.out.println("going to destroy servlet object");
    }
     // non life cycle methods
    
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
    public String getServletInfo()
    {
        return "this servlet is created by sachin soni";
    }
    
}
