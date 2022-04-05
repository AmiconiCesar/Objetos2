package ar.edu.unlp.info.oo2.ejercicio1p2_Topografias;

public abstract class Topografia {

		
	abstract public double getProporcionAgua();
	
	public double getProporcionTierra() {
		 return (1 - this.getProporcionAgua());
	}
	
	public boolean equals(Object o) {
		if ((o instanceof Topografia) && !(o instanceof TopografiaMixta)){
			Topografia topo = (Topografia) o;
			return (this.getProporcionAgua()==topo.getProporcionAgua());
		}			
		return false;
	}
}
