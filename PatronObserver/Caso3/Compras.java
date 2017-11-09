import java.util.Observable;
import java.util.Observer;


public class Compras implements Observer{	
	Observable observable;
	Libro libro;
	public Compras(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof AlarmaLibro){
			AlarmaLibro alarmaLibro = (AlarmaLibro)arg0;
			this.libro = alarmaLibro.getLibro();		
			System.out.println("Se añade "+this.libro.getNombre()+" a la lista de la compra");
		}
	}
}
