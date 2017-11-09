import java.util.Observable;
import java.util.Observer;


public class Stock implements Observer{
	Observable observable;
	Libro libro;
	
	public Stock(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof AlarmaLibro){
			AlarmaLibro alarmaLibro = (AlarmaLibro)arg0;
			this.libro = alarmaLibro.getLibro();		
			System.out.println("Se elimina "+this.libro.getNombre()+" de stock");
		}
	}

}
