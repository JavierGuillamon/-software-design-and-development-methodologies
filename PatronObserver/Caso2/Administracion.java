import java.util.Observable;
import java.util.Observer;

public class Administracion implements Observer{

	public Administracion(Observable observable){
		observable.addObserver(this);
	}
	
	public void update(Observable arg0, Object arg1) {
		if(arg1 instanceof Libro){
			System.out.println("Se notifica a Administraciob que "+((Libro)arg1).getNombre()+" esta defectuoso");
		}
	}
}
