<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>

<h1 align="center"> Beer recommendations JSP  </h1>

<p>
	
<%
	List<String> styleList = (List<String>) request.getAttribute("styles");
	Iterator<String> it = styleList.iterator();

	while(it.hasNext() )
	{
		out.println("<br> try : " + it.next() );
	}
	// written up to this

%>

</p>

</body>
</html>