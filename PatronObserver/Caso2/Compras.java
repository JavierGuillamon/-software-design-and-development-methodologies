import java.util.Observable;
import java.util.Observer;

public class Compras implements Observer{
	
	public Compras(Observable observable){
		observable.addObserver(this);
	}
	
	public void update(Observable arg0, Object arg1) {
		if(arg1 instanceof Libro){
			System.out.println("Se añade "+((Libro)arg1).getNombre()+" a la lista de la compra");
		}
	}
}
