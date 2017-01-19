<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'print_map.jsp' starting page</title>
    
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
        Map map=new HashMap();
        map.put("name","周杰伦");
        map.put("mldn","www.baodu.com");
        map.put("email","783665184@qq.com");
        session.setAttribute("info", map); //session范围内保存集合
      %>
      <h3>KEY为name的内容 ：  ${info["name"] }</h3>
      <h3>KEY为mldn的内容 ：  ${info["mldn"] }</h3>
      <h3>KEY为email的内容 ：${info["email"] }</h3>
  </body>
</html>
