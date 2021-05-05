/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp
 */
public class URL1 extends HttpServlet 
{
    public void doGet(HttpServletRequest request , HttpServletResponse response)
          
      throws ServletException , IOException 
    {
       String max;
       
    response.setContentType("text/html");
    PrintWriter out =response.getWriter();
    max ="http://localhost:8080/URLRewrite/Url2?a idl-054  id2-055";
    out.println("<a href-"+max+"> <h1>WELCOME TO SVVV</h1></a>");
    
    }
}





  