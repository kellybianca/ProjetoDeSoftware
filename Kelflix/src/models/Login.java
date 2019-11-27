package models;

import java.util.ArrayList;
import java.util.Scanner;

import interfaceModels.Gerenciador;
import modelPacoteAssinatura.Basico;
import modelPacoteAssinatura.Padrao;
import modelPacoteAssinatura.Premium;
import repository.GerenciadorFilmes;
import repository.GerenciadorPacotes;
import repository.GerenciadorSeries;
import repository.GerenciadorTipoPagamento;
import repository.GerenciadorUser;
import videos.Filmes;
import videos.Series;

public class Login {

    Scanner input = new Scanner(System.in);

    int opcoes;

    ArrayList<Gerenciador> dadosUsuario = new ArrayList<>();
    GerenciadorUser gerenciaUser = new GerenciadorUser();
    GerenciadorFilmes gerenciaFilmes = new GerenciadorFilmes();
    GerenciadorSeries gerenciadorSeries = new GerenciadorSeries();
    GerenciadorTipoPagamento gerenciadorTipoPagamento = new GerenciadorTipoPagamento();
    GerenciadorPacotes gerenciadorPacotes = new GerenciadorPacotes();
    
    Catalogo catalogo = new Catalogo();

    public void catalogo() {
        catalogo.adicionandoSeries();
        catalogo.adicionandoFilmes();
    }

    public void opcoes() {

        System.out.println("\n\nBem vindo a sua conta ");
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("(1) Editar Perfil");
        System.out.println("(2) Remover Perfil");
        System.out.println("(3) Mostrar informações da conta");
        System.out.println("(4) Pacote de assinatura");
        System.out.println("(5) Adicionar Filmes/Series");
        System.out.println("(6) Remover Filmes/Series");
        System.out.println("(7) Buscar Filmes/Series");
        System.out.println("(8) Pagamento");
        System.out.println("(9) Sair");
    }

    public void login(GerenciadorUser gerenciar, User user) {

        // gerenciaUser.cadastrarUsuario(user);
        opcoes();
        opcoes = input.nextInt();
        input.nextLine();

        while (true) {
            if (opcoes == 1) {
                gerenciar.alterarUsuario(user);

            } else if (opcoes == 2) {
                gerenciar.removerUsuario(user);
            } else if (opcoes == 3) {
                System.out.println("\n\n-------------------------\n");
                System.out.println("\n\nInformações do Usuário\n");
                gerenciar.listUsers();
                System.out.println("\n\n-------------------------\n\tFilmes");
                gerenciaFilmes.listar();
                System.out.println("\n\n-------------------------\n\tSerie");
                gerenciadorSeries.listSeries();
                System.out.println("\n\n-------------------------\n\tPacotes de assinatura");
                gerenciadorPacotes.listar();
                System.out.println("\n\n-------------------------\n\tPagamento");
                gerenciadorTipoPagamento.listar();

            } else if (opcoes == 4) {
                System.out.println("Pacotes de Assinatura");
                System.out.println("\n\n(1) Básico\n apenas uma tela por vez, sem resolução HD, R$ 19,90");
                System.out.println("\n\n(2) Padrão\n duas telas simultâneas, resolução HD (Full-HD em alguns casos), R$ 27,90");
                System.out.println("\n\n(3) Premium\n quatro telas simultâneas, resolução 4K, sem HDR, R$ 37,90");
                int pa = input.nextInt();
                input.nextLine();

                if (pa == 1) {
                    Basico basico = new Basico("apenas uma tela por vez, sem resolução HD", 19.90);
                    gerenciadorPacotes.adicionar(basico);

                } 
                else if (pa == 2) {
                    Padrao padrao = new Padrao("duas telas simultâneas, resolução HD (Full-HD em alguns casos)", 27.90);
                    gerenciadorPacotes.adicionar(padrao);
                }
                else if (pa == 3) {
                    Premium premium = new Premium("quatro telas simultâneas, resolução 4K, sem HDR", 37.90);
                    gerenciadorPacotes.adicionar(premium);
                }
            } else if (opcoes == 5) {
                System.out.println("\n\nAdicionar Filmes/Series");
                System.out.println("(1) Adicionar filmes\n(2) Adicionar Series");
                int op = input.nextInt();
                input.nextLine();
                if (op == 1) {
                    System.out.println("Digite o nome do filme");
                    String nomeFilme = input.nextLine();
                    System.out.println("Digite a categoria do filme");
                    String categoria = input.nextLine();
                    System.out.println("Digite a duração do filme");
                    int duracao = input.nextInt();
                    input.nextLine();

                    Filmes filme = new Filmes(nomeFilme, categoria, duracao);
                    gerenciaFilmes.adicionar(filme);
                    gerenciaFilmes.listar();
                } else if (op == 2) {
                    System.out.println("Digite o nome da Serie");
                    String nomeSerie = input.nextLine();
                    System.out.println("Digite a categoria da Serie");
                    String categoria = input.nextLine();
                    System.out.println("Digite a quantidade de temporadas");
                    int temporadas = input.nextInt();
                    input.nextLine();
                    Series serie = new Series(categoria, nomeSerie, temporadas);

                    gerenciadorSeries.cadastrarSeries(serie);
                    gerenciadorSeries.listSeries();
                } else {
                    System.out.println("Opção inexistente");
                }

            } else if (opcoes == 6) {
                System.out.println("\n\nRemover Filmes/Series");
                System.out.println("(1) Remover filmes\n(2) Remover Series");
                int op = input.nextInt();
                input.nextLine();
                if (op == 1) {
                    System.out.println("Digite o nome do filme");
                    String nomeFilme = input.nextLine();
                    gerenciaFilmes.apagar(nomeFilme);

                } else if (op == 2) {
                    System.out.println("Digite o nome da serie");
                    String nomeSerie = input.nextLine();
                    gerenciadorSeries.removerSeries(nomeSerie);
                }

            } else if (opcoes == 7) {
                System.out.println("Buscar Filmes/Séries");
                System.out.println("(1) Buscar filmes\n(2) Buscar Series");
                int op = input.nextInt();
                input.nextLine();
                if (op == 1) {
                    gerenciaFilmes.listar();
                } else if (op == 2) {
                    gerenciadorSeries.listSeries();
                }
            } else if (opcoes == 8) {
                System.out.println("\n\nDados do pagamento");
                System.out.println("Digite a forma de pagamento: ");
                String forma = input.nextLine();
                System.out.println("Digite a data do vencimento: ");
                String data = input.nextLine();
                System.out.println("Digite qual o seu pacote de assinatura\n(1) Básico\n(2) Padrao\n(3) Premium");
                int op = input.nextInt();
                input.nextLine();
                if(op == 1){
                    TipoPagamento tipo = new TipoPagamento(forma, data, 19.90);
                    gerenciadorTipoPagamento.adicionar(tipo);
                }
                else if(op == 2){
                    TipoPagamento tipo = new TipoPagamento(forma, data, 27.90);
                    gerenciadorTipoPagamento.adicionar(tipo);
                }
                else if(op == 3){
                    TipoPagamento tipo = new TipoPagamento(forma, data, 37.90);
                    gerenciadorTipoPagamento.adicionar(tipo);
                }
                else{
                    System.out.println("opção invalida");
                }
                
                
                
            } 
            else if(opcoes == 9){
                break;
            }
            else {
                System.out.println("Opcao inválida");
            }
            opcoes();
            opcoes = input.nextInt();
            input.nextLine();
        }

    }


}