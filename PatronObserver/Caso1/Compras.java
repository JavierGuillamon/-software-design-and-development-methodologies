
public class Compras implements Observer{
	
	public Compras(Subject alarmaLibro){
		alarmaLibro.registerObserver(this);
	}
	public void update(Libro libro) {
		System.out.println("Se a�ade "+libro.getNombre()+" a la lista de la compra");
	}

}
