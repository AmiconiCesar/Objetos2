package ar.edu.unlp.info.oo2.ejercicio1p2_Topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	  private Topografia agua, tierra, mixta1, mixta2;
	  private Topografia agua2, tierra2, mixtaC, mixtaD;
	  private Topografia pantano1,pantano2;
	  
		
	@BeforeEach
	void setUp() throws Exception {
		this.agua = new TopografiaAgua();
		this.tierra = new TopografiaTierra();
		this.mixta1 = new TopografiaMixta(agua,tierra,tierra,agua);
		this.mixta2 = new TopografiaMixta(agua,tierra,tierra,mixta1);
		this.agua2 = new TopografiaAgua();
		this.tierra2 = new TopografiaTierra();
		this.mixtaC = new TopografiaMixta(agua2,tierra,tierra2,agua);
		this.mixtaD = new TopografiaMixta(agua,tierra2,tierra,mixtaC);
		
		this.pantano1 = new TopografiaPantano();
		this.pantano2 = new TopografiaPantano();
		
		
		
	}
    @Test
    public void testProporcionAgua() {
        assertEquals(1, agua.getProporcionAgua());
        assertEquals(0, tierra.getProporcionAgua());
        assertEquals(0.5, mixta1.getProporcionAgua());
        assertEquals(0.375, mixta2.getProporcionAgua());
        
        assertEquals(0.7, pantano1.getProporcionAgua());
        this.mixta1 = new TopografiaMixta(agua,tierra,pantano1,agua);
        assertEquals(0.675, mixta1.getProporcionAgua());
        
     }
    @Test
    public void testProporcioTierra() {
        assertEquals(0, agua.getProporcionTierra());
        assertEquals(1, tierra.getProporcionTierra());
        assertEquals(0.5, mixta1.getProporcionTierra());
        assertEquals(0.625, mixta2.getProporcionTierra());
     }
    
     @Test
     public void testEquals() {
    	
    	 assertTrue(agua.equals(agua2));
    	 assertTrue(agua2.equals(agua));
    	
    	 assertFalse(tierra.equals(agua));
    	 assertFalse(agua.equals(tierra));
    	 
    	 assertTrue(mixta1.equals(mixtaC));
    	 assertTrue(mixtaC.equals(mixta1));
    	 
    	 assertFalse(agua.equals(mixta1));
    	 assertFalse(mixta1.equals(agua));
    	 
    	 assertTrue(mixta2.equals(mixtaD));
    	 assertTrue(mixtaD.equals(mixta2));
    	 
    	 assertFalse(mixta2.equals(mixta1));
    	 assertFalse(mixta1.equals(mixta2));
    	 
    	 Topografia mixtaE = new TopografiaMixta(tierra2,agua,tierra,mixtaC);
    	 assertFalse(mixtaE.equals(mixtaD));
    	 
    	 Topografia mixtaAgua = new TopografiaMixta(agua,agua,agua,agua);
    	 assertFalse(agua.equals(mixtaAgua));
    	 
    	 assertTrue(pantano1.equals(pantano2));
    	 
    	 mixtaE = new TopografiaMixta(agua,mixta2,tierra,pantano2);
    	 assertFalse(mixtaE.equals(mixta1));
    	 assertFalse(mixta2.equals(mixta1));
    	 
    			   		 
    	 
     }
    
}