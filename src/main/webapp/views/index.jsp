<html>
<head>
	<title>Projeto Engenharia</title>
	<meta charset="UTF-8">
</head>
<body>
	<div class="container" style="display: block; text-align: center; width: 50%; margin: 2% auto 0 auto;">
		<div class="title" style="display: block; text-align: center; margin: 2% auto 0 auto;">
			<h1>Projeto Engenharia</h1>
		</div>
		<div class="formulario" style="display: block; text-align: center; width: 50%; margin: 15% auto 0 auto; ">
			<form method="POST" action="/Project/upload" enctype="multipart/form-data">
				File to upload: <input type="file" name="file"> 
				<input type="submit" value="Upload">
	</form>	
		</div>
		<div class="Relatorios" style="display: block; text-align: center; margin: 15% auto 0 auto; ">
			<a href="/Project/ralfabetica"><h2>Relat�rio de clientes em ordem alfab�tica</h2></a>
			<a href="/rcidade"><h2>Relat�rio de clientes por ordem de cidade</h2></a>
			<a href="/rpais"><h2>Relat�rio de clientes por ordem de Pa�s</h2></a>
		</div>
	</div>
</body>
</html>