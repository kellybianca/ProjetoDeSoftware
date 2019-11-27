package models;

import repository.GerenciadorFilmes;
import repository.GerenciadorSeries;
import videos.Filmes;
import videos.Series;

public class Catalogo {

    GerenciadorFilmes gerenciadorFilmes = new GerenciadorFilmes();
    GerenciadorSeries gerenciadorSerie = new GerenciadorSeries();

   
    public void adicionandoFilmes(){
        Filmes filme = new Filmes("Your Name", "Anime", 120);
        Filmes filme1 = new Filmes("How to train your dragon", "Animação", 140);
        Filmes filme2 = new Filmes("Simplesmente Acontece", "Romance", 200);
        Filmes filme3 = new Filmes("Sempre ao seu lado", "Drama", 120);
        Filmes filme4 = new Filmes("Your Name", "Anime", 120);
        
        gerenciadorFilmes.adicionar(filme);
        gerenciadorFilmes.adicionar(filme1);
        gerenciadorFilmes.adicionar(filme2);
        gerenciadorFilmes.adicionar(filme3);
        gerenciadorFilmes.adicionar(filme4);
    }

    public void listandoFilmes(){
        
    }

    public void adicionandoSeries(){
        Series serie = new Series("Demon Slayer",  "Anime", 3);
        Series serie1 = new Series("Brooklyn 99",  "Comédia", 5);
        Series serie2 = new Series("Friends",  "Comédia", 7);
        Series serie3 = new Series("The big bang theory",  "Comédia", 9);

        gerenciadorSerie.cadastrarSeries(serie);
        gerenciadorSerie.cadastrarSeries(serie1);
        gerenciadorSerie.cadastrarSeries(serie2);
        gerenciadorSerie.cadastrarSeries(serie3);


    }

	public void gerenciadorSerie() {
	}
    
    

    

}