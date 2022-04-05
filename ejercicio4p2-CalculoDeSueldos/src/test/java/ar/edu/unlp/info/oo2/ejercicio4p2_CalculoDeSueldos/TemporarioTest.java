package ar.edu.unlp.info.oo2.ejercicio4p2_CalculoDeSueldos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemporarioTest {

	Temporario temporario;
			
	
	
	@BeforeEach
	void setUp() throws Exception {
		temporario = new Temporario(5,false,0);
        		
	}
    @Test
    public void testSueldo() {
    	// CasoA 5 hs trabajadas - no está casado - sin hijos
    	assertEquals(18705, temporario.calcularSueldo());
       
    	// CasoB 5 hs trabajadas - está casado - sin hijos
    	temporario.setEsCasado(true);
    	assertEquals(23455, temporario.calcularSueldo());
    	
    	temporario.setCantidadHijos(2);
    	// CasoD 5 hs trabajadas - está casado - 2 hijos
        
    	assertEquals(27255, temporario.calcularSueldo());
    	
    	// CasoC 5 hs trabajadas - no está casado - 2 hijos
        
    	temporario.setEsCasado(false);
    	assertEquals(22505, temporario.calcularSueldo());
    	
    	
    }
	
	
}
