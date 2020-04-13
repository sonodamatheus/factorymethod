package observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
class Comprador implements Observer {

	Observable preco;

	public Comprador(Observable preco) {
		this.preco = preco;
		preco.addObserver(this);
	}

	@Override
	public void update(Observable preco, Object arg1) {
		if (preco instanceof Preco) {
			Preco p = (Preco) preco;
			if (p.getOferta() < 10) {
				System.out.println("oferta boa, comprar: " + p.getOferta());
			} else {
				System.out.println("oferta muito cara: " + p.getOferta());
			}
		}
	}
}
