<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
    <script language="javaScript">
      function validate(f){
       if(!(/^\w{5,15}$/.test(f.userid.value))){
          alert("用户id必须5~15位");
          f.userid.focus();
          return false;
       }
        if(!(/^\w{5,15}$/.test(f.userpass.value))){
          alert("用户密码必须5~15位");
          f.userpass.focus();
          return false;
      
        }
       return true;
      }

</script>
  <body>
  <h2>用户登录程序</h2>
  <%
    request.setCharacterEncoding("UTF-8");
   %>
    <%
      List<String>info=(List<String>)request.getAttribute("info"); //取得属性
      if(info!=null){
        Iterator<String> iter=info.iterator();
        while(iter.hasNext()){
     %>
     <h4><%=iter.next() %></h4>
     <%
       }
      
      }
      %>
  
  
  <form action=" LoginServlet" method="post" onSubmit="return validate(this)">
   用户id  :<input type="text" name="userid"><br>
  密&nbsp;码: <input type="password" name="userpass"><br>
       <input type="submit" value="登录">
       <input type="reset" value="重置">
  </form>
  </body>
</html>
