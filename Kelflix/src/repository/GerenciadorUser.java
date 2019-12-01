package repository;

import java.util.ArrayList;
import java.util.Scanner;

import excessoes.TratandoExcessoes;
import interfaceModels.IGerenciador;
import models.User;

public class GerenciadorUser implements IGerenciador {
    Scanner input;
    ArrayList<User> listUsers;
    TratandoExcessoes excessoes = new TratandoExcessoes();

    public GerenciadorUser(){
    	this.listUsers = new ArrayList<User>();
    	this.input = new Scanner(System.in);
    }
    
    public void cadastrarUsuario(User usuario) {
        listUsers.add(usuario);
 
    }

    @Override
    public void apagar(String user) {
    	int flag = 0;
    	for(int i = 0; i < listUsers.size(); i++) {
    		if(user.equals(listUsers.get(i).getNome())) {
    			listUsers.remove(listUsers.get(i));
    			flag = 1;			
    		}
    	}
    	
    	if(flag == 1) {
    		System.out.println("Usuário removido com sucesso !");
    	}
    	else {
    		System.out.println("Usuário não encontrado");
    	}
  
    }

    @Override
    public void listar() {
        for (User users : listUsers) {
            System.out.println("\n\t-------\n"+users.toString());
        }

    }

    @Override
    public void editar(String nome) {
    	int flag = 0;
        for (int i = 0; i < listUsers.size(); i++) {
            if(nome.equals(listUsers.get(i).getNome())){
            	flag = 1;
                System.out.println("Edição de dados do usuario");
                System.out.println("Digite seus dados novamente: ");
                System.out.println("Nome: ");
                listUsers.get(i).setNome(input.nextLine());
        
                System.out.println("Senha: ");
                int senha = 0;
                senha = excessoes.lerInteiro(senha);
                listUsers.get(i).setSenha(senha);
        
                System.out.println("Email: ");
                listUsers.get(i).setEmail(input.nextLine());
        
                System.out.println("Idade: ");
                int idade = 0;
                idade = excessoes.lerInteiro(idade);
                listUsers.get(i).setIdade(idade);
        
                System.out.println("CPF: ");
                String cpf = null;
                cpf = excessoes.verificarCpf(cpf);
                listUsers.get(i).setCpf(cpf);
            }
   
        }
       
        if(flag == 1) {
        	System.out.println("Dados alterados");
        }else {
        	System.out.println("Usuario nao encontrado");
        }
    }


    

}

