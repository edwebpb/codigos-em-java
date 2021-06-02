<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html class="h-100">
<head>
<meta charset="UTF-8">
<title>Lista de Clientes</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<link href="style.css" rel="stylesheet">
</head>
<body class="d-flex flex-column h-100">
	<!-- Begin page content -->
	<main class="flex-shrink-0">
		<div class="container">
			<h1 class="mt-5">Lista de cliente(s)</h1>
			<p class="lead">Listagem de cliente(s) cadastrado(s) para edição.
				.</p>
		</div>
		<div class="container">
			<c:if test="${msg != null}">
				<div class="alert alert-success" role="alert">${msg}</div>
			</c:if>
			<div class="table-responsive">
				<table class="table table-striped table-sm">
					<thead>
						<tr>
							<th>ID</th>
							<th>Nome</th>
							<th>E-mail</th>
							<th>Phone</th>
							<th>Edit</th>
							<th>Delete</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="client" items="${clients}">
							<tr>
								<td><c:out value="${client.id}" /></td>
								<td><c:out value="${client.name}" /></td>
								<td><c:out value="${client.email}" /></td>
								<td><c:out value="${client.phone}" /></td>
								<td>
								<form action="editar" method="post">
									<input type="hidden" name="email" value="${client.email}" />
									<button type="submit" class="btn btn-primary btn-sm">Alterar</button>
								</form>
								</td>
								<td>
								<form action="excluir" method="post">
									<input type="hidden" name="id" value="${client.id}" />
									<button type="submit" class="btn btn-danger btn-sm">Excluir</button>
								</form>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</main>

	<footer class="footer mt-auto py-3 bg-light">
		<div class="container">
			<span class="text-muted">Desenvolvido por Edson Ferreira e
				Diomar Victor. <a href="index.jsp">Inicio</a></a></span>
		</div>
	</footer>

</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
	crossorigin="anonymous"></script>
</html>