package ar.edu.unlp.info.oo2.ejercicio3p2_FileSystem;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


	
public class Directorio extends Component{

	private List<Component> contenido;
	
	
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha, 32);
		this.contenido = new ArrayList<Component>();
	}

	public void agregar(Component componente) {
		this.contenido.add(componente);
		
	}

	public Archivo archivoMasGrande() {
		return this.contenido.stream().map(component -> component.archivoMasGrande())
				.filter(archivo -> archivo != null)
				.max((Archivo a1, Archivo a2) -> Integer.compare(a1.getTamaño(), a2.getTamaño()))
				.orElse(null);
	}

	public Archivo archivoMasNuevo() {
		return this.contenido.stream().map(component -> component.archivoMasNuevo())
				.filter(archivo -> archivo != null)
				.max((Archivo a1, Archivo a2) -> a1.getFechaCreacion().compareTo(a2.getFechaCreacion()))
				.orElse(null);
	}
	
	public int getTamaño() {
		return 32 + this.contenido.stream().mapToInt(component -> component.getTamaño()).sum();
	}
	
	
	public int tamanoTotalOcupado() {
		
		return 32 + this.contenido.stream().mapToInt(component -> component.getTamaño()).sum(); 
				
	}

}
