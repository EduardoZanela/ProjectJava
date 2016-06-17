<!DOCTYPE html5>
<html>
<head>
  <title>Ordenacao NAlfabetica</title>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Freelancer - Start Bootstrap Theme</title>

    <!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/css/freelancer.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body style="background-color: #929292;">

<!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#page-top">MVC</a>
            </div>

            
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- Header -->
    <header>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <img class="img-responsive" src="resources/img/profile.png" alt="">
                    <div class="intro-text">
                        <span class="name">Trabalho Engenharia MVC</span>
                        <hr class="star-light">
                        
                    </div>
                </div>
            </div>
        </div>
    </header>

    <!-- Portfolio Grid Section -->
    <section id="portfolio">
    <div class="container">
    <div class="row" >
  <h2 style="float: left; margin-bottom: 3%;">${title}</h2>
  <a href="/Project/" class="btn btn-info" role="button" style="float: right; margin-top: 2%;">Back to home</a>
  <table class="table">
    <thead>
      <tr>
        <th style="${colorN};">Nome</th>
        <th style="${colorC};">Cidade</th>
        <th>Estado</th>
        <th style="${colorP};">Pais</th>
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

    </section>
</body>
</html>