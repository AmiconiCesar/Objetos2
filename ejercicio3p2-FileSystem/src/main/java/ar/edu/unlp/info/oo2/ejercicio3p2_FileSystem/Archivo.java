package ar.edu.unlp.info.oo2.ejercicio3p2_FileSystem;

import java.time.LocalDate;

public class Archivo extends Component{
	
		

	public Archivo(String nombre, LocalDate fecha, int tamaño) {
		 
		super(nombre, fecha, tamaño);
		
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

 	
	
}
