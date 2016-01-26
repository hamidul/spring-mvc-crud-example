<%@ include file="/WEB-INF/views/init.jsp" %>

<html>
<head>
<style type="text/css"> 
	table.someClass {
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #999999;
	border-collapse: collapse;
}
table.someClass th {
	background:#b5cfd2; 
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #999999;
}
table.someClass td {
	background:#dcddc0;
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #999999;
}
</style>
</head>
<body>

<input type="button" value="Add Book" onclick="location.href='${contextPath}/addBook.htm'"/> 
<br/><br/>
<h3>Book List</h3>
<table class="someClass">

<tr>
	<th>TITLE</th>
	<th>AUTHOR NAME</th> 
	<th>PRICE</th>
	<th>DESCRIPTION</th>
	<th>DELETE</th>
	<th>EDIT</th>
</tr>

 <c:forEach var="book" items="${bookList}">
   
   <tr>
   		<td>
   			 <c:out value="${book.bookTitle}"/> 
   		</td>
   		<td>
   			 <c:out value="${book.authorName}"/> 
   		</td>
   		<td>
   			 <c:out value="${book.bookPrice}"/> 
   		</td>
   		<td>
   			 <c:out value="${book.bookDescription}"/> 
   		</td>
   		<td>
   			 <input type="button" value="DELETE" onclick="location.href='${contextPath}/deleteBook/${book.id }'"/>
   		</td>
   		<td>
   			 <input type="button" value="EDIT" onclick="location.href='${contextPath}/viewEditPage/${book.id }'">
   		</td>
   </tr>
</c:forEach>
</table>

</body>
</html>
