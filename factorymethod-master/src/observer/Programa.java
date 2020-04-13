package observer;

public class Programa {
	public static void main(String[] args) {
		Preco preco = new Preco();       
		Comprador comprador = new Comprador(preco);
		preco.setNovaOferta(1);
		preco.setNovaOferta(5);
		preco.setNovaOferta(10);
		preco.setNovaOferta(7);
		preco.setNovaOferta(115);
	}
}
