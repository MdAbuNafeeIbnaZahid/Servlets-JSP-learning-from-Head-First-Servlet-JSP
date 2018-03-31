package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import java.util.*;


public class TestInitParams extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException
	{
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();


		out.println("testing init parameters<br>");

		ServletConfig servletConfiguration = getServletConfig();
		Enumeration<String> initParamNamesEnumeration = servletConfiguration.getInitParameterNames();

		out.println("init parameters of ServletConfiguration <br>");
		while( initParamNamesEnumeration.hasMoreElements() )
		{
			String paramName = initParamNamesEnumeration.nextElement();
			out.println("<br> param name = " + paramName + ", param value = "
			+ servletConfiguration.getInitParameter(paramName) + "<br>" );
		}

		ServletContext servletContext = getServletContext();
		initParamNamesEnumeration = servletContext.getInitParameterNames();

	
		out.println("init parameters of ServletContext <br>");
		while( initParamNamesEnumeration.hasMoreElements() )
		{
			String paramName = initParamNamesEnumeration.nextElement();
			out.println("<br> param name = " + paramName + ", param value = "
			+ servletContext.getInitParameter(paramName) + "<br>" );
		}	
	}


}

