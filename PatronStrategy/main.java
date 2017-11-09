
public class main {

	public static void main(String[] args) {
		Guarderia guarderia= new Guarderia();
		int[] a = {1,2,3,4,5};
		guarderia.setNinos(a);
		
		//Cambiar el dia para seleccionar otro doctor
		int dia=15;
		Doctor Oculista = new DrWang();
		Doctor Logopeda = new DrFong();
		
		switch(dia){
			case 15:
				guarderia.SetDoctor(Oculista);
				break;
			case 28:
				guarderia.SetDoctor(Logopeda);
				break;
			default:
				System.out.println("Este dia no viene ningun doctor");
				System.exit(0);
		}
		guarderia.ExaminarNinos();
	}
}
