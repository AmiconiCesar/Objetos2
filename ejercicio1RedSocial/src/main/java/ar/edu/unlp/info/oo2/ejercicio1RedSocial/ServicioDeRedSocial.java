package ar.edu.unlp.info.oo2.ejercicio1RedSocial;

import java.util.ArrayList;
import java.util.List;

public class ServicioDeRedSocial {
	
	
	private String nombre;
	private List<Usuario> usuarios;
	
	
	public ServicioDeRedSocial (String nombre) {
			this.nombre = nombre;
			this.usuarios = new ArrayList<Usuario>();
			}


	public String getNombre() {
		return nombre;
	}


	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
    private boolean existeUsuario(String screenName) {
    	return this.usuarios.stream().anyMatch(u -> u.tuNombreEs(screenName));
    }
	
    public Usuario agregarUsuario(String screenName) {
    	if (!this.existeUsuario(screenName)) {
    		Usuario usuario = new Usuario(screenName);
    		this.usuarios.add(usuario);
    		return usuario;   		    		}
    	else return null;
    }
    
    public void eliminarUsuario(Usuario usuario) {
    	usuario.eliminarMensajes();
    	this.usuarios.remove(usuario);
    }
       
    
    

}