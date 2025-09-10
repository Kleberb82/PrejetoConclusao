package pessoal.repositorio;

import pessoal.modelo.Item;
import java.util.ArryList;
import java.util.List;
import java.util.stream.collectors;


public class IntemRepositoryImpl implements ItemReporsitory{
	private List<Item> itens;
	
	public ItemRepositoryImpl() {
		this.itens = new ArrayLst<>();
		}
	
	@Override
	public void adicionarItem(Item item) {
		this.item.add(item);
	}
	
	@Override
	public List<Item> listarTodosItens(){
		return new ArrayList<>(this.itens);
	}
	
	@Override
	public boolean removerItem(String titulo) {
		return this.itens.removeif(item ->
		item.getTitulo()egualsIgnoreCase (titulo));
	}

}
