package repository;

import java.util.ArrayList;
import interfaceModels.IGerenciador;
import models.Pacotes;

public class GerenciadorPacotes extends Pacotes implements IGerenciador{

    ArrayList<Pacotes> listPacotes;
    
    public GerenciadorPacotes() {
    	this.listPacotes =  new ArrayList<>();
    }

    public void adicionar(Pacotes pacotes) {
    	if(listPacotes.size() > 0) {
    		System.out.println("Você só pode ter um pacote de assinatura");
    	}
    	else {
    		listPacotes.add(pacotes);
    	}

    }

    @Override
    public void editar(String pacotes) {
       

    }

    @Override
    public void apagar(String pacotes) {
    	for(int i = 0; i < listPacotes.size(); i++) {
    		listPacotes.remove(i);
    	}

    }

    @Override
    public void listar() {
        for (Pacotes pacotes : listPacotes) {
            System.out.println("\n--------\n"+pacotes.toString());
        }

    }

}