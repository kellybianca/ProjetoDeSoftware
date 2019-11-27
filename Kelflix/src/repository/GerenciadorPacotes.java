package repository;

import java.util.ArrayList;

import interfaceModels.InterfacePacotes;
import models.Pacotes;

public class GerenciadorPacotes extends Pacotes implements InterfacePacotes{

    ArrayList<Pacotes> listPacotes =  new ArrayList<>();

    @Override
    public void adicionar(Pacotes pacotes) {
        listPacotes.add(pacotes);

    }

    @Override
    public void editar(Pacotes pacotes) {
        // TODO Auto-generated method stub

    }

    @Override
    public void apagar(Pacotes pacotes) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listar() {
        for (Pacotes pacotes : listPacotes) {
            System.out.println("\n--------\n"+pacotes.toString());
        }

    }

}