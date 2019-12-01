package modelPacoteAssinatura;

import models.Pacotes;
public class Premium extends Pacotes{

    public Premium(String descricao, Double valor) {
        super(descricao, valor);
        this.descricao = descricao;
        this.valor = valor;
    }

}