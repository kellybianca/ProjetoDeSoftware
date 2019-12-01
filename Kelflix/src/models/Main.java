package models;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import excessoes.*;
import repository.GerenciadorUser;
public class Main {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
			
		System.out.println("Bem vindo ao kelflix");
		System.out.println("Digite uma das opções abaixo: ");
		System.out.println("(1) Login\n(2) Cadastro\n(3) Logout");
		
		GerenciadorUser gerenciar = new GerenciadorUser();
		ArrayList<User> usuarios = new ArrayList<>();
		TratandoExcessoes excessao = new TratandoExcessoes();
		
		User admin = new User(0,123,21,"123","Admin","Admin@gmail,com");
		usuarios.add(0, admin);
		gerenciar.cadastrarUsuario(admin);
		User user1 = new User(1, 123456, 132, "123465", "Kelly", "k@gmail.com");
		usuarios.add(1,user1);
		gerenciar.cadastrarUsuario(user1);

		
		String nome;
		User user;
		
		
		int op = 0;
		op = excessao.lerInteiro(op);
//		input.nextLine();
		
		while(true) {

			if(op == 1) {
			

				System.out.println("Fazer login com: (1)Admin ou (2)Usuario");
				
				int escolha = 0;
				escolha = excessao.lerInteiro(escolha);
//				input.nextLine();
				
				Login telaLogin = new Login();
				if(escolha == 1) {
					System.out.println("Para fazer login\nInsira o seu nome de Admin: ");
					nome = input.nextLine();
					
					if(!(nome.equals(admin.nome))) {
						System.out.println("Nome incorreto !");
					}
					
					System.out.println("Insira sua senha: ");
					int senha = 0;
					senha = excessao.lerInteiro(senha);
					input.nextLine();
					
					if(senha != admin.getSenha()) {
						System.out.println("Senha incorreta !");
					}
					if(nome != null && senha != ' ' ) {
						System.out.println("Login realizado com sucesso\nBem vindo "+admin.nome);
						telaLogin.login(gerenciar, admin);
					}		
				}
				else if(escolha == 2) {			
					System.out.println("Para fazer login\nInsira o seu nome de usuario: ");
					nome = input.nextLine();
					
					User userlogin = null;
					
					for (User u : usuarios) {
						if (u.getNome().equals(nome)) {
							userlogin = u;
							break;
						}
					}
					
					if(userlogin == null) {
						System.out.println("Nome de usuario inexistente!");
					} else {
					
						System.out.println("Insira sua senha: ");
						int senha = 0;
						senha = excessao.lerInteiro(senha);
//						input.nextLine();
						
						if(senha == userlogin.getSenha()) {
							System.out.println("Login realizado com sucesso\nBem vind@ "+nome);
							telaLogin.login(gerenciar, user1);
						} else {
							System.out.println("Senha incorreta");
						}
					}
				}
				else {
					System.out.println("Escolha inexistente");
				}
				
			}
			else if(op == 2) {
			
				user = new User();
			
				System.out.println("Digite os dados a seguir para concluir o seu cadastro: ");
				System.out.println("Nome: ");
				user.nome = input.nextLine();
				System.out.println("Senha: ");
				int senha1 = 0;
				senha1 = excessao.lerInteiro(senha1);
				user.setSenha(senha1);

				System.out.println("Email: ");
				user.email = input.nextLine();

				System.out.println("Idade: ");
				int idade = 0;
				idade = excessao.lerInteiro(idade);
//				input.nextLine();
				user.idade = idade;

				System.out.println("CPF: ");
				user.setCpf(input.nextLine());

				gerenciar.cadastrarUsuario(user);
				usuarios.add(user);
				
				System.out.println(user.getNome() +" salva com sucesso!");
			}
			else if(op == 3){
				return ;
			}
			else {	
				System.out.println("Opção inexistente");
			}
			System.out.println("Digite uma das opções abaixo: ");
			System.out.println("(1) Login\n(2) Cadastro\n(3) Logout");
			op = 0;
			op = excessao.lerInteiro(op);
//			input.nextLine();
		}
	}




}
