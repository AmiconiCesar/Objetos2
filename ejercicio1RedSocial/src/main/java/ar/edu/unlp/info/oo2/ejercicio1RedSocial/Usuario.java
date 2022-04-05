package ar.edu.unlp.info.oo2.ejercicio1RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String screenName;
	private List<Mensaje> mensajes;
	
	public Usuario (String screenName) {
		this.screenName = screenName;
		this.mensajes = new ArrayList<Mensaje>();
	}

	public String getScreenName() {
		return screenName;
	}

	public List<Mensaje> getMensajes() {
		return mensajes;
	}
	
	public boolean tuNombreEs(String nombre) {
		return this.getScreenName().equals(nombre); 
	}
	
	private boolean agregarMensaje(Mensaje mensaje) {
		return this.mensajes.add(mensaje);
	}
	
		
	public Mensaje postearMensaje(String texto) {
		if (Mensaje.esValido(texto)) {
			Mensaje mensaje= new Mensaje(texto);
			this.agregarMensaje(mensaje);
			return mensaje;		}
		else return null;
			
			}
	
	public Mensaje responderMensaje(Mensaje mensajeOrigen, String texto) {
		if (Mensaje.esValido(texto)) {
			Mensaje mensaje= new Mensaje(mensajeOrigen, texto);
			this.agregarMensaje(mensaje);
			return mensaje;		}
		else return null;
	        }
		
	public boolean eliminarMensajes() {
		this.mensajes.clear();
		return this.mensajes.isEmpty();
	}
	
	
	}
	
	
	
	


