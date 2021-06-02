<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Alterar cliente</title>
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
		<form action="alterar" method="post">
			<img class="mb-4" src="imagens/edit.png" alt="" width="72"
				height="72">
			<h1 class="h3 mb-3 fw-normal">Altere os dados do cliente</h1>
				<c:if test="${id != null}">
			<div class="form-floating">
				<input type="hidden" name="id" id="id" value="${id}" />
				<input type="text" disabled="disabled" class="form-control"
					placeholder="id" value="${id}"> <label for="name">ID</label>
			</div>
			<div class="form-floating">
				<input type="text" class="form-control" id="name" name="name" value="${name}"
					placeholder="nome"> <label for="name">Nome</label>
			</div>
			<div class="form-floating">
				<input type="email" class="form-control" id="email" name="email" value="${email}"
					placeholder="name@example.com"> <label for="email">Email</label>
			</div>
			<div class="form-floating">
				<input type="text" class="form-control" id="phone" name="phone" value="${phone}"
					placeholder="Phone"> <label for="name">Fone</label>
			</div>
			<div class="form-floating">
				<input type="password" class="form-control" id="password" value="${password}"
					name="password" placeholder="Password"> <label
					for="password">Senha</label>
			</div>
			<button class="w-100 btn btn-lg btn-success" type="submit">Alterar</button>
				</c:if>
			<p class="mt-5 mb-3 text-muted">&copy; 2021</p>
		</form>
	</main>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
	crossorigin="anonymous"></script>
</html>