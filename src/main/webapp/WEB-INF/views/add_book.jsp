<%@ include file="/WEB-INF/views/init.jsp" %> 

<html>
<body>

<form:form method="POST" action="addBook.htm"> 
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
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>
