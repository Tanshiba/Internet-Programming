package com.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet
 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		String firstName = request.getParameter("Firstname");
		String lastName = request.getParameter("Lastname");
		String course = request.getParameter("course");
		String gender = request.getParameter("gender");
		String language[] = request.getParameterValues("Language");
		String transport[] = request.getParameterValues("transportation");
		String phone = request.getParameter("phonenumber");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
	
		
		
		
		
 		
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1> <u> REGISTRATION COMPLETE </u> </h1>");
		out.println("<h2>First Name :" + firstName + "</h2>");
		out.println("<h2>Last Name :" + lastName + "</h2>");
		out.println("<h2>Course :" + course + "</h2>");
		out.println("<h2>Gender :" + gender + "</h2>");
		
		
		out.println("<h2>Language/s : </h2>");
		
		if(language==null) {
			out.println("<b>None of the given languages were selected</b>");
		}else {
			
			for(String lang: language) {
				out.println("\t" + lang);
			}
			
		}
		
	
		
		out.println("<h2>Transportation/s : </h2>");
		
		for(String trans: transport) {
			out.println("\t" + trans);
		}
		
		out.println("<h2>Phone Number :" + phone + "</h2>");
		out.println("<h2>Address :" + address + "</h2>");
		out.println("<h2>Email :" + email + "</h2>");
		
		
		
		
		
		

	}

}
