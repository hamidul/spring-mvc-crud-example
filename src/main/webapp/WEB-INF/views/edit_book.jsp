<%@ include file="/WEB-INF/views/init.jsp" %> 
<c:url var="editBookAction" value="/editBook.htm" ></c:url>
<html>
<body>

<form:form method="POST" action="${editBookAction}"> 
		<form:hidden path="id"/>
		<table> 
			<tr>
				<td>Book Title:</td>
				<td><form:input path="bookTitle" /></td> 
			</tr>
			<tr>
				<td>Author Name:</td>
				<td><form:input path="authorName" /></td> 
			</tr>
			<tr>
				<td>Book Description:</td>
				<td><form:input path="bookDescription" /></td> 
			</tr>
			<tr>
				<td>Book Price:</td>
				<td><form:input path="bookPrice" /></td>
			</tr>
			<tr>
				<td>ISBN:</td>
				<td><form:input path="isbn" /></td>
			</tr>
			<tr>
				<td><input type="button" value="Back" onclick="location.href='${contextPath}/'"/></td>
				<td><input type="submit" value="Submit" /></td>
			</tr>
			
		</table>
	</form:form>
</body>
</html>
