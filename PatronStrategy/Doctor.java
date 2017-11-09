
public abstract class Doctor {
	private String nombre;
	private int nino;
	
	public void Examinar(int nino) {
		System.out.println(nombre+" está examinado al niño: "+nino);
		this.nino = nino;
	}

	public void EnviarFactura() {
		System.out.println(nombre+" envia factura a los padres del niño: "+nino);
	}

	public void EnviarResultados() {
		System.out.println(nombre+" envia los resultados a los padres del niño: "+nino);
	}
	
	public void setNombre(String nombre){
		this.nombre= nombre;
	}
}
