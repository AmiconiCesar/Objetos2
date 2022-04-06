package ar.edu.unlp.info.oo2.ejercicio4p2_CalculoDeSueldos;

public abstract class Empleado {
	
	
	abstract public int calcularBasico();
	
	abstract public int calcularAdicional();
	
	public double calcularDescuento() {
		return (this.calcularBasico() * 13) / 100 + (this.calcularAdicional() * 5) / 100;
	}
	
	
	// Template Method
	public double calcularSueldo() {   
		
		return this.calcularBasico() + this.calcularAdicional() - this.calcularDescuento();
		
	}

}
