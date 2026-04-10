package com.tyss.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/user-data")
public class ReadUserData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servlet Triggered");
		String name = req.getParameter("username");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String pwd = req.getParameter("password");
		System.out.println("-----------User-Data-------------");

		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(pwd);

	}

}
