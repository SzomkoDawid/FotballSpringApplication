<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 13.08.2019
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<meta charset="UTF-8"/>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body background="https://i.pinimg.com/originals/58/e7/49/58e7490f02ec6e5b3822600151debfae.jpg">
<center>
<div class="alert alert-warning alert-dismissible fade show" role="alert">
    Witaj,<strong> ${user}!</strong> Dodaj swojego gracza do bazy danych!
    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
</div>
    <a href="/players" class="btn btn-secondary btn-lg active"
       role="button" aria-pressed="true">KLIKNIJ ABY DODAĆ SWOJEGO GRACZA</a>
</center>
</body>
</html>
