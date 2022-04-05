package ar.edu.unlp.info.oo2.ejercicio4p2_CalculoDeSueldos;

public class Planta extends Empleado {
	
	
	private boolean esCasado = false;
	private int cantidadHijos = 0;
	private int antigüedad = 0;

	
	
	public Planta(int antigüedad, boolean esCasado, int cantidadHijos) {
		super();
		this.esCasado = esCasado;
		this.cantidadHijos = cantidadHijos;
		this.antigüedad = antigüedad;
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

	public int getAntigüedad() {
		return antigüedad;
	}

	public void setAntigüedad(int antigüedad) {
		this.antigüedad = antigüedad;
	}

	@Override
	public int calcularBasico() {
		
		return 50000;
	}

	@Override
	public int calcularAdicional() {
		 int adicional = 0;
		 if (this.esCasado) adicional = 5000;
		 return adicional + (2000 * this.cantidadHijos) + (2000 * this.antigüedad);
	}
	
}
