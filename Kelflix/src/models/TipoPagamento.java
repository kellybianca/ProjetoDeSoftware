package models;

public class TipoPagamento {
    String dataVencimento;
    Double valor;
    
    public TipoPagamento(String dataVencimento, Double valor){
        super();
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public TipoPagamento(){
        super();
    }
    

    public String toString(){
        String tipo;
        tipo = "\nData de Pagamento: "+this.dataVencimento;
        tipo += "\nValor: "+this.valor;
        return tipo;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    

    

}