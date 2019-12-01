package repository;

import java.util.ArrayList;
import java.util.Scanner;

import interfaceModels.IGerenciador;
import models.User;

public class GerenciadorUser implements IGerenciador {
    Scanner input;
    ArrayList<User> listUsers;

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
                listUsers.get(i).setSenha(input.nextInt());
                input.nextLine();
        
                System.out.println("Email: ");
                listUsers.get(i).setEmail(input.nextLine());
        
                System.out.println("Idade: ");
                listUsers.get(i).setIdade(input.nextInt());
                input.nextLine();
        
                System.out.println("CPF: ");
                listUsers.get(i).setCpf(input.nextLine());
            }
   
        }
       
        if(flag == 1) {
        	System.out.println("Dados alterados");
        }else {
        	System.out.println("Usuario nao encontrado");
        }
    }


    

}
