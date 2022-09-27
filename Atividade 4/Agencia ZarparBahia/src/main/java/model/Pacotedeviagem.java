package model;

public class Pacotedeviagem {private String  idviagem ;
private String Nomepacote;
private String Valordopacote;
private String Datainicio ;
private String Destino;
private String Origem ;
private String Pagamento;




public Pacotedeviagem (String idviagem, String nomepacote,String valordopacote,String datainicio,String destino, String origem,String pagamento) {
	super();
	this.idviagem = idviagem;
	this.Nomepacote = nomepacote;
	this.Valordopacote = valordopacote;
	this.Datainicio = datainicio;
	this.Destino = destino;
	this.Origem =origem;
	this.Pagamento = pagamento;}

public Pacotedeviagem() {
	// TODO Auto-generated constructor stub
}

public String getIdviagem() {
	return idviagem;
}
public void setIdviagem(String idviagem) {
	this.idviagem = idviagem;
}
public String getNomepacote() {
	return Nomepacote;
}
public void setNomepacote(String nomepacote) {
	Nomepacote = nomepacote;
}
public String getValordopacote() {
	return Valordopacote;
}
public void setValordopacote(String valordopacote) {
	Valordopacote = valordopacote;
}
public String getDatainicio() {
	return Datainicio;
}
public void setDatainicio(String datainicio) {
	Datainicio = datainicio;
}
public String getOrigem() {
	return Origem;
}
public void setOrigem(String origem) {
	Origem = origem;
}
public String getDestino() {
	return Destino;
}
public void setDestino(String destino) {
	Destino = destino;
}
public String getPagamento() {
	return Pagamento;
}
public void setPagamento(String pagamento) {
	Pagamento = pagamento;
}
public static void add(Pacotedeviagem pacotedeviagem1) {
	// TODO Auto-generated method stub
	
}

	
}

