package factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Nomes {
	List<Nome> nomes;
	
	public Nomes(String[] lista) {
		nomes = new ArrayList<>();
		processar(lista);
		imprimir();			
	}

	public void imprimir() {
		for (Nome nome : nomes) {
			System.out.println(nome);
		}
	}

	public void processar(String[] lista) {
		ArmazemNomes an = null;
		for (String item : lista) {
			if (item.indexOf(',') >= 0) {
				an = new ArmazemNomesVirgulados(nomes);
			} else {
				an = new ArmazemNomesDesvirgulados(nomes);
			}
			nomes = an.armazenar(item);
		}
	}

}