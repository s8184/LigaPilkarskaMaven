package projekt_mpr;

import java.util.Calendar;
import java.util.GregorianCalendar;

import junit.framework.TestCase;

public class CligaTest extends TestCase {

	public void testLiczbaDruzyn() {
			
		Calendar c1 = new GregorianCalendar();
		Calendar c2 = new GregorianCalendar();
		c1.set(1974, Calendar.APRIL, 15);
		c2.set(2011, Calendar.NOVEMBER, 1);
		
		Czawodnik z1 = new Czawodnik("Wojciech","Damer", c1 , c2, Epozzaw.bramkarz);	
		
		Calendar c3 = new GregorianCalendar();
		Calendar c4 = new GregorianCalendar();
		c3.set(1984,Calendar.MAY,16);
		c4.set(1984,Calendar.MAY,29);
		
		Czawodnik z2 = new Czawodnik("Andrzej","Lisowski", c3 , c4, Epozzaw.napastnik);
		
		Calendar c5 = new GregorianCalendar();
		Calendar c6 = new GregorianCalendar();
		c5.set(1979,Calendar.MAY,7);
		c6.set(1979,Calendar.AUGUST,15);
		
		Czawodnik z3 = new Czawodnik("Joanna","Damer", c5 , c6, Epozzaw.pomocnik );
		
		Calendar c7 = new GregorianCalendar();
		Calendar c8 = new GregorianCalendar();
		c7.set(1971, Calendar.JUNE, 13);
		c8.set(2010, Calendar.NOVEMBER, 1);
		
		Czawodnik z4 = new Czawodnik("Krzysztof","Janiszewski", c7 , c8, Epozzaw.obronca);
		
		Calendar c9 = new GregorianCalendar();
		Calendar c10 = new GregorianCalendar();
		c9.set(1977, Calendar.FEBRUARY, 5);
		c10.set(1998, Calendar.MAY, 7);
		
		Czawodnik z5 = new Czawodnik("Piotr","�liwka", c9 , c10, Epozzaw.pomocnik);
		
		Calendar c11 = new GregorianCalendar();
		Calendar c12 = new GregorianCalendar();
		c11.set(1980, Calendar.JUNE, 20);
		c12.set(2011, Calendar.MARCH, 15);
		
		Czawodnik z6 = new Czawodnik("Arkadiusz","Lawicki", c11 , c12, Epozzaw.pomocnik);
		
		Cdruzyna d1 = new Cdruzyna();	
		d1.setMiasto("Gda�sk"); 
		d1.setNazwa("Lechia");
		Cstadion s1 = new Cstadion("�ledziarnia","Gda�sk",50000);
		d1.setStadion(s1);
		d1.dodajZawodnika(new Integer(1),z1);
		d1.dodajZawodnika(new Integer(13),z2);

		Cdruzyna d2 = new Cdruzyna();	
		d2.setMiasto("Gdynia");   
		d2.setNazwa("Arka");
		Cstadion s2 = new Cstadion("W�dzarnia","Gdynia",4000);
		d2.setStadion(s2);
		d2.dodajZawodnika(new Integer(99),z3);
		
		Cdruzyna d3 = new Cdruzyna();	
		d3.setMiasto("Gdynia");   
		d3.setNazwa("Ba�tyk");
		Cstadion s3 = new Cstadion("Wemblay","Gdynia",42000);
		d3.setStadion(s3);
		d3.dodajZawodnika(new Integer(22),z4);
		d3.dodajZawodnika(new Integer(23),z5);
		
		Cliga liga1 = new Cliga();
		liga1.setKraj("polska");
		liga1.setPoziom(Epoziom.Extraklasa);
		liga1.dodajdruzyne(d1);
		liga1.dodajdruzyne(d2);
		
		Cliga liga2 = new Cliga();
		liga2.setKraj("polska");
		liga2.setPoziom(Epoziom.Druga);
		
		liga2.dodajdruzyne(d3);
		
		fail("Not yet implemented");
		TestCase.assertTrue(liga1.LiczbaDruzyn()==2);
		TestCase.assertTrue(liga2.LiczbaDruzyn()==1);
	}

}
