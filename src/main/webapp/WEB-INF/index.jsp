<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet"
	href="/webjars/bootstrap/5.0.1/css/bootstrap.min.css" />

	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/5.0.1/js/bootstrap.min.js"></script>

	<title>Insert title here</title>
</head>
<body>

<h1>All Books</h1>
<table class="table">
    <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Title</th>
            <th scope="col">Language</th>
            <th scope="col">Number of Pages</th>
        </tr>
    </thead>
    <tbody>
         <!-- loop over all the books to show the details as in the wireframe! -->
         <c:forEach var="item" items="${books}">
   <tr>
   <td> <a href= "/books/show"><c:out value="${item.id}"/></a></td>
   <td> <a href= "/books/show/${item.id}"> ${item.title}</a></td>
   <td><a href= "/books/show"> <c:out value="${item.language}"/></a></td>
   <td> <a href= "/books/show"><c:out value="${item.numberOfPages}"/></a></td>
</tr>
</c:forEach>
    </tbody>
</table>

</body>
</html>
