package projekt_mpr;

public class Cbramka {
	
	private int czas_zdobycia;
	private Esposzdob sposob_zdobycia;
	private Eokolzdob okolicznosc_zdobycia;
	private Etypdruzyny zdobywca;
	private Czawodnik z;
	
	
	public Cbramka (int czas_zdobycia,Esposzdob sposob_zdobycia, Eokolzdob okolicznosc_zdobycia,
					Etypdruzyny zdobywca, Czawodnik z){
		
		this.z=new Czawodnik();
		this.setZ(z);
		this.setCzas_zdobycia(czas_zdobycia);
		this.setOkolicznosc_zdobycia(okolicznosc_zdobycia);
		this.setSposob_zdobycia(sposob_zdobycia);
	}
	
	public Cbramka(){
	
		Czawodnik z=new Czawodnik();
		
		
	}

	public int getCzas_zdobycia() {
		return czas_zdobycia;
	}

	public void setCzas_zdobycia(int czas_zdobycia) {
		this.czas_zdobycia = czas_zdobycia;
	}

	public Czawodnik getZ() {
		return z;
	}

	public void setZ(Czawodnik z) {
		this.z = z;
	}

	public Etypdruzyny getZdobywca() {
		return zdobywca;
	}

	public void setZdobywca(Etypdruzyny zdobywca) {
		this.zdobywca = zdobywca;
	}

	public Eokolzdob getOkolicznosc_zdobycia() {
		return okolicznosc_zdobycia;
	}

	public void setOkolicznosc_zdobycia(Eokolzdob okolicznosc_zdobycia) {
		this.okolicznosc_zdobycia = okolicznosc_zdobycia;
	}

	public Esposzdob getSposob_zdobycia() {
		return sposob_zdobycia;
	}

	public void setSposob_zdobycia(Esposzdob sposob_zdobycia) {
		this.sposob_zdobycia = sposob_zdobycia;
	}

	public void info(){
		String dr="";
		if (this.getZdobywca()==Etypdruzyny.Gosc)
			dr="goœci";
		else
			dr="gospodarzy";
		System.out.println("Zdobyto bramkê dla "+dr+"! Zawodnik=");
		this.getZ().pokaz();
	}
}

