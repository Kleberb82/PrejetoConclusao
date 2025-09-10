package pessoal.repositorio;

import pessoal.modelo.Item;

import java.util.List;

public interface IntemRepository {

	void adicionarItem (item item);
	List<Item> listarTodositens();
	List<Item> listarItensPorCategoria(String Categoria);
	boolean removerItem (String titulo);
	
	
	
}
