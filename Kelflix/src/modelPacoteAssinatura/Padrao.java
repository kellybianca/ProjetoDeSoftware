package modelPacoteAssinatura;

import models.Pacotes;

public class Padrao extends Pacotes{

    public Padrao(String descricao, Double valor) {
        super(descricao, valor);
        this.descricao = descricao;
        this.valor = valor;
    }

}