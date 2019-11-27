package interfaceModels;

import videos.Series;

public interface InterfaceSeries {
	public boolean cadastrarSeries(Series serie);
	public void removerSeries(String serie);
	public void listSeries();
	public void alterarSerie(Series serie);
}