package adapterHash;

import java.util.HashMap;
import java.util.TreeMap;

public class MapAdapterString {
	
	public HashMap<String, String> hashMap(String[][] mat) {
		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < mat[0].length; i++) {
			map.put(mat[0][i], mat[1][i]);
		}
		return map;
	}

	public TreeMap<String, String> treeMap(String[][] mat) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		for (int i = 0; i < mat[0].length; i++) {
			map.put(mat[0][i], mat[1][i]);
		}
		return map;
	}
}
