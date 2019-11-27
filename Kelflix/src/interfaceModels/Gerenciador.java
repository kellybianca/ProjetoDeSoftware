package interfaceModels;

import models.TipoPagamento;

public interface Gerenciador {
	public void adicionar(TipoPagamento tipoPagamento);
	public void editar(TipoPagamento tipoPagamento);
	public void apagar(TipoPagamento tipoPagamento);
	public void listar();
}
