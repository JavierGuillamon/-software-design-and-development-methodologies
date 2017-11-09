
public class Libro {
	String nombre;
	boolean buenEstado;
	public Libro(String nombre, boolean buenEstado){
		this.nombre = nombre;
		this.buenEstado=buenEstado;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean isBuenEstado() {
		return buenEstado;
	}
}
