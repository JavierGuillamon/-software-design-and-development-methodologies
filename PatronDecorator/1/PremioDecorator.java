
public abstract class PremioDecorator extends Nino{
	public Nino nino; 
	public PremioDecorator(Nino nino) {
		super(nino.getNombre());
		this.nino = nino;
	}

	public abstract String getPremios();

	public Nino nuevaSemana(){
		return nino.nuevaSemana();
	}
}
