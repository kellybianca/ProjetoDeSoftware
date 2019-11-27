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
}