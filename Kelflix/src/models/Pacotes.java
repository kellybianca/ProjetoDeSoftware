package models;

public class Pacotes{

    public String descricao;
    public Double valor;

    public Pacotes( String descricao, Double valor) {
        super();
        this.descricao = descricao;
        this.valor = valor;
    }

    public Pacotes(){
        super();
    }

    public String toString(){
        String pacote;
        pacote = "\n\nDescrição: "+this.descricao;
        pacote += "\nValor: "+this.valor;
        return pacote;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    

}
