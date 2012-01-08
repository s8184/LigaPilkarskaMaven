package projekt_mpr;

import java.util.Calendar;

public class Cmecz {

	private Calendar datarozegrania;
	private Cdruzyna D1;
	private Cdruzyna D2;
		
	public Cmecz(){
			
	}

	public Calendar getDatarozegrania() {
		return datarozegrania;
	}

	public void setDatarozegrania(Calendar datarozegrania) {
		this.datarozegrania = datarozegrania;
	}

	public Cdruzyna getD1() {
		return D1;
	}

	public void setD1(Cdruzyna d1) {
		D1 = d1;
	}

	public Cdruzyna getD2() {
		return D2;
	}

	public void setD2(Cdruzyna d2) {
		D2 = d2;
	}

}
