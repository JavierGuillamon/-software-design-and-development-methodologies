
public class Certificado extends PremioDecorator{
		
	public Certificado(Nino nino) {
		super(nino);
	}

	public String getPremios() {
		return nino.getPremios()+", certificado";
	}

}
