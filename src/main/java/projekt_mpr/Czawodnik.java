package projekt_mpr;

import java.util.Calendar;


public class Czawodnik {

//***************** lista zmiennych klasy ****************************************	
	
	private String Imie;
	private String Nazwisko;
	private Calendar DataUrodzenia;
	private Calendar DataPozyskania;
	private Epozzaw Pozycjazaw;

//****************** konstruktor niesparametryzowany *******************************	
	
		public Czawodnik(){
			this.setPozycjazaw(Epozzaw.obronca);
		
		}
		
// ***************** konstruktor sparametryzowany ************************************		
		
		public Czawodnik(String Imie, String Nazwisko, Calendar DataUrodzenia, Calendar DataPozyskania , Epozzaw Pozycjazaw){
			
			this.setImie(Imie);
			this.setNazwisko(Nazwisko);
			this.setDataUrodzenia(DataUrodzenia);
			this.setDataPozyskania(DataPozyskania);
			this.setPozycjazaw(Pozycjazaw);
		}
//*********************** Get i Set dla Imiê **********************************************************
		public String getImie() {
			return Imie;
		}

		public void setImie(String imie) {
			Imie = imie;
		}
//***********************Get i Set dla Nazwisko ***********************************************************
		public String getNazwisko() {
			return Nazwisko;
		}

		public void setNazwisko(String nazwisko) {
			Nazwisko = nazwisko;
		}
//*********************** Get i Set dla Data urodzenia***********************************************************		
		public Calendar getDataUrodzenia() {
			return DataUrodzenia;
		}

		public void setDataUrodzenia(Calendar dataUrodzenia) {
			DataUrodzenia = dataUrodzenia;
		}
//*********************** Get i Set dla Data pozyskania ************************************************************
		public Calendar getDataPozyskania() {		
			return DataPozyskania;
		}

		public void setDataPozyskania(Calendar dataPozyskania) {
			DataPozyskania = dataPozyskania;
		}
//************************** Metoda wyœwietlaj¹ca dane obiektu zawodnik *********************************************************		
		public String pokaz(){
			String d1,d2;
			Calendar c1,c2;
			String out="";
			c1 = this.getDataUrodzenia();
			c2 = this.getDataPozyskania();
			d1 = c1.get(Calendar.YEAR)+"/"+(c1.get(Calendar.MONTH)+1)+"/"+c1.get(Calendar.DAY_OF_MONTH);
			d2 = c2.get(Calendar.YEAR)+"/"+(c2.get(Calendar.MONTH)+1)+"/"+c2.get(Calendar.DAY_OF_MONTH);
			
			out=this.getImie() + " " + this.getNazwisko()+ " " + this.getPozycjazaw()+ " " + d1 + " " + d2;
			return out;
		}

		public long czaswdruzynie(){
			
			long out=0;
			long dni=0;
			Calendar c=this.getDataPozyskania();
			
			Calendar dataobec = Calendar.getInstance();
			
			dni = dataobec.getTimeInMillis() - c.getTimeInMillis();
			out = dni/1000/60/60/24;
			return out;
			
			
		}

		public Epozzaw getPozycjazaw() {
			return Pozycjazaw;
		}

		public void setPozycjazaw(Epozzaw pozycjazaw) {
			Pozycjazaw = pozycjazaw;
		}

}
