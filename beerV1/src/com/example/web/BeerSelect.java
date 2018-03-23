package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;



public class BeerSelect extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
					throws IOException, ServletException
	{
		// response.setContentType("text/html");
		// PrintWriter out = response.getWriter();
		// out.println("Beer Selection Advice <br>");
		
		String color = request.getParameter("color");
		List<String> brandNames = getBrandNames(color);

		request.setAttribute("styles", brandNames);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");

		view.forward(request, response);

		// out.println("<br>  Got beer color " + c);

		// out.println("<br> <br> List of brand names <br> <br>");
		// out.println( getBrandNamesAsHtmlLines(c) );
	}

	private List<String> getBrandNames(String color)
	{
		BeerExpert beerExpert = new BeerExpert();
		return beerExpert.getBrandNames(color);
	}	

	private String getBrandNamesAsHtmlLines(String color)
	{
		String ret = "";
		List<String> brands = getBrandNames(color);
		for (String brandName : brands)
		{
			ret += ( "<br> " + brandName );
		}
		return ret;
	}
}