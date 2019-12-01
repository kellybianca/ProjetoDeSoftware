package videos;
public class Filmes {

	String nome;
	String categoria;
	int duracao;
	
	public Filmes(String nome, String categoria, int duracao) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.duracao = duracao;
	}
	
	public String toString(){
		String filme;
		filme = "\n\nFilme: "+this.nome;
		filme += "\nCategoria: "+this.categoria;
		filme += "\nDuração: "+this.duracao+ "min\n";
		return filme;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
}