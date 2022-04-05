package ar.edu.unlp.info.oo2.ejercicio1RedSocial;

public class Mensaje {
	
	private final static int MIN_LENGHT=1;
	private final static int MAX_LENGHT=140;
	
	static boolean esValido(String texto) {
		return (texto.length() >= MIN_LENGHT && texto.length() <= MAX_LENGHT);
	}
	
	
	private String texto;
	private Mensaje mensajeOrigen;
	
	
	public Mensaje (String texto) {
		this.texto = texto;
		}
	
	public Mensaje (Mensaje mensajeOrigen, String texto) {
		this(texto);
		this.mensajeOrigen = mensajeOrigen;
			}

	public String getTexto() {
		return texto;
	}

	public Mensaje getMensajeOrigen() {
		return mensajeOrigen;
	}

	
	
	
}
