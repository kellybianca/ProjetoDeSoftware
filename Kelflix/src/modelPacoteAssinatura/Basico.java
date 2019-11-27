package modelPacoteAssinatura;

import models.Pacotes;

public class Basico extends Pacotes{

    //  ArrayList<Gerenciador> listar;

	public Basico(String descricao, Double valor){
        super(descricao, valor);
        this.descricao = descricao;
        this.valor = valor;
    }

}