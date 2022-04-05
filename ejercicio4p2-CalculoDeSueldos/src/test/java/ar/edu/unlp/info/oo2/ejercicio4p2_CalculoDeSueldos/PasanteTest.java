package ar.edu.unlp.info.oo2.ejercicio4p2_CalculoDeSueldos;

	

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasanteTest {

	Pasante pasante;
			
	
	
	@BeforeEach
	void setUp() throws Exception {
		pasante = new Pasante();
        		
	}
    @Test
    public void testSueldo() {
    	// CasoA sin examenes
    	assertEquals(17400, pasante.calcularSueldo());
       
    	// CasoB con 3 examenes rendidos
    	pasante.setExamenesRendidos(3);
    	assertEquals(23100, pasante.calcularSueldo());
    	
     	
    }

}
