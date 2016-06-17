<!DOCTYPE html>
<html lang="en">

<head>

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

<body id="page-top" class="index">

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
  		<h2 style="text-align: center;">Formulario de Envio</h2>
  		<form method="POST" action="/Project/upload" enctype="multipart/form-data">
    		<div class="form-group">
    		<div class="input-group">
                <label class="input-group-btn">
                    <span class="btn btn-primary">
                        Browse… <input type="file" style="display: none;" name="file">
                    </span>
                </label>
                <input type="text" class="form-control" readonly="">
            </div>     			
    		</div>
    		<input type="submit" value="Upload" class="btn btn-info">
  		</form>
  		</div>
	<div class="row" style="text-align: center; margin-top: 5%;">
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
  	<div>
    </section>

    <!-- jQuery -->
    <script src="resorces/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="resources/js/classie.js"></script>
    <script src="resources/js/cbpAnimatedHeader.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="resources/js/jqBootstrapValidation.js"></script>
    <script src="resources/js/contact_me.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="resources/js/freelancer.js"></script>

</body>

</html>
