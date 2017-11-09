import java.util.Observable;

public class AlarmaLibro extends Observable {
	private Libro libro;
	public AlarmaLibro(){}

	public void libroDefectuoso(Libro libro){
		this.libro = libro;
		setChanged();
		notifyObservers();
	}
	
	public Libro getLibro(){
		return libro;
	}
}
