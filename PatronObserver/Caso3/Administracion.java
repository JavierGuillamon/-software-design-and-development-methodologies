import java.util.Observable;
import java.util.Observer;

public class Administracion implements Observer{
	Observable observable;
	Libro libro;
	
	public Administracion(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof AlarmaLibro){			
			AlarmaLibro alarmaLibro = (AlarmaLibro)arg0;
			this.libro = alarmaLibro.getLibro();		
			System.out.println("Se notifica a Administraciob que "+this.libro.getNombre()+" esta defectuoso");
		}
	}
}
