<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>CRUD Java - Lista de Clientes</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.html">Zarparbahia</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="CreateAndFind">Lista de Clientes</a>
        </li>
      </ul>
      <form action="CreateAndFind" method="GET" class="d-flex">
        <input name="pesquisa" class="form-control me-2" type="search" placeholder="Digite o Nome ou CPF" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Buscar</button>
      </form>
    </div>
  </div>
</nav>
<br>
<div class="container">
	<div class="row">
		<div class="cold-md-7">
			<hr>
			<h3>Clientes Cadastrados</h3>
			<hr>
			<table class="table">
				<thead>
					<tr>
						<th>#</th>
            <th>Nome</th>
            <th>Nascimento</th>
            <th>CPF</th>
            <th>Cep</th>
            <th>Celular</th>
            <th>Email</th>
            <th>Senha</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${contato}" var="contato">
							<tr>
					<td>${contato.Idcadastro}</td>
                    <td>${contato.Nome}</td>
                    <td>${contato.Nascimento}</td>
                    <td>${contato.Cpf}</td>
                    <td>${contato.Cep}</td>
                    <td>${contato.Celular}</td>
                    <td>${contato.Email}</td>
                    <td>${contato.Senha}</td>
								<td>
									<a href="ContatoDelete?Idcadastro=${contato.idcadastro}">deletar</a> |
									<a href="ContatoUpdate?Idcadastro=${contato.idcadastro}">atualizar</a>
								</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
			<h5><a href="index.html">Voltar para o Cadastro de Clientes</a></h5>
		</div>
	</div>
</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>