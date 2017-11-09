
public class Stock implements Observer{

	public Stock(Subject alarmaLibro){
		alarmaLibro.registerObserver(this);
	}
	public void update(Libro libro) {
		System.out.println("Se elimina "+libro.getNombre()+" de stock");
	}

}
