package interfaceModels;

import models.User;

public interface InterfaceUser {

	public boolean cadastrarUsuario(User usuario);
	public void removerUsuario(User usuario);
	public void listUsers();
	public void alterarUsuario(User usuario);
}