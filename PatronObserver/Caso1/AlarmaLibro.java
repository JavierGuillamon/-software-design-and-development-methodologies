import java.util.ArrayList;


public class AlarmaLibro implements Subject {
	private ArrayList observers;
	private Libro libro;
	
	public AlarmaLibro(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(libro);
		}
	}

	public void libroDefectuoso(Libro libro){
		this.libro = libro;
		notifyObservers();
	}
	
}
