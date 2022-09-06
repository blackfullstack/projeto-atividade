package dao;

import java.util.List;


import model.Pacotedeviagem;

public interface CRUD1 {
	
	public static void create(Pacotedeviagem pacotedeviagem) {};
	public static void delete(int idviagem) {};
	public static  List<Pacotedeviagem>find(String pesquisa) {return null;}
	public static  Pacotedeviagem findbyPk(int idviagem) {return null;}
	public static  void update (Pacotedeviagem pacotedeviagem) {};

}
