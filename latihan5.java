class acaraTV {
	String StasiunTV; 
	String Acara;

	public String getStasiunTV() { 
		return StasiunTV;
	}

	public void setStasiunTV(String StasiunTV)
		{ this.StasiunTV=StasiunTV;
	}

	public String getAcara() { 
		return Acara; }

	public void setAcara(String Acara) { 
		this.Acara=Acara;
	}

	public void cetak() {
		System.out.println("Acara "+Acara+"Stasiun TV "+StasiunTV);
		}
	}

	public class latihan5 {
		public static void main(String args[])
			{ acaraTV a=new acaraTV();

			a.StasiunTV="TransTV"; 
			a.Acara="Mozaik Islam"; 
			a.cetak();
	}
}

