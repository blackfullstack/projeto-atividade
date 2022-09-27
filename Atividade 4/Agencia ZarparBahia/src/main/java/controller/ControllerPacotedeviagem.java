package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Pacotedeviagem;

import java.io.IOException;
import java.util.ArrayList;

import Dao.PacotedeviagemDAO;

@WebServlet(urlPatterns = {"/lista","/inserirdados","/select1","/update1","/delete1"})
public class ControllerPacotedeviagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PacotedeviagemDAO dao1 = new PacotedeviagemDAO();
	Pacotedeviagem pacotedeviagem = new Pacotedeviagem ();

    public ControllerPacotedeviagem() {
        super();
        // TODO Auto-generated constructor stub
    }

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String action = request.getServletPath();
	    System.out.println(action);
	    
	    if (action.equals("/lista")) {
	    	pacotedeviagens(request,response);
	    } else if (action.equals("/inserirdados")) {
	    	novoCliente(request,response);
	    } else if (action.equals("/select1")) {
	    	listarCliente(request,response);
	    } else if (action.equals("/update1")) {
	    	editarCliente(request,response);
	    } else if (action.equals("/delete1")) {
	    	removerCliente(request,response);	
	    } else {
	    	response.sendRedirect("lista.jsp");
	    }
	}
	
	


	protected void pacotedeviagens(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Criar uma objeto do tipo lista para receber os clientes do metodo listarClientes
		ArrayList<Pacotedeviagem> lista =dao1.listarClientes();
		
		//Enviar os dados para a p gina clientes.jsp
		request.setAttribute("pacotedeviagens", lista);
		RequestDispatcher rd = request.getRequestDispatcher("lista.jsp");
		rd.forward(request,response);
		
	}

	protected void novoCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		pacotedeviagem.setNomepacote(request.getParameter("nomepacote"));
		pacotedeviagem.setValordopacote(request.getParameter("valordopacote"));
		pacotedeviagem.setDatainicio(request.getParameter("datainicio"));
		pacotedeviagem.setDestino(request.getParameter("destino"));
		pacotedeviagem.setOrigem(request.getParameter("origem"));
		pacotedeviagem.setPagamento(request.getParameter("pagamento"));
		
		
		//Chamar o m todo inserirCliente do DAO 
		dao1.inserirCliente(pacotedeviagem);
		//Redirecionar a tela
		response.sendRedirect("lista");
	}
	
	
 	
	
	protected void listarCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Pegar ID do cliente selecionado
		String idviagem = request.getParameter("idviagem");
		pacotedeviagem.setIdviagem(idviagem);
		//Executar o m todo selecionarCliente do DAO
		dao1.selecionarCliente(pacotedeviagem);
		//Colocar os dados no objeto Cliente
		request.setAttribute("idviagem", pacotedeviagem.getIdviagem());	
		request.setAttribute("nomepacote", pacotedeviagem.getNomepacote());
		request.setAttribute("valordopacote", pacotedeviagem.getValordopacote());
		request.setAttribute("datainicio", pacotedeviagem.getDatainicio());
		request.setAttribute("destino", pacotedeviagem.getDestino());
		request.setAttribute("origem", pacotedeviagem.getOrigem());
		request.setAttribute("pagamento", pacotedeviagem.getPagamento());
		
		
		
		// Enviar documento para a p gina editar.jsp
		RequestDispatcher rd = request.getRequestDispatcher("atualizarpacote.jsp");
		rd.forward(request, response);	}

	protected void editarCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Popular os dados no objeto cliente
		pacotedeviagem.setIdviagem(request.getParameter("idviagem"));
		pacotedeviagem.setNomepacote(request.getParameter("nomepacote"));
		pacotedeviagem.setValordopacote(request.getParameter("valordopacote"));
		pacotedeviagem.setDatainicio(request.getParameter("datainicio"));
		pacotedeviagem.setDestino(request.getParameter("destino"));
		pacotedeviagem.setOrigem(request.getParameter("origem"));
		pacotedeviagem.setPagamento(request.getParameter("pagamento"));
		
		//Alterar o cliente usando o DAO
		dao1.alterarCliente(pacotedeviagem);
		//Redirecionar para o documentp clientes.jsp (com os dados atualizado)
		response.sendRedirect("lista");		
	}

	protected void removerCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recebe o id do clienet a ser excluido do validador.js 
		String idviagem = request.getParameter("idviagem");
		// Definir idcli a ser excluido
		pacotedeviagem.setIdviagem(idviagem);
		// executar o metodo de excluir no DAO
		dao1.deletarCliente(pacotedeviagem);
		// Redirecionar para o documento clientes.jsp (como os dados atualizados)
		response.sendRedirect("lista");
	}

}



