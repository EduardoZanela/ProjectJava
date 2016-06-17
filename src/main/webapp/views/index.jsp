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
	<div class="container" style="background-color: #e6e6e6;">
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
	    	<li class="list-group-item">
	    		<form method="POST" action="/Project/relatorio" enctype="form-data">
	    			<input type="hidden" name="param" value="nome">
	    			<button type="submit" class="btn btn-info btn-block">Relatório de clientes em ordem alfabética</button>	    			
	    		</form>
	    	</li>
	    	<li class="list-group-item">
	    		<form method="POST" action="/Project/relatorio" enctype="form-data">
	    			<input type="hidden" name="param" value="cidade">
	    			<button type="submit" class="btn btn-info btn-block">Relatório de clientes por ordem de cidade</button>
	    		</form>    	
	    	</li>
	    	<li class="list-group-item">
	    		<form method="POST" action="/Project/relatorio" enctype="form-data">
	    			<input type="hidden" name="param" value="pais">
	    			<button type="submit" class="btn btn-info btn-block">Relatório de clientes por ordem de País</button>
	    		</form>
	    	</li>
	  	</ul>
  	</div>
</body>
</html>