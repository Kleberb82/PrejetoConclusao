package pessoal.modelo;

public class Revista extends Item {
	private int numeroEdicao;
	private String datePublicacao;
	
	public Revista (String titulo, String autorArtista, Categoria categoria, int 
			numeroEdicao, String datePublicacao) {
		super (titulo, autorArtista, categoria);
		this.numeroEdicao = numeroEdicao;
		this.datePublicacao = datePublicacao;
		}
	
	public int getNumeriEdicao() {
		return numeroEdicao;
	}
	
	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	
	public String getDatePublicacao() {
		return datePublicacao;
	}
		
	public void setDataPublicacao (String datePublicacao) {
		this.datePublicacao = datePublicacao;
	}
	
	@Override
	public String getTipo() {
		return "Revista";
	}
	
	@Override
	public String toString() {
		return super.toString() + ". Tipo: Revista, Edição: " + numeroEdicao + ", Data: " + datePublicacao;
	}
	

}
