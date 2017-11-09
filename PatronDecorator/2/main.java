
public class main {

	public static void main(String[] args) {
		Nino nino = new Nino("nombre 1");
		nino = new Certificado(nino);
		nino = new Libro(nino,"Libro1");
		System.out.println(nino.getNombre()+": "+nino.getPremios()+" Libros: "+((Libro) nino).getLibros());
		nino = nino.nuevaSemana();
		System.out.println(nino.getNombre()+": "+nino.getPremios());
		
		Nino nino2 = new Nino("nombre 2");
		nino2 = new Certificado(nino2);
		System.out.println(nino2.getNombre()+": "+nino2.getPremios());	
	}
}

