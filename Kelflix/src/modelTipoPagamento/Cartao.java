package modelTipoPagamento;

import models.TipoPagamento;

public class Cartao extends TipoPagamento {
	
	public String bandeira;
	private String numeroCartao;
	private String validade;
	private String codigo;
	
    public Cartao(String dataVencimento, Double valor) {
        super(dataVencimento, valor);
    }
    
    public Cartao(String bandeira,String numeroCartao, String validade,String codigo) {
    	this.bandeira = bandeira;
    	this.numeroCartao = numeroCartao;
    	this.validade = validade;
    	this.codigo = codigo;
    }

	public String getBandeira() {
		return bandeira;
	}


	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}


	public String getNumeroCartao() {
		return numeroCartao;
	}


	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}


	public String getValidade() {
		return validade;
	}


	public void setValidade(String validade) {
		this.validade = validade;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
    
    
}