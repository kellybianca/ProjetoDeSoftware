package modelTipoPagamento;

import models.TipoPagamento;

public class Boleto extends TipoPagamento {

	private String endereco;
	private String bairro;
	
	
    public Boleto(String dataVencimento, Double valor) {
        super(dataVencimento, valor);
    }

	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
    
   

}