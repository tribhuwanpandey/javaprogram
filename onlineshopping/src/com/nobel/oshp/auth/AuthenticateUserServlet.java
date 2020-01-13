package com.nobel.oshp.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class AuthenticateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");

		PrintWriter out = response.getWriter();

		if (uname.equals("tribhuwan") && pwd.equals("pandey")) {
			out.println("Login Success");
		} else {
			//out.println("Login Failed.");
			response.sendRedirect("index.html");
	}
}
