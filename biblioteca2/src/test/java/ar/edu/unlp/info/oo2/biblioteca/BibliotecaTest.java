package ar.edu.unlp.info.oo2.biblioteca;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	
	
	private Biblioteca biblioteca;
	
	private Socio socio1;
	private Socio socio2;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		
		biblioteca = new Biblioteca();
		socio1 = new Socio("Carlos Solari", "indio@gmail.com", "12458-8");
		socio2 = new Socio("Eddie Vedder", "pearljam@gmail.com", "8478-8");
		//biblioteca.setExporter(new JSONsimple());
		biblioteca.agregarSocio(socio1);
		biblioteca.agregarSocio(socio2);
		
	}
	
	@Test
	public void testExportar() throws Exception {
		JSONParser parser = new JSONParser();
		JSONArray lista = (JSONArray) parser.parse(biblioteca.exportarSocios());
		System.out.println(biblioteca.exportarSocios());
		JSONObject obj1 = (JSONObject) lista.get(0);
		JSONObject obj2 = (JSONObject) lista.get(1);
		
		Assertions.assertEquals(obj1.get("nombre"), socio1.getNombre());
		Assertions.assertEquals(obj1.get("email"), socio1.getEmail());
		Assertions.assertEquals(obj1.get("legajo"), socio1.getLegajo());
		
		Assertions.assertEquals(obj2.get("nombre"), socio2.getNombre());
		Assertions.assertEquals(obj2.get("email"), socio2.getEmail());
		Assertions.assertEquals(obj2.get("legajo"), socio2.getLegajo());
		
		
		
	}
	
	
	
	
	/*Biblioteca biblioteca = new Biblioteca();
	socio
	
	biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com","5234-5"));
	biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com","2345-2"));
	String json = biblioteca.exportarSocios(); 
			}
	//List<Socio> list = (List<Socio>) objectMapper.readValue(json, Socio.class);
	/*JSONParser parser = new JSONParser();
	Object obj = parser.parse(biblioteca.exportarSocios());
	JSONArray list = (JSONArray) obj;
	System.out.println(list.toJSONString());
	JSONObject e = (JSONObject)list.get(0);
	System.out.println(e.get("nombre"));*/
	



}
