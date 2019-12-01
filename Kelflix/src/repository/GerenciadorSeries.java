package repository;

import java.util.ArrayList;
import interfaceModels.IGerenciador;
import videos.Series;

public class GerenciadorSeries implements IGerenciador {

    ArrayList<Series> listSeries;
    
    public GerenciadorSeries() {
    	this.listSeries = new ArrayList<Series>();
    }

    public boolean cadastrarSeries(Series serie) {
        listSeries.add(serie);
        return true;
    }

	@Override
	public void editar(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar(String nome) {
		int flag = 0;
		for (int i = 0; i < listSeries.size(); i++) {
			if(nome.equals(listSeries.get(i).getNome())) {
				listSeries.remove(i);
				flag = 1;
			}
		}
		if(flag == 1) {
			System.out.println("Serie removida");
		}
		else {
			System.out.println("Série não encontrada");
		}
		
	}

	@Override
	public void listar() {
		for (Series series : listSeries) {
			System.out.println("\n--------\n"+series.toString());
		}
		
	}


   

}