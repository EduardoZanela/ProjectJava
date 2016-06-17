<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body style="background-color: #929292;">
	<div class="container" style="background-color: #e6e6e6; margin-top: 10%;">
  		<div class="jumbotron">
    		<h1 style="text-align: center;">Trabalho Engenharia MVC</h1>
  		</div>

  		<h2>Formulario de Envio</h2>
  		<form method="POST" action="/Project/upload" enctype="multipart/form-data">
    		<div class="form-group">
      			<label for="file">Arquivo:</label>
      			<input type="file" name="file" class="form-control" id="file" placeholder="Enter the file">
    		</div>
    		<input type="submit" value="Upload">
  		</form>
	
		<h2>Relatorios</h2>
	  	<ul class="list-group">
	    	<li class="list-group-item"><span class="badge">1</span>
	    		<a href="/Project/ralfabetica">Relat�rio de clientes em ordem alfab�tica</a>
	    	</li>
	    	<li class="list-group-item"><span class="badge">2</span>
	    		<a href="/Project/rcidade">Relat�rio de clientes por ordem de cidade</a>    	
	    	</li>
	    	<li class="list-group-item"><span class="badge">3</span> 
	    		<a href="/Project/rpais">Relat�rio de clientes por ordem de Pa�s</a>
	    	</li>
	  	</ul>
  	</div>
</body>
</html>