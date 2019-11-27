package videos;
public class Series{
	
	String nome;
	String categoria;
	int temporadas;
	
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

}