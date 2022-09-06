package controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Contato;

import java.io.IOException;

import dao.ContatoDao;

/**
 * Servlet implementation class ContatoFindAndUpdate
 */
public class ContatoFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContatoFindAndUpdate() {
        super();
        
    }
 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int contatoidcadastro = Integer.parseInt(request.getParameter("contatoidcadastro"));
		Contato contato = ContatoDao.findbyPk(contatoidcadastro);
		
		request.setAttribute("Contato", contato);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("formUpdate.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Contato contato = new Contato();
		
		contato.setIdcadastro(Integer.parseInt(request.getParameter("idcadastro")));
		contato.setNome(request.getParameter("nome"));
		contato.setNascimento(request.getParameter("nascimento"));
		contato.setCpf(request.getParameter("cpf"));
		contato.setCep(request.getParameter("cep"));
		contato.setCelular(request.getParameter("celular"));
		contato.setEmail(request.getParameter("email"));
		contato.setSenha(request.getParameter("senha"));
		
		ContatoDao.update(contato);
		
		 ContatoCreateAndFind contatoCreateAndFind = new ContatoCreateAndFind ();
	     contatoCreateAndFind.doGet(request, response);
	}

}
