package factorymethod;

public class CriadorDeNomesVirgulados implements CriadorDeNomes {

	@Override
	public Nome criar(String s) {
		// Soares, Wyllis
		String[] sep = s.split(", ");
		return new Nome(sep[1], sep[0]);
	}
}
