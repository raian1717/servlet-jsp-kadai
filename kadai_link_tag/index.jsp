
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>課題</title>
	</head>
	<body>
		
		<a href ="<%= request.getContextPath() %>/j2s?username=侍太郎">名前「侍太郎」をServletに送信</a>
		<br>
		    <% 
        String result = (String) request.getAttribute("text");
        if (result != null) {
            out.print(result);
        }
    %>

		

		
	</body>
</html>

