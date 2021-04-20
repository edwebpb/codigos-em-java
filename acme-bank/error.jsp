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
		<img class="d-block mx-auto mb-4" src="imagens/atencao.png" alt=""
			width="72" height="57">
		<h1 class="display-5 fw-bold">Ops!</h1>
		<div class="col-lg-6 mx-auto">
			<c:if test="${error != null}">
				<p class="lead mb-4">${error}</p>
			</c:if>
			<div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
				<a class="btn btn-primary btn-lg px-4" href="index.jsp" role="button">Efetuar login</a>
				<a class="btn btn-outline-secondary btn-lg px-4" href="cadastro.jsp" role="button">Efetuar cadastro</a>
			</div>
		</div>
	</div>
</body>
</html>