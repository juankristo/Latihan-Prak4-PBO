class buku {
	String pengarang;
	String judul;
}

public class latihan3
{
	public static void main(String args[])
	{  
	buku a=new buku();
	buku b=new buku();

	a.pengarang="Felix Siauw"; 
	a.judul="Beyond The Inspiration"; 
	b.pengarang="Budi Raharjo";
	b.judul="Mudah Belajar Java"; 
	
	System.out.println("Judul: "+a.judul+" pengarang: " + a.pengarang);
	System.out.println("Judul: "+b.judul+" pengarang: " + b.pengarang);
	
	}
}