<!DOCTYPE html5>
<html>
<head>
  <title>Ordenacao Cidade</title>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body style="background-color: #929292;">

<div class="container" style="background-color: #e6e6e6;">
  <div class="jumbotron">
  	<h1 style="text-align: center;">Trabalho Engenharia MVC</h1>
  </div>
  <h2>Relatorio de clientes ordenado por Cidade</h2>
  <a href="/Project/" class="btn btn-info" role="button" style="float:right">Back to home</a>
  <table class="table">
    <thead>
      <tr>
        <th>Nome</th>
        <th>Cidade</th>
        <th>Estado</th>
        <th>Pais</th>
        <th>Aniversario</th>
        <th>Estado Civil</th>
        <th>Sexo</th>
        <th>Profissão</th>
      </tr>
    </thead>
    <tbody>
      	<c:forEach items="${usuarios}" var="a">
			 <tr>
			 <td>${a.nome}</td>
			 <td>${a.cidade}</td>
			 <td>${a.estado}</td>
			 <td>${a.pais}</td>
			 <td>${a.birth_date}</td>
			 <td>${a.civil}</td>
			 <td>${a.sexo}</td>
			 <td>${a.profissao}</td>
			  </tr>
		</c:forEach>
    </tbody>
  </table>
</div>


</body>
</html>