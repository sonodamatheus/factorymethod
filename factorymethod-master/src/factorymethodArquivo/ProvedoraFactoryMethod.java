package factorymethodArquivo;

public class ProvedoraFactoryMethod {

	public ProvedoraFactoryMethod(String senha) {
		Provedora p;
		if (senha.equals("desi gnpatt er ns")) {
			p = new ProvedoraConfidencial();
		} else {
			p = new ProvedoraPublica();
		}
		System.out.println(p.proverInfo());
	}

}
