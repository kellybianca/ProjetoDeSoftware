package repository;

import java.util.ArrayList;
import java.util.Scanner;

import interfaceModels.InterfaceFilme;
import videos.Filmes;

public class GerenciadorFilmes implements InterfaceFilme{
    Scanner input = new Scanner(System.in);
    ArrayList<Filmes> listFilmes = new ArrayList<Filmes>();


    @Override
    public void adicionar(Filmes filme) {
       listFilmes.add(filme);

    }

    @Override
    public void listar() {
        Filmes filme = new Filmes("A volta dos que não foramm", "Ação", 120);
        // filme.toString();
        for (Filmes filmes : listFilmes) {
            System.out.println("\n--------\n"+filmes.toString());
        }

    }

    @Override
    public void editar(Filmes filme) {
        // TODO Auto-generated method stub

    }

    @Override
    public void apagar(String filme) {
        for (Filmes filmes : listFilmes) {
            if(filme.equals(filmes)){
                listFilmes.remove(filmes);
                System.out.println("Filme Removido com sucesso!");
            }
            else{
                System.out.println("Filme inexistente");
            }
        }
    }
    
}