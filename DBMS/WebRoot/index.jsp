<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <form action="<%=path %>/drinkServlet" method="post">
 <p>ÇëÊäÈëÒûÁÏ±àºÅ:</p> 
 <p><input type="text" name="drinkId"/></p>
 <input type="submit" value="²éÑ¯"/>
 </form>
  <iframe id="input" src="<%=path %>/input.jsp" width="980" height="136" frameborder="0" scrolling="no" marginwidth="0px;"></iframe>
   
    
  </body>
</html>
