package models;

public class TipoPagamento {
    String formaPagamento;
    String dataVencimento;
    Double valor;
    
    public TipoPagamento(String formaPagamento, String dataVencimento, Double valor){
        super();
        this.formaPagamento = formaPagamento;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public TipoPagamento(){
        super();
    }

    public String toString(){
        String tipo;
        tipo = "\n\nForma de Pagamento: "+this.formaPagamento;
        tipo += "\nData de Pagamento: "+this.dataVencimento;
        tipo += "\nValor: "+this.valor;
        return tipo;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
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