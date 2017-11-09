
public class Nino {
	String nombre;
	
	public Nino(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getPremios(){
		return "Pegatina";
	}

	public Nino nuevaSemana(){
		return this;
	}
}
