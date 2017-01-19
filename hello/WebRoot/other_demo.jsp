<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'other_demo.jsp' starting page</title>
    
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
      <%
         pageContext.setAttribute("num1", 10);  //设置page范围属性
         pageContext.setAttribute("num2", 20);
         pageContext.setAttribute("num3", 30);
      
       %>
       <h3>empty操作:${empty info }</h3>
       <h3>三目操作：${num1>num2?"大于":"小于" }</h3>
       <h3>括号操作：${num1*(num2+num3)}</h3>
  </body>
</html>
