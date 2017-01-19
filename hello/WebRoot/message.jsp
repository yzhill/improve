<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'message.jsp' starting page</title>
    
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
    <fmt:bundle basename="Message">
       <fmt:message key="name" var="nameref"/>
    </fmt:bundle>
    <h3>ĞÕÃû£º${nameref}</h3>
    <fmt:bundle basename="Message">
       <fmt:message key="info" var="inforef">
           <fmt:param value="MLDN"/>
       </fmt:message>
    </fmt:bundle>
    <h3>ĞÅÏ¢£º${inforef}</h3>
  </body>
</html>
