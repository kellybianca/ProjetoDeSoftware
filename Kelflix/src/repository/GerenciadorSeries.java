package repository;

import java.util.ArrayList;
import java.util.Scanner;
import interfaceModels.InterfaceSeries;
import videos.Series;

public class GerenciadorSeries implements InterfaceSeries {

    Scanner input = new Scanner(System.in);
    ArrayList<Series> listSeries = new ArrayList<Series>();

    @Override
    public boolean cadastrarSeries(Series serie) {
        listSeries.add(serie);
        return true;
    }

    @Override
    public void removerSeries(String serie) {
        for (Series series : listSeries) {
            if(serie.equals(series)){
                listSeries.remove(series);
                System.out.println("Serie Removida !");
            }
            else{
                System.out.println("Série não encontrada");
            }
        }

    }

    @Override
    public void listSeries() {
        
        for (Series series : listSeries) {
            System.out.println("\n---------\n"+series.toString());
        }

    }

    @Override
    public void alterarSerie(Series serie) {

    }

    

   

}