
public class Libro extends PremioDecorator {
	String nombreLibro;
	
	public Libro(Nino nino, String nombreLibro){
		super(nino);
		this.nombreLibro = nombreLibro;
	}
	
	public String getPremios() {
		return nino.getPremios()+", Libro";
	}

	public String getLibros(){
		return nombreLibro;
	}
	
}
