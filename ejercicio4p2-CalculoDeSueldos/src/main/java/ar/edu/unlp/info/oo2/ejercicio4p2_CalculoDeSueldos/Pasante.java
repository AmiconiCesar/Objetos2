package ar.edu.unlp.info.oo2.ejercicio4p2_CalculoDeSueldos;

public class Pasante extends Empleado{
	
	private int examenesRendidos = 0;	
	
	

	public int getExamenesRendidos() {
		return examenesRendidos;
	}

	public void setExamenesRendidos(int examenesRendidos) {
		this.examenesRendidos = examenesRendidos;
	}

	@Override
	public int calcularBasico() {
		  
		return 20000;
	}

	@Override
	public int calcularAdicional() {
		
		return (2000 * this.examenesRendidos);
	}

}
