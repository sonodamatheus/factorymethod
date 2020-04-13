package observer;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Preco extends Observable {
	 
    private int oferta;
 
    public void setNovaOferta(int oferta) {
        this.oferta = oferta;
        setChanged();
        notifyObservers();
    }
     
    public int getOferta() {
        return this.oferta;
    }
     
}