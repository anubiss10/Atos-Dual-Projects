package com.app.Ejercicio1Servlets;


	import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.annotation.WebServlet;

	@WebServlet("/Ejercicio/ServletJulian")
	public class ServletJulian extends HttpServlet {

	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        response.getWriter().println("<h1>Hola mundo!</h1>");
	    }
	}


