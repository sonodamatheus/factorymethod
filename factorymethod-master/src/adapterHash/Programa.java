package adapterHash;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Programa {
/*
 * A classe java.util.Map da API de coleções de Java permite que sejam armazenados pares de
objetos (chave e valor) em uma de suas implementações (as mais conhecidas são HashMap
e TreeMap). No entanto, estas classes não possuem um construtor que receba como
parâmetro uma matriz de duas linhas e que monte o mapa usando a primeira linha como
chave e a segunda como valor. Crie um adaptador (dica: use Adapter de classe) que tenha
este construtor.
 */
	public static void main(String[] args) {
		// É possível instanciar um map de forma bastante simples:
		Map<String, String> exemplo = Map.of("k1", "v1", "k2", "v2");
		
		//Seguindo agora para a solução
		MapAdapterString mapAdapter = new MapAdapterString();
		String[][] cv = { { "ch1", "ch2", "ch3" }, { "vl1", "vl2", "vl3" } };
		HashMap hm = mapAdapter.hashMap(cv);
		TreeMap tm = mapAdapter.treeMap(cv);
		System.out.println("HashMap");
		hm.forEach((k, v) -> System.out.println("chave: " + k + "; valor: " + v));
		System.out.println("\nTreeMap");
		tm.forEach((k, v) -> System.out.println("chave: " + k + "; valor: " + v));
	}
	
	
}
