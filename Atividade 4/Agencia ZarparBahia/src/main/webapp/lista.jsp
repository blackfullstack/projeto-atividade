<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.Pacotedeviagem" %>
<%@ page import="java.util.ArrayList"  %>
<%
	ArrayList<Pacotedeviagem> lista = (ArrayList<Pacotedeviagem>) request.getAttribute("pacotedeviagens");
%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>projeto individual</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
    integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  <link rel="stylesheet" href="assets/css/style.css">

</head>

<body>

  <div class="content">
    <header class="header">
      <div class="logo">
        <a href="index.html"><img src="assets/logo/images.png" /></a>zarparbahia
      </div>
      <nav class="navbar">
        <ul>
          <li><a href="index.html">Início</a></li>
          <li><a href="promoções.html">promocões</a></li>
          <li><a href="cadastro.html">cadastro</a></li>
          <li><a href="contatos.html">contatos</a></li>
          <li><a href="login.html"><button class="btn btn-primary " type="submit">Entrar</button></a></li>
        </ul>
      </nav>

    </header>

    <br>

    <div class="container">


      <h2 class="text-white" style="height:55px; background-color:blue; padding: 10px ; ">Dados</h2>

     
	<table  border="3">
	
		<thead>
			<tr align="center">
				<th>Idviagem</th>
				<th>Nomepacote</th>
				<th>Valorpacote</th>
				<th>Datainicio</th>
				<th>Destino</th>
				<th>Origem</th>
				<th>Pagamento</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%for (int i=0 ; i < lista.size() ; i++) { %>
			
			<tr>
				
				    <td><%=lista.get(i).getIdviagem() %></td>  
					<td><%=lista.get(i).getNomepacote() %></td>
					<td><%=lista.get(i).getValordopacote() %></td>
					<td><%=lista.get(i).getDatainicio() %></td>
					<td><%=lista.get(i).getDestino() %></td>
					<td><%=lista.get(i).getOrigem() %></td>
					<td><%=lista.get(i).getPagamento() %></td>
					
					<td><a href="select1?idviagem=<%=lista.get(i).getIdviagem()%>" style="color:white">Atualizar</a>
					 <a href="delete1?idviagem=<%=lista.get(i).getIdviagem()%>" style="color:white">Remover</a></td>
				</tr> 
			<%} %>
		</tbody>
	</table>
        </button></div>
	
  </div>
  
  
    <br><br>
    <br><br>
    <br><br>
    <br>

    <footer class="text-white">
      <br>

      <div class="container ">

        <div class="row">
          <div class="col-sm-4">

            <h6> Formas de pagamentos </h6>
            <img src="assets/img/forma de pagamento 1.png" WIDTH="90%">


          </div>
          <div class="col-sm-4">

            <nav>

              <ul class="list-unstyled">

                <li class="h6">ZarparBahia VIAGENS E TURISMO LTDA.</li>
                <li>CNPJ: 00.111.222/0001-00</li>
                <li>Rua dev aristoteles, 04 - Pelourinho</li>
                <li>CEP: 40243-000, Salvador/Ba</li>

              </ul>
            </nav>

          </div>
          <div class="col-sm-4">

            <nav>

              <ul class="list-unstyled">

                <li class="h5">Termos</li>
                <li>Condições de uso do site</li>
                <li>Condições Gerais</li>
                <li>Politica de privacidade</li>
                <li>Código de Conduta Ética</li>

              </ul>

            </nav>

          </div>
        </div>
      </div>

      <center>
        <font face="Arial" size="2">&copy;ZarparBahia</font>
      </center>

    </footer>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
      integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
      crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
      integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
      crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
      integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
      crossorigin="anonymous"></script>
<script src="scripts/validador.js"></script>

</body>


</html>