package videos;
public class Series{
	
	public String nome;
	public String categoria;
	public int temporadas;
	
	public Series(String categoria, String nome, int temporadas) {
		super();
		this.categoria = categoria;
		this.nome = nome;
		this.temporadas = temporadas;
	}

	@Override
	public String toString(){
		String serie;
		serie = "\n\nSerie: "+this.nome;
		serie += "\nCategoria: "+this.categoria;
		serie += "\nTemporadas: "+this.temporadas;
		return serie;
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

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	
}