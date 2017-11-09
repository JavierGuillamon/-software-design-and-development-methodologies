import java.util.Observable;
import java.util.Observer;


public class Stock implements Observer{

	public Stock(Observable observable){
		observable.addObserver(this);
	}
	
	public void update(Observable arg0, Object arg1) {
		if(arg1 instanceof Libro){
			System.out.println("Se elimina "+((Libro)arg1).getNombre()+" de stock");
		}
	}

}
