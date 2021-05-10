/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp
 */
@WebServlet(urlPatterns = {"/LoginSystem"})
public class LoginSystem extends HttpServlet {

    
 public void doPost(HttpServletRequest request , HttpServletResponse response)
         throws ServletException ,IOException
 {
     response.setContentType("text/html");
     PrintWriter out = response.getWriter();
     RequestDispatcher red1;
     String login =  request.getParameter("login");
     String password = request.getParameter("password");
     String  session = request.getParameter("session_id");
     
     if(login.equals("ROHAN")&& password.equals("MORE"))
     {
         red1 = request.getRequestDispatcher("Welcome");
         red1.forward(request, response);
         
     }
     else
     {
         out.println("<p><h1>Incorrect Login Id/Password</h1></p>");
         red1= request.getRequestDispatcher("index.html");
         red1.include(request, response);
     }
     }
     
     
 }

