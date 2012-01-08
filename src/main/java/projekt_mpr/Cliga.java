package projekt_mpr;

import java.util.HashSet;
import java.util.Set;

public class Cliga {
	
	private Epoziom poziom;
	private String kraj;
	private Set<Cdruzyna> druzyny;
	
	//***************************  konstruktory ****************************************
	
	public Cliga (Epoziom poziom, String kraj){
		this.setPoziom(poziom);
		this.setKraj(kraj);
		this.druzyny= new HashSet<Cdruzyna>();

	}

	public Cliga (){		
		this.setKraj("");
		this.setPoziom(null);	
		this.druzyny= new HashSet<Cdruzyna>();
	}

	// **************************** metody *******************************************
	
	public Epoziom getPoziom() {
		return poziom;
	}

	public void setPoziom(Epoziom poziom) {
		this.poziom = poziom;
	}

	public String getKraj() {
		return kraj;
	}

	public void setKraj(String kraj) {
		this.kraj = kraj;
	}


	public String pokaz(){
		
		String out;
		out="Poziom: "+this.getPoziom()+"  Kraj:"+this.getKraj()+"\n";
		if (druzyny.size()==0) 
			out+="Brak druzyn w lidze!!!";
		else 
			for (Cdruzyna d: druzyny)
				
				out+="Druzyna: \n"+d.pokaz()+"\n";
		
		return out;
		
	}
	
	public int LiczbaDruzyn() {
		return this.druzyny.size();
	}

	public boolean dodajdruzyne(Cdruzyna d){
		
		return druzyny.add(d);	
		
	}
	
	public void usunwszyskiedruzyny(){
		
		druzyny.clear();
	}
	
	public void usundruzyne(Cdruzyna d){
		
		druzyny.remove((Object) d);
		
	}
}
