package repository;

import java.util.ArrayList;
import java.util.Scanner;

import interfaceModels.IGerenciador;
import videos.Filmes;

public class GerenciadorFilmes implements IGerenciador{
    Scanner input; 
    ArrayList<Filmes> listFilmes;
    
    
    public GerenciadorFilmes(){
    	this.input = new Scanner(System.in);
    	this.listFilmes = new ArrayList<Filmes>();;
    }

    public void adicionar(Filmes filme) {
       listFilmes.add(filme);

    }

    @Override
    public void listar() {
        for (Filmes filmes : listFilmes) {
            System.out.println("\n--------\n"+filmes.toString());
        }
    }

    @Override
    public void editar(String filme) {
    	
    	for (int i = 0; i < listFilmes.size(); i++) {
    		if(filme.equals(listFilmes.get(i).getNome())) {
    			listFilmes.remove(i);
    		}
    		else {
    			System.out.println("Filme não encontrado");
    		}
		}
    }

    @Override
    public void apagar(String filme) {
    	int flag = 0;
    	for (int i = 0; i < listFilmes.size(); i++) {
			if(filme.equals(listFilmes.get(i).getNome())) {
				listFilmes.remove(listFilmes.get(i));
				flag = 1;
			}
		}
    	if(flag == 1) {
    		System.out.println("Filme removido com sucesso !");
    	}
    	else {
    		System.out.println("Filme não encontrado");
    	}
    }
    
}