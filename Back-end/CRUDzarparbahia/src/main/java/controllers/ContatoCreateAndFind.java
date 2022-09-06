package controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Contato;

import java.io.IOException;
import java.util.List;

import dao.ContatoDao;

/**
 * Servlet implementation class ContatoCreateAndFind
 */
public class ContatoCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContatoCreateAndFind() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		if(pesquisa == null) {
			pesquisa = "";
			
		}
		
		List<Contato> contatos = ContatoDao.find(pesquisa);
		
		request.setAttribute("Contatos",contatos);
		RequestDispatcher resquesDispatcher = request.getRequestDispatcher("lista.jsp");
		resquesDispatcher.forward(request, response);
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Contato contato = new Contato();
		contato.setNome(request.getParameter("nome"));
		contato.setNascimento(request.getParameter("nascimento"));
		contato.setCpf(request.getParameter("cpf"));
		contato.setCep(request.getParameter("cep"));
		contato.setCelular(request.getParameter("celular"));
		contato.setEmail(request.getParameter("email"));
		contato.setSenha(request.getParameter("senha"));
		
		ContatoDao.create(contato);
		
		
		doGet(request, response);
	}

}
