
public class Administracion implements Observer{
	
	public Administracion(Subject alarmaLibro){
		alarmaLibro.registerObserver(this);
	}
	public void update(Libro libro) {
		System.out.println("Se notifica a Administraciob que "+libro.getNombre()+" esta defectuoso");
	}

}
