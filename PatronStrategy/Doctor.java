
public abstract class Doctor {
	private String nombre;
	private int nino;
	
	public void Examinar(int nino) {
		System.out.println(nombre+" est� examinado al ni�o: "+nino);
		this.nino = nino;
	}

	public void EnviarFactura() {
		System.out.println(nombre+" envia factura a los padres del ni�o: "+nino);
	}

	public void EnviarResultados() {
		System.out.println(nombre+" envia los resultados a los padres del ni�o: "+nino);
	}
	
	public void setNombre(String nombre){
		this.nombre= nombre;
	}
}
