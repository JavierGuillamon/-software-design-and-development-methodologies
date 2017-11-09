import java.util.Observable;

public class AlarmaLibro extends Observable {
	
	public void libroDefectuoso(Libro libro){
		setChanged();
		notifyObservers(libro);
	}
	
}
