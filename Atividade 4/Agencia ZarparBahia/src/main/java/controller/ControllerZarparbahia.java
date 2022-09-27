package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Contato;

import java.io.IOException;
import java.util.ArrayList;

import Dao.ContatoDAO;


@WebServlet(urlPatterns = {"/leitura","/inserir","/select","/update","/delete"})
public class ControllerZarparbahia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ContatoDAO dao = new ContatoDAO();
	Contato contato = new Contato();
    
    public ControllerZarparbahia() {
        super();
        // TODO Auto-generated constructor stub
    }

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String action = request.getServletPath();
	    System.out.println(action);
	    
	    if (action.equals("/leitura")) {
	    	contatos(request,response);
	    } else if (action.equals("/inserir")) {
	    	novoCliente(request,response);
	    } else if (action.equals("/select")) {
	    	listarCliente(request,response);
	    } else if (action.equals("/update")) {
	    	editarCliente(request,response);
	    } else if (action.equals("/delete")) {
	    	removerCliente(request,response);	
	    } else {
	    	response.sendRedirect("clientes.jsp");
	    }
	}
	
	protected void contatos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Criar uma objeto do tipo lista para receber os clientes do metodo listarClientes
		ArrayList<Contato> lista = dao.listarClientes();
		
		//Enviar os dados para a p�gina clientes.jsp
		request.setAttribute("contatos", lista);
		RequestDispatcher rd = request.getRequestDispatcher("clientes.jsp");
		rd.forward(request,response);
		
	}

	protected void novoCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contato.setNome(request.getParameter("nome"));
		contato.setNascimento(request.getParameter("nascimento"));
		contato.setCpf(request.getParameter("cpf"));
		contato.setCep(request.getParameter("cep"));
		contato.setCelular(request.getParameter("celular"));
		contato.setEmail(request.getParameter("email"));
		contato.setSenha(request.getParameter("senha"));
		
		//Chamar o m todo inserirCliente do DAO 
		dao.inserirCliente(contato);
		//Redirecionar a tela
		response.sendRedirect("leitura");
	}
	
	
 	
	
	protected void listarCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Pegar ID do cliente selecionado
		String idcadastro = request.getParameter("idcadastro");
		contato.setIdcadastro(idcadastro);
		//Executar o m�todo selecionarCliente do DAO
		dao.selecionarCliente(contato);
		//Colocar os dados no objeto Cliente
		request.setAttribute("idcadastro", contato.getIdcadastro());	
		request.setAttribute("nome", contato.getNome());
		request.setAttribute("nascimento", contato.getNascimento());
		request.setAttribute("cpf", contato.getCpf());
		request.setAttribute("cep", contato.getCep());
		request.setAttribute("celular", contato.getCelular());
		request.setAttribute("email", contato.getEmail());
		request.setAttribute("senha", contato.getSenha());
		
		// Enviar documento para a p�gina editar.jsp
		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);	}

	protected void editarCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Popular os dados no objeto cliente
		contato.setIdcadastro(request.getParameter("idcadastro"));
		contato.setNome(request.getParameter("nome"));
		contato.setNascimento(request.getParameter("nascimento"));
		contato.setCpf(request.getParameter("cpf"));
		contato.setCep(request.getParameter("cep"));
		contato.setCelular(request.getParameter("celular"));
		contato.setEmail(request.getParameter("email"));
		contato.setSenha(request.getParameter("senha"));
		//Alterar o cliente usando o DAO
		dao.alterarCliente(contato);
		//Redirecionar para o documentp clientes.jsp (com os dados atualizado)
		response.sendRedirect("leitura");		
	}

	protected void removerCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recebe o id do clienet a ser excluido do validador.js 
		String idcadastro = request.getParameter("idcadastro");
		// Definir idcli a ser excluido
		contato.setIdcadastro(idcadastro);
		// executar o metodo de excluir no DAO
		dao.deletarCliente(contato);
		// Redirecionar para o documento clientes.jsp (como os dados atualizados)
		response.sendRedirect("leitura");
	}

}
