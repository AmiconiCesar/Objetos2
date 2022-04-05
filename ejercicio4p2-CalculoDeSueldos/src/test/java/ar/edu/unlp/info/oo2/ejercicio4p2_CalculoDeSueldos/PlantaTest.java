package ar.edu.unlp.info.oo2.ejercicio4p2_CalculoDeSueldos;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlantaTest {

	Planta planta;
			
	
	
	@BeforeEach
	void setUp() throws Exception {
		planta = new Planta(0,false,0);
        		
	}
    @Test
    public void testSueldo() {
    	// CasoA  sin antiguedad no esta casado sin hijos
    	assertEquals(43500, planta.calcularSueldo());
       
    	// CasoB  sin antiguedad no esta casado con 1 hijo
    	planta.setCantidadHijos(1);
    	assertEquals(45400, planta.calcularSueldo());	
    	
    	// CasoC  sin antiguedad esta casado sin hijos
    	planta.setCantidadHijos(0);
    	planta.setEsCasado(true);
    	assertEquals(48250, planta.calcularSueldo());
    	
    	// CasoD  sin antiguedad esta casado con 1 hijo
    	planta.setCantidadHijos(1);
    	assertEquals(50150, planta.calcularSueldo());
    	
    	// CasoE  2 años antiguedad  no esta casado sin hijos
    	planta.setCantidadHijos(0);
    	planta.setAntigüedad(2);
    	planta.setEsCasado(false);
    	assertEquals(47300, planta.calcularSueldo());
    	
    	// CasoF  2 años antiguedad  no esta casado 1 hijo
    	planta.setCantidadHijos(1);
    	planta.setAntigüedad(2);
    	planta.setEsCasado(false);
    	assertEquals(49200, planta.calcularSueldo());
    	
    	// CasoG  2 años antiguedad esta casado sin hijos
    	planta.setCantidadHijos(0);
    	planta.setAntigüedad(2);
    	planta.setEsCasado(true);
    	assertEquals(52050, planta.calcularSueldo());
    	
    	// CasoH  2 años antiguedad esta casado 1 hijo
    	planta.setCantidadHijos(1);
    	planta.setAntigüedad(2);
    	planta.setEsCasado(true);
    	assertEquals(53950, planta.calcularSueldo());
    	
    	
    	
    	
    	
    	
    }

}
