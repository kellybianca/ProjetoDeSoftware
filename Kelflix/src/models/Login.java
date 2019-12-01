package models;

import java.util.ArrayList;
import java.util.Scanner;

import excessoes.TratandoExcessoes;
import interfaceModels.IGerenciador;
import modelPacoteAssinatura.Basico;
import modelPacoteAssinatura.Padrao;
import modelPacoteAssinatura.Premium;
import modelTipoPagamento.Boleto;
import modelTipoPagamento.Cartao;
import repository.GerenciadorFilmes;
import repository.GerenciadorPacotes;
import repository.GerenciadorSeries;
import repository.GerenciadorTipoPagamento;
import repository.GerenciadorUser;
import videos.Filmes;
import videos.Series;

public class Login {

    Scanner input = new Scanner(System.in);

    int opcoes = 0;
    
    TratandoExcessoes excessoes = new TratandoExcessoes();
    ArrayList<TipoPagamento> tipoPagamento = new ArrayList<>();
    ArrayList<IGerenciador> dadosUsuario = new ArrayList<>();
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
        System.out.println("(5) Cadastrar Filmes/Series");
        System.out.println("(6) Remover Filmes/Series");
        System.out.println("(7) Buscar Filmes/Series");
        System.out.println("(8) Pagamento");
        System.out.println("(9) Sair");
    }

    public void login(GerenciadorUser gerenciar, User user) {

        Filmes newFilme = new Filmes("watchman", "ação", 120);
        gerenciaFilmes.adicionar(newFilme);
            	
        opcoes();
        opcoes = excessoes.lerInteiro(opcoes);

        while (true) {
            if (opcoes == 1) {
                System.out.println("Alterar dados do Usuário");
                System.out.println("Digite o nome do usuario que vc deseja alterar: ");
                String nome = input.nextLine();
                gerenciar.editar(nome);

            } 
            else if (opcoes == 2) {
            	 System.out.println("Apagar Usuário");
            	 System.out.println("Você tem certeza que deseja remover esse usuario? :(\n(1) Sim\n(2) Não\n");
            	 int op = 0;
            	 op = excessoes.lerInteiro(op);
            	 
            	 if(op == 1) {
            		 System.out.println("Digite o nome do usuario que vc deseja remover: ");
                     String nome = input.nextLine();
                     gerenciar.apagar(nome);
            	 }
            	 else if(op == 2) {
            		 System.out.println("Voltando para o menu principal ... ");
            	 }
            	 else {
            		 System.out.println("Opção não encontrada");
            	 }
                
            }
            else if (opcoes == 3) {
                System.out.println("\n\n-------------------------\n");
                System.out.println("\n\nInformações do Usuário\n");
                gerenciar.listar();
                System.out.println("\n\n-------------------------\n\tFilmes");
                gerenciaFilmes.listar();
                System.out.println("\n\n-------------------------\n\tSerie");
                gerenciadorSeries.listar();
                System.out.println("\n\n-------------------------\n\tPacotes de assinatura");
                gerenciadorPacotes.listar();
                System.out.println("\n\n-------------------------\n\tPagamento");
                gerenciadorTipoPagamento.listar();

            } 
            else if (opcoes == 4) {
                System.out.println("Bem vindo aos Pacotes de Assinatura");
                System.out.println("Escolha umas das opções abaixo: \n(1) Cadastrar\n(2) Remover");
                int pa = 0;
                pa = excessoes.lerInteiro(pa);
                
                if(pa == 1) {
                	System.out.println("\n\n(1) Básico\n apenas uma tela por vez, sem resolução HD, R$ 19,90");
                    System.out.println("\n\n(2) Padrão\n duas telas simultâneas, resolução HD (Full-HD em alguns casos), R$ 27,90");
                    System.out.println("\n\n(3) Premium\n quatro telas simultâneas, resolução 4K, sem HDR, R$ 37,90");
                    pa = 0;
                    pa = excessoes.lerInteiro(pa);
                    
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
                }
                else if(pa == 2) {
                	System.out.println("Tem certeza que deseja remover o seu pacote? :(\n(1) Sim\n(2) Não");
                	pa = 0;
                	pa = excessoes.lerInteiro(pa);
                    if(pa == 1) {
                    	 System.out.println("Digite o nome do pacote que vc deseja remover: ");
                         String nome = input.nextLine();
                         gerenciadorPacotes.apagar(nome);
                    } 
                    else if(pa == 2) {
                    	System.out.println("Voltando para o menu principal");
                    }
                    else {
                    	System.out.println("Opção inválida");
                    }
                }
                else {
                	System.out.println("Opção inválida");
                }                
            } 
            
            else if (opcoes == 5) {
                System.out.println("\n\nCadastrar Filmes/Series");
                System.out.println("(1) Cadastrar filmes\n(2) Cadastrar Series");
                int op = 0;
                op = excessoes.lerInteiro(op);
                
                if (op == 1) {
                    System.out.println("Digite o nome do filme");
                    String nomeFilme = input.nextLine();
                    System.out.println("Digite a categoria do filme");
                    String categoria = input.nextLine();
                    System.out.println("Digite a duração do filme");
                    int duracao = 0;
                    duracao = excessoes.lerInteiro(duracao);

                    Filmes filme = new Filmes(nomeFilme, categoria, duracao);
                    gerenciaFilmes.adicionar(filme);
                    gerenciaFilmes.listar();
                } 
                else if (op == 2) {
                    System.out.println("Digite o nome da Serie");
                    String nomeSerie = input.nextLine();
                    System.out.println("Digite a categoria da Serie");
                    String categoria = input.nextLine();
                    System.out.println("Digite a quantidade de temporadas");
                    int temporadas = 0;
                    temporadas = excessoes.lerInteiro(temporadas);
                    
                    Series serie = new Series(categoria, nomeSerie, temporadas);
                    gerenciadorSeries.cadastrarSeries(serie);
                    gerenciadorSeries.listar();
                } 
                else {
                    System.out.println("Opção inexistente");
                }
            } 
            
            else if (opcoes == 6) {
                System.out.println("\n\nRemover Filmes/Series");
                System.out.println("(1) Remover filmes\n(2) Remover Series");
                int op = 0;
                op = excessoes.lerInteiro(op);
                
                if (op == 1) {
                    System.out.println("Digite o nome do filme");
                    String nomeFilme = input.nextLine();
                    gerenciaFilmes.apagar(nomeFilme);

                } else if (op == 2) {
                    System.out.println("Digite o nome da serie");
                    String nomeSerie = input.nextLine();
                    gerenciadorSeries.apagar(nomeSerie);
                }
            } 
            
            else if (opcoes == 7) {
                System.out.println("Buscar Filmes/Séries");
                System.out.println("(1) Buscar filmes\n(2) Buscar Series");
                int op = 0;
                op = excessoes.lerInteiro(op);
                if (op == 1) {
                    gerenciaFilmes.listar();
                } else if (op == 2) {
                    gerenciadorSeries.listar();
                }
            } 
         
            else if (opcoes == 8) {
                System.out.println("\n\nDados do pagamento");
                System.out.println("Digite a data do vencimento: ");
                String data = input.nextLine();
                System.out.println("Informe o tipo de Pacote de assinatura; ");
                System.out.println("(1) Básico\n(2) Padrão\n(3) Premium");
                int tipo = 0;
                tipo = excessoes.lerInteiro(tipo);
                Double value = (double) 0;
                if(tipo == 1) {
                	value = 19.90;
                }
                else if(tipo == 2) {
                	value = 27.90;
                }
                else if(tipo == 3) {
                	value = 37.90;
                }
                else {
                	System.out.println("Opção inexistente");
                }
                
                
                System.out.println("Digite a forma de pagamento: \n(1) Boleto\n(2)Cartão");
                int op = 0;
                op = excessoes.lerInteiro(op);
                
                if(op == 1) {
                	Boleto boleto = new Boleto(data,value);
                	System.out.println("Informe seu endereço: ");
                	boleto.setEndereco(input.nextLine());
                	System.out.println("Informe seu bairro: ");
                	boleto.setBairro(input.nextLine());
                	
                	gerenciadorTipoPagamento.adicionandoTipo(boleto);
                	
                	System.out.println("\tDados do pagamento");
                	System.out.println("*******************************");
                	System.out.println("Nome: "+user.nome);
                	System.out.println("CPF: "+user.getCpf());
                	System.out.println("Forma de pagamento: Boleto");
                	System.out.println("Endereço: "+boleto.getEndereco());
                	System.out.println("Bairro: "+boleto.getBairro());
                	System.out.println("Valor: "+boleto.getValor());
                	System.out.println("Data do vencimento: "+boleto.getDataVencimento());
                	System.out.println("*******************************");
                	
                }
                else if(op == 2) {
                	Cartao cartao = new Cartao(data,value);
                	System.out.println("Informe os dados do cartão");
                	System.out.println("Bandeira do cartão: ");
                	cartao.setBandeira(input.nextLine());
                	System.out.println("Número do cartão: ");
                	cartao.setCodigo(input.nextLine());
                	System.out.println("Data de validade do cartão: ");
                	cartao.setDataVencimento(input.nextLine());
                	System.out.println("Código de segurança: ");
                	cartao.setCodigo(input.nextLine());
                	
                	gerenciadorTipoPagamento.adicionandoTipo(cartao);
                	
                	System.out.println("\tDados do pagamento");
                	System.out.println("*******************************");
                	System.out.println("Nome: "+user.nome);
                	System.out.println("CPF: "+user.getCpf());
                	System.out.println("Forma de pagamento: Cartão");
                	System.out.println("Bandeira: "+cartao.getBandeira());
                	System.out.println("Número do cartão: "+cartao.getNumeroCartao());
                	System.out.println("Data de validade do cartão: "+cartao.getDataVencimento());
                	System.out.println("Código de segurança: "+cartao.getCodigo());
                	System.out.println("Valor: "+cartao.getValor());
                	System.out.println("Data de vencimento: "+cartao.getDataVencimento());
                	System.out.println("*******************************");
                	
                }
                else {
                	System.out.println("Opção inexistente");
                }  
            } 
            else if(opcoes == 9){
                break;
            }
            else {
                System.out.println("Opcao inválida");
            }
            opcoes();
            opcoes = 0;
            opcoes = excessoes.lerInteiro(opcoes);
        }

    }


}