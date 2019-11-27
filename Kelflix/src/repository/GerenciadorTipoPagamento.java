package repository;

import java.util.ArrayList;

import interfaceModels.Gerenciador;
import models.TipoPagamento;

public class GerenciadorTipoPagamento extends TipoPagamento implements Gerenciador {

    public GerenciadorTipoPagamento(String formaPagamento, String dataVencimento, Double valor) {
        super(formaPagamento, dataVencimento, valor);
        // TODO Auto-generated constructor stub
    }

    public GerenciadorTipoPagamento(){
        super();
    }

    ArrayList<TipoPagamento> listTipoPagamento = new ArrayList<>();

    @Override
    public void listar() {
      for (TipoPagamento tipoPagamento : listTipoPagamento) {
          System.out.println("\n-----------\n"+tipoPagamento.toString());
      }
    }

    @Override
    public void adicionar(TipoPagamento tipoPagamento) {
        listTipoPagamento.add(tipoPagamento);

    }

    @Override
    public void editar(TipoPagamento tipoPagamento) {
        // TODO Auto-generated method stub

    }

    @Override
    public void apagar(TipoPagamento tipoPagamento) {
        // TODO Auto-generated method stub

    }
}