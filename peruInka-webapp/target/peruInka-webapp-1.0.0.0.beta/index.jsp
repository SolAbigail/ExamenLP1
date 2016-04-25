<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="estilo.css">
	<link rel="stylesheet" href="fonts.css">
</head>
<body>
	<div class="main">
		<div class="slides">
			<img src="img/1.jpg" alt="">
			<img src="img/2.jpg" alt="">
			<img src="img/3.jpg" alt="">
			<img src="img/4.jpg" alt="">
		</div>
	</div>

	<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script src="JS/jquery.slides.js"></script>
	<script>
	$(function(){
  $(".slides").slidesjs({
    play: {
      active: true,
      effect: "slide",
      interval: 3000,
      auto: true,
      swap: true,
      pauseOnHover: false,
      restartDelay: 2500
    }
  });
});
	</script>
	<header>
		<h1>
			<a href="index.html">
				
			</a>
		</h1>
		<nav>
			<ul>
				<li><a href="home/dashboardCliente"><span class="Primero"><i class="icon icon-user"></i></span>CLIENTE</a></li>
				<li><a href="home/dashboardProducto"><span class="Segundo"><i class="icon icon-database"></i></span>PRODUCTO</a></li>
				<li><a href="home/dashboardSucursal"><span class="Tercero"><i class="icon icon-infinite"></i></span>SUCURSAL</a></li>
				<li><a href="#"><span class="Cuarto"><i class="icon icon-office"></i></span>HABITACIONES</a></li>
			</ul>
		</nav>
	</header>
	
</body>
</html>
