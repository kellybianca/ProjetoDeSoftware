package repository;

import java.util.ArrayList;
import java.util.Scanner;

import interfaceModels.InterfaceUser;
import models.User;

public class GerenciadorUser implements InterfaceUser {
    Scanner input;
    ArrayList<User> listUsers;

    public GerenciadorUser(){
    	this.listUsers = new ArrayList<User>();
    	this.input = new Scanner(System.in);
    }
    
    @Override
    public boolean cadastrarUsuario(User usuario) {
        usuario.id = usuario.id + 1; 
        listUsers.add(usuario);
        return true;
    }

    @Override
    public void removerUsuario(User usuario) {
        listUsers.remove(usuario);
    }

    @Override
    public void listUsers() {
        for (User users : listUsers) {
            System.out.println("\n-------\n"+users.toString());
        }

    }

    @Override
    public void alterarUsuario(User user) {
       
        System.out.println("Edição de dados do usuario");
        System.out.println("Digite seus dados novamente: ");
        System.out.println("Nome: ");
        user.setNome(input.nextLine());

        System.out.println("Senha: ");
        user.setSenha(input.nextInt());
        input.nextLine();

        System.out.println("Email: ");
        user.setEmail(input.nextLine());

        System.out.println("Idade: ");
        user.setIdade(input.nextInt());
        input.nextLine();

        System.out.println("CPF: ");
        user.setCpf(input.nextLine());
    }


    

}

