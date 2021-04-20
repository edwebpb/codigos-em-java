<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Lista de Clientes</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<link href="css/cadastro.css" rel="stylesheet">
<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
</head>
<body class="text-center">
	<main class="form-signin">
		<form action="clientServlet" method="post">
			<img class="mb-4" src="imagens/cadastro.png" alt="" width="72"
				height="72">
			<h1 class="h3 mb-3 fw-normal">Efetue o cadastro</h1>

			<div class="form-floating">
				<input type="text" class="form-control" id="name" name="name"
					placeholder="nome"> <label for="name">Nome</label>
			</div>
			<div class="form-floating">
				<input type="email" class="form-control" id="email" name="email"
					placeholder="name@example.com"> <label for="email">Email</label>
			</div>
			<div class="form-floating">
				<input type="text" class="form-control" id="phone" name="phone"
					placeholder="Phone"> <label for="name">Fone</label>
			</div>
			<div class="form-floating">
				<input type="password" class="form-control" id="password"
					name="password" placeholder="Password"> <label
					for="password">Senha</label>
			</div>
			<button class="w-100 btn btn-lg btn-primary" type="submit">Cadastro</button>
			<hr class="my-4">
			<small class="text-muted">Para voltar a página de login <a href="index.jsp" >clique aqui</a>.</small>
		</form>
	</main>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
	crossorigin="anonymous"></script>
</html>