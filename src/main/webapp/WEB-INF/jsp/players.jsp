<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 12.08.2019
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<meta charset="UTF-8"/>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>PLAYERS LIST</title>
</head>
<table class="table">
    <thead>
<tr>
    <th scope="col">PLAYER</th>
    <th scope="col">AGE</th>
    <th scope="col">CLUB</th>
</tr>
</thead>
    <tbody>
<c:forEach var="players" items="${playerList}">
    <tr>
        <td scope="row">
            <c:out value="${players.firstName}"/>
            <c:out value="${players.lastName}"/>
        </td>
        <td scope="row">
            <c:out value="${players.age}"/>
        </td>
        <td scope="row">
            <c:out value="${players.club}"/>
        </td>
        <td scope="row">
        <td><a href="deleteemp/${players.id}">Click to delete this player</a></td>
        </td>
    </tr>
</c:forEach>
</tbody>
</table>
<table class="table">
    <thead>
    <tr>
        <th scope="col">firstname</th>
        <th scope="col">lastname</th>
        <th scope="col">age</th>
        <th scope="col">club name</th>
        <th scope="col">club nickname</th>
        <th scope="col">club league</th>
    </tr>
    </thead>
</table>
<form:form method="POST" action="/players" modelAttribute="player">
    <form:input path="firstName"/>
    <form:input path="lastName"/>
    <form:input path="age"/>
    <form:input path="club.name"/>
    <form:input path="club.nickName"/>
    <form:input path="club.league"/>
    <button type="submit" class="btn btn-primary mb-2">add</button>
</form:form>
</body>
</html>
