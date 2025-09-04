package pessoal.modelo;

public class Categoria {
	
	private String nome;
	
	public Categoria (String nome) {
		this.nome = nome;
		}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String Nome) {
		this.nome = nome;
	
	}
	
	@Override
	public String toString() {
		return nome;
	
	}
	
}
