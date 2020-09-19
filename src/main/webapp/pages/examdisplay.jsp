<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
	<h2>Exams DataBase</h2>
	<table>
		<tr>
			<th>ExamId</th>
			<th>Name</th>
		</tr>
		<c:forEach var="exams" items="${exam}" >
			<tr>
				<td>${exams.examid}</td>
				<td>${exams.name}</td>
				<td><a href='examEdit?id=${exams.examid}'>Edit</a>/<a href='examdelete?id=${exams.examid}'>Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br><a href="addExam">Add New Exam</a><br><br>
	<a href="modules">Go back</a>
</body>
</html>