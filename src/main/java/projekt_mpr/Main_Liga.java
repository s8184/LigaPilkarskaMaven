package projekt_mpr;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.Date;

public class Main_Liga {

	public static void main(String[] args) {
	// ****************** deklarujemy i tworzymy obiekty klasy Calendar które bêd¹ parametrami konstruktora ojektu klasy C_zawodnik ****	
	
	Calendar c1 = new GregorianCalendar();
	Calendar c2 = new GregorianCalendar();
	c1.set(1974, Calendar.APRIL, 15);
	c2.set(2011, Calendar.NOVEMBER, 6);
	
	//************************ tworzymy obiekt klasy C_zawodnik ***************************************************************	
	Czawodnik z1 = new Czawodnik("Wojciech","Damer", c1 , c2, Epozzaw.bramkarz);
	
	Calendar c3 = new GregorianCalendar();
	Calendar c4 = new GregorianCalendar();
	c3.set(1984,Calendar.MAY,16);
	c4.set(2001,Calendar.DECEMBER,29);
	
	Czawodnik z2 = new Czawodnik("Andrzej","Lisowski", c3 , c4, Epozzaw.napastnik);
	
	Calendar c5 = new GregorianCalendar();
	Calendar c6 = new GregorianCalendar();
	c5.set(1979,Calendar.JANUARY,7);
	c6.set(2011,Calendar.JULY,15);
	
	Czawodnik z3 = new Czawodnik("Joanna","Damer", c5 , c6, Epozzaw.pomocnik );
	
	
	//**************** tworzymy dru¿ynê - obiekt klasy C_dru¿yna ***************************************************
	Cdruzyna d1 = new Cdruzyna();	
	d1.setMiasto("Gdañsk");   // nadajemy wartoœci jej sk³adowym
	d1.setNazwa("Lechia");
	Cstadion s1 = new Cstadion("Œledziarnia","Gdañsk",50000);
	d1.setStadion(s1);
	d1.dodajZawodnika(new Integer(1),z1);
	d1.dodajZawodnika(new Integer(13),z2);

	Cdruzyna d2 = new Cdruzyna();	
	d2.setMiasto("Gdynia");   // nadajemy wartoœci jej sk³adowym
	d2.setNazwa("Arka");
	Cstadion s2 = new Cstadion("Wêdzarnia","Gdynia",4000);
	d2.setStadion(s2);
	d2.dodajZawodnika(new Integer(99),z3);
	
	
	Cliga liga = new Cliga();
	liga.setKraj("polska");
	liga.setPoziom(Epoziom.Druga);
	liga.dodajdruzyne(d1);
	liga.dodajdruzyne(d2);
	System.out.println(liga.pokaz());
	liga.usundruzyne(d1);
	System.out.println(liga.pokaz());
	}

}
