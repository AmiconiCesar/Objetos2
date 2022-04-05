package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jackson extends VoorheesExporter{
	

	
	

	@Override   
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) 
			return "[]";
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(socios);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		    }

}
