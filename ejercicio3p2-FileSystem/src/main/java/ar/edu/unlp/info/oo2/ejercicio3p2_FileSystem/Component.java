package ar.edu.unlp.info.oo2.ejercicio3p2_FileSystem;

import java.time.LocalDate;

public abstract class Component {
	
	private String nombre;
	private LocalDate fechaCreacion;
	private int tamaño;
	
	public Component(String nombre, LocalDate fechaCreacion, int tamaño) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.tamaño = tamaño;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public int getTamaño() {
		return tamaño;
	}
	
	public abstract Archivo archivoMasGrande();
	
	public abstract Archivo archivoMasNuevo();
	
	
	

}
