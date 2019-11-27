package interfaceModels;

import java.util.List;

import models.User;

public interface IRepositoryUser {
	
	public boolean cadastrarUsuario(User usuario);
	public boolean removerUsuario(int id);
	public List<User> listUsers();
	public boolean alterarUsuario(User usuario);
}
