package interfaceModels;

import videos.Filmes;

public interface InterfaceFilme {
	public void adicionar(Filmes filme);
	public void editar(Filmes filme);
	public void apagar(String filme);
	public void listar();
}
