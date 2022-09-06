package controllers;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.ContatoDao;


public class ContatoDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ContatoDelete() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int contatoidcadastro = Integer.parseInt(request.getParameter("contatoidcadastro"));
        ContatoDao.delete(contatoidcadastro);
        
        ContatoCreateAndFind contatoCreateAndFind = new ContatoCreateAndFind ();
        contatoCreateAndFind.doGet(request, response); 
	
}}
