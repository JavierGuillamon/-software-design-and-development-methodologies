
public class Libro extends PremioDecorator {
	
	public Libro(Nino nino){
		super(nino);
	}
	
	public String getPremios() {
		return nino.getPremios()+", Libro";
	}	
}
