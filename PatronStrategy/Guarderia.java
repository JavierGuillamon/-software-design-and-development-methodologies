
public class Guarderia {
	private int[] ninos;
	private Doctor doctor;
	
	public void SetDoctor(Doctor d){
		doctor=d;
	}
	
	public void ExaminarNinos(){
		for (int i = 0; i < ninos.length; i++) {
			doctor.Examinar(ninos[i]);
			doctor.EnviarFactura();
			doctor.EnviarResultados();
		}
	}
	
	public void setNinos(int[]ninos){
		this.ninos=ninos;
	}
}
