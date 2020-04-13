package factorymethod;

import java.util.List;

public abstract class ArmazemNomes {
	private List<Nome> nomes;

	public ArmazemNomes(List<Nome> nomes) {
		this.nomes = nomes;
	}
	
	public List<Nome> armazenar(String s) {
		CriadorDeNomes cn = getCriador();
		Nome nome = cn.criar(s);
		nomes.add(nome);
		return nomes;
	}

	protected abstract CriadorDeNomes getCriador();
}