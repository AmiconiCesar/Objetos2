package ar.edu.unlp.info.oo2.ejercicio1p2_Topografias;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixta extends Topografia {
	
	  private List<Topografia> componentes = new ArrayList<>();
	
	  
	  @SuppressWarnings("unchecked")
	public TopografiaMixta(ArrayList<Topografia> componentes) {
		  if (componentes.size()==4) {
			    this.componentes = (List<Topografia>) componentes.clone();
		  	}
	    }
	  
	public TopografiaMixta(Topografia topografia1, Topografia topografia2, Topografia topografia3, 
			Topografia topografia4) {
		
			this.componentes.add(topografia1);
			this.componentes.add(topografia2);
			this.componentes.add(topografia3);
			this.componentes.add(topografia4);
			}
	  

	@Override
	public double getProporcionAgua() {
		 
		return (this.componentes.stream().mapToDouble(topografia -> topografia.getProporcionAgua()).sum()) / 4;
	}
	
	public boolean equals(Object o) {
		if (o instanceof TopografiaMixta ) {
			TopografiaMixta mixta2 = (TopografiaMixta) o; 
			return (this.componentes.equals(mixta2.getComponentes()));
			}
				
		return false;
	}

	public List<Topografia> getComponentes() {
		return componentes;
	}

}
