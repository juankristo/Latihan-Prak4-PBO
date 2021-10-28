class Mahasiswa {
	int nrp;
	String nama;
	
	void setNRP(int nrp){
		this.nrp = nrp;
	}
	
	
	void setNama(String nama){
		this.nama = nama;
	}
	
	int getNRP(){
		return this.nrp;
	}
	
	String getNama(){
		return this.nama;
	}
	
}


public class latihan4 {
	public static void main(String args[]) { 
		Mahasiswa mhs=new Mahasiswa(); 
		
	mhs.setNRP(7201);
	mhs.setNama("Muhammad Ali");

	System.out.println("Nama mahasiswa "+ mhs.getNama()+ " NRP " + mhs.getNRP());

	}
}