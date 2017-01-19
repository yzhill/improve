<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'print_collection.jsp' starting page</title>
    
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
           List all=new ArrayList();
           all.add("林心如");
           all.add("www.google.com");
           all.add("783665184@qq.com");
           session.setAttribute("allinfo", all);
         %>
          <h3> 第一个元素：${allinfo[0]}</h3>
          <h3> 第二个元素：${allinfo[1]}</h3>
          <h3> 第三个元素：${allinfo[2]}</h3>
  </body>
</html>
