
public class Biblioteca {
	
	public static void devuelveLibro(AlarmaLibro alarmaLibro, Libro libro){		
		if(!libro.isBuenEstado()){
			System.out.println("Libro defectuoso");
			alarmaLibro.libroDefectuoso(libro);
		}else
			System.out.println("Libro en buen estado");
	}
	
	public static void main(String[] args) {
		AlarmaLibro alarmaLibro = new AlarmaLibro();
		Stock stock = new Stock(alarmaLibro);
		Compras compras = new Compras(alarmaLibro);
		Administracion administracion = new Administracion(alarmaLibro);
		
		Libro libro1 = new Libro("Libro1", true);
		Libro libro2 = new Libro("Libro2", false);
		Libro libro3 = new Libro("Libro3", false);
		
		devuelveLibro(alarmaLibro,libro1);
		devuelveLibro(alarmaLibro,libro2);
		devuelveLibro(alarmaLibro,libro3);
	}

	
	
}
