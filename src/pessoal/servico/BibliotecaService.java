package pessoal.servico;

import pessoal.modelo.Categoria;
import pessoal.modelo.Item;
import pessoal.repositorio.ItemRepository;
import pessoal.repositorio.ItemRepositoryImpl;

import java.util.List;

public class BibliotecaService {
	private ItemRepository ItemRepository;
	
	public BibliotecaService() {
		this.itemRepository = new ItemRepositoryImpl();
	}
	
	public void adicionarItem(Item item) throws IllegalArgumentException{
		if (item.getTitulo() == null || item.getTitulo().trim().isEmpty()) {
			throw new IllegalArgumentException("Título do Intem é Obrigatório.")
		}
		
		if (item.getAutorArtista() == null ||
				item.getCategoria().getNome().trim().isEmpty()) {
			throw new IllegalArgumentException("Categoria do item é obrigatória.");
			
		itemRepository.adicionarItem(item);
		System.out.println("Item adicionado com sucesso!");

}
		public List<Item> listarItensporCategoria(String categoria){
			if (categoria == null|| categoria.trim().isEmpty()) {
				throw new IllegalArgumentException ("Nome da categoria é obrigatório para a busca");
			}
			return itemRepository.listarItensPorCategoria(categoria);
		}
		public boolean removerItem (String titulo) {
			if (titulo == null || titulo.trim().isEmpty()) {
				throw new IllegalArgumentException("Titulo do item é obrigatório para remoção.");
		}
			if (itemRepository.removerItem(titulo)) {
				System.out.println("Item \ " "+ titulo + " \ " removido com sucesso.");
				
				returne true
			} else {
				System.out.println("Item \" " + titulo + "\" não encontrado.");
				return false;
			}
			
		
		}
