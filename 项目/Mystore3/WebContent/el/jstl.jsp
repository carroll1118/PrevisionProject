<%@page import="com.it666.domain.User"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
     request.setAttribute("count", 100);
%>

<c:if test="${1==1}">
        <h1>GGQ</h1>
</c:if>

<c:if test="${count > 50}">
        <h1>大于: 50</h1>
</c:if>

<c:if test="${count <= 50}">
        <h1>小于等于: 50</h1>
</c:if>

<hr/>

<!--从域中取数据，自动把数据存储到pageScope  -->
<c:forEach begin="0" end="5" var="i">
     ${pageScope.i}
</c:forEach>

<hr/>

<%
    List<String> strList = new ArrayList<String>();
    strList.add("aaa");
    strList.add("bbb");
    strList.add("ccc");
    
    request.setAttribute("strList", strList);

%>

<c:forEach items="${strList}" var="str">
      ${str}
</c:forEach>

<hr/>

<%
           List<User> userList = new ArrayList<User>();
           User u1 = new User();
           u1.setUser_name("ggq1");
           
           User u2 = new User();
           u2.setUser_name("ggq2");
           
           userList.add(u1);
           userList.add(u2);
           
           session.setAttribute("userList", userList);
           
%>

<c:forEach items="${userList}" var="user">
          ${user.username}
</c:forEach>



</body>
</html>