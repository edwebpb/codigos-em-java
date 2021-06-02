<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ops!</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<link href="css/erro.css" rel="stylesheet">
</head>
<body>
	<div class="px-4 py-5 my-5 text-center">
		<img class="d-block mx-auto mb-4" src="imagens/ok.png" alt=""
			width="100" height="100">
		<h1 class="display-5 fw-bold">Sucesso!</h1>
		<div class="col-lg-6 mx-auto">
			<c:if test="${user != null}">
				<p class="lead mb-4">
					Seja bem vindo, Sr. <strong>${user}</strong>
				</p>
			</c:if>
			<div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
				<form action="listar" method="post">
					<button type="submit" class="btn btn-success btn-lg">Ir
						para lista</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>