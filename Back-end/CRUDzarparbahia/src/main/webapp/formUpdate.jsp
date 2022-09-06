<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="utf-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>CRUD Java - Atualizar Cliente</title>
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
			<h3>Atualizar Cliente</h3>
			<hr>
			<form action="ContatoUpdate" method="POST">
					<input value="${contato.idcadastro}" name="idcadastro" type="number" style="visibility:hidden">
					<div class="form-floating mb-3">
						<input value="${contato.nome}" name="nome" maxlength="40" type="text" class="form-control" id="floatingInput1"> 
						<label>Nome </label>
					</div>
					
					<div class="form-floating mb-3">
						<input value="${contato.nascimento}" name="nascimento" type="date" class="form-control" placeholder="Nascimento">
						<label>Nascimento</label>
					</div>
					
					<div class="form-floating mb-3">
						<input value="${contato.cpf}" name="cpf" maxlength="11" type="text" class="form-control"> 
						<label>CPF</label>
					</div>
					
					<div class="form-floating mb-3">
						<input value="${contato.cep}" name="cep" maxlength="40" type="text" class="form-control" id="floatingInput1"> 
						<label>Cep</label>
					</div>
					
					<div class="form-floating mb-3">
						<input value="${contato.celular}" name="nome" maxlength="40" type="text" class="form-control" id="floatingInput1"> 
						<label> celular </label>
					</div>
					
					<div class="form-floating mb-3">
						<input value="${contato.email}" name="nome" maxlength="40" type="text" class="form-control" id="floatingInput1"> 
						<label>Email</label>
					</div>
					
					<div class="form-floating mb-3">
						<input value="${contato.senha}" name="nome" maxlength="40" type="text" class="form-control" id="floatingInput1"> 
						<label>Senha</label>
					</div>
					
					<button class="btn btn-success" type="submit">Atualizar
						Dados</button>
					<button class="btn btn-secondary" type="reset">Limpar
						Formulário</button>
			</form>
			<br>
		</div>
		
	</div>
</div>
<!-- JavaScript Bundle with Popper -->