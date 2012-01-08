package projekt_mpr;

public class Ctypdruzyny {
	
	Etypdruzyny typd; 
	
	
	Ctypdruzyny (Etypdruzyny typd){
		
		this.typd = typd;
		
	}
	
	public void ustawtypdruzyny(){
		
		switch (typd) {
		
		case Gosc: System.out.println(" Goœæ");
				break;
				
		case Gospodarz: System.out.println("Gospodarz");		
		
		}
		
		
		
	}
	

	Ctypdruzyny D1 = new Ctypdruzyny(typd);
	Ctypdruzyny D2 = new Ctypdruzyny(typd);
	

	
}
