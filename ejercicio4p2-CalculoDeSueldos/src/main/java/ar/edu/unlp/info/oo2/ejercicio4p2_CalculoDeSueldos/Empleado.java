package ar.edu.unlp.info.oo2.ejercicio4p2_CalculoDeSueldos;

public abstract class Empleado {
	
	
	abstract public int calcularBasico();
	
	abstract public int calcularAdicional();
	
	public double calcularDescuento(int basico, int adicional) {
		return (basico * 13) / 100 + (adicional * 5) / 100;
	}
	
	
	// Template Method
	public double calcularSueldo() {   
		int basico, adicional;
		basico = this.calcularBasico();
		adicional = this.calcularAdicional();
		return basico + adicional - this.calcularDescuento(basico, adicional);
		
	}

}
