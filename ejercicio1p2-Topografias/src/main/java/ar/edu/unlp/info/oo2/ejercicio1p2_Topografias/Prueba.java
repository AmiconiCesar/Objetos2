package ar.edu.unlp.info.oo2.ejercicio1p2_Topografias;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		
		TopografiaAgua agua = new TopografiaAgua();
		TopografiaTierra tierra = new TopografiaTierra();
		
		List<Topografia> lista = new ArrayList<Topografia>();
		List<Topografia> lista2 = new ArrayList<Topografia>();
		
		lista.add(agua);
		lista.add(tierra);
		lista.add(tierra);
		lista.add(agua);
		
		TopografiaMixta mixta= new TopografiaMixta((ArrayList<Topografia>) lista);
		
		
		lista2.add(agua);
		lista2.add(tierra);
		lista2.add(tierra);
		lista2.add(mixta);
		
		TopografiaAgua agua2 = new TopografiaAgua();
		TopografiaMixta mixta2= new TopografiaMixta(agua, tierra, agua, mixta);
		TopografiaMixta mixta3= new TopografiaMixta(agua, tierra, agua, mixta);
		TopografiaMixta mixta4= new TopografiaMixta(agua, mixta, agua, mixta2);
		TopografiaMixta mixta5= new TopografiaMixta(agua2, mixta, agua, mixta2);
		
		System.out.println(agua.getProporcionAgua());
		
		System.out.println(mixta.getProporcionAgua());
		
		System.out.println(mixta2.getProporcionAgua());
		
		System.out.println(mixta.getProporcionTierra());
		
		System.out.println(mixta2.getProporcionTierra());
		
		System.out.println(agua.equals(tierra));
		System.out.println(tierra.equals(agua));
		System.out.println(mixta.equals(mixta));
		System.out.println(mixta.equals(mixta2));
		System.out.println(mixta2.equals(mixta));
		System.out.println(mixta2.equals(mixta2));
		
			
		System.out.println(agua2.equals(agua));
		System.out.println(agua.equals(agua2));
		System.out.println(mixta3.equals(mixta4));
		System.out.println(mixta4.equals(mixta5));
		
		
	}

}
