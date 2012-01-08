package projekt_mpr;

public class Cstadion {
	
	private String nazwa;
	private String miasto;
	private int pojemnosc;
	
//************************************** konstruktory ***************************************************************
	
	public Cstadion ( String nazwa, String miasto , int pojemnosc){
		
		this.setNazwa(nazwa);
		this.setMiasto(miasto);
		this.setPojemnosc(pojemnosc);
		
	}

	public Cstadion(){
		
		this.setMiasto("");
		this.setNazwa("");
		this.setPojemnosc(0);
	}
	
	
//********************************* metody ****************************************************	
	
	public boolean equals(Object obj){
		boolean out = false;			// porównanie dwóch objektów tej klasy ze sob¹
		if ( this == obj ) out = true;
		
		if (obj instanceof Cstadion ) {
			
			Cstadion stad = (Cstadion)obj;
			
			if (this.getPojemnosc()==stad.getPojemnosc()) out=true;
			    else out=false;
			
		}else out = false;
		
		return out;
	}
	
	
	public String pokaz(){
		String out = "";
		//out="Stadion :"+this.getNazwa()+" znajduj¹cy sie w "+this.getMiasto()+" o pojemnoœci "+this.getPojemnosc();
		out=this.getNazwa()+" znajduj¹cy sie w "+this.getMiasto()+" o pojemnoœci "+this.getPojemnosc();
		return out;
		
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public int getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(int pojemnosc) {
		this.pojemnosc = pojemnosc;
	}
	
}
