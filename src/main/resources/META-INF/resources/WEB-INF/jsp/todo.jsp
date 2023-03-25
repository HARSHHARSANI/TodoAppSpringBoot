<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<HTML>

<head>
<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">
    <title>List Todo's page</title>
    
    
    
</head>
<body>
    <div class="container">
		    <h1>Your Todo's</h1>
		    <hr>
		    <table class="table">
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
		    <a href="add-todo" class="btn btn-success"> Add Todo</a>
    </div>
    <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</HTML>