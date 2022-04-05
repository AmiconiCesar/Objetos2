package ar.edu.unlp.info.oo2.ejercicio4p2_CalculoDeSueldos;

public class Temporario extends Empleado{

	private int horasTrabajadas = 0;
	private boolean esCasado = false;
	private int cantidadHijos = 0;
		
	
	
	
	public Temporario(int horasTrabajadas, boolean esCasado, int cantidadHijos) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.esCasado = esCasado;
		this.cantidadHijos = cantidadHijos;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public boolean isEsCasado() {
		return esCasado;
	}

	public void setEsCasado(boolean esCasado) {
		this.esCasado = esCasado;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	@Override
	public int calcularBasico() {
		
		return 20000 + (this.horasTrabajadas * 300);
	}

	@Override
	public int calcularAdicional() {
		 int adicional = 0;
		 if (this.esCasado) adicional = 5000;
		 return adicional + (2000 * this.cantidadHijos);
	}

}
