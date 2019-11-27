package repository;

import java.util.ArrayList;
import java.util.List;

import interfaceModels.IRepositoryUser;
import models.User;

public class RepositoryUser implements IRepositoryUser{
	
	List<User> listUser = new ArrayList<User>();
	
	

	@Override
	public boolean cadastrarUsuario(User usuario) {
		try {
			listUser.add(usuario);		//pode gerar um erro 	
		}
		catch(Exception e) {
			return false; //tratamento de erro  associado
		}
		return true;
	}

	@Override
	public boolean removerUsuario(int id) {	
		for (User user : listUser) {
			if(user.getId() == id) {
				listUser.remove(user);
			}
		}
		
		return false;
	}

	@Override
	public List<User> listUsers() {
		return listUser;
	}

	@Override
	public boolean alterarUsuario(User usuario) {
		for (User user : listUser) {
			if(user.getId() == usuario.getId()) {
				listUser.remove(user);
				listUser.add(usuario);
			}
		}
		return false;
	}
	

}
