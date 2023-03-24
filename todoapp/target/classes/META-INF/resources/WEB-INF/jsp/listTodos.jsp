<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<HTML>

<head>
    <title>List Todo's page</title>
</head>
<body>
    <div>welcome ${name}</div>
    <hr>
    <h1>Your Todo's</h1>
    <hr>
    <table>
	    <thead>
	    	<tr>
		    	<th>Id</th>
		    	<th>Description</th>
		   		<th>Target Date</th>
		   		<th>Is Done?</th>
	   		</tr>
	    </thead>
    <tbody>
			<c:forEach items="${todos}" var="todo">
			<tr>
				<td>${todo.id}</td>
				<td>${todo.description}</td>				
				<td>${todo.date}</td>
				<td>${todo.done}</td>
			</tr>
			</c:forEach>
		</tbody>   
    </table>
</body>
</HTML>