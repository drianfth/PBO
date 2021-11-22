public class Buku{
	public String judul;
	public int thn_Terbit;
	public String pengarang;
	public int jml_Halaman;

	public Buku(String judul, int thn_Terbit, int jml_Halaman){
		this.judul = judul;
		this.thn_Terbit = thn_Terbit;
		this.jml_Halaman = jml_Halaman;
	}

	public void setPengarang(String pengarang){
		this.pengarang = pengarang;
	}

	public void infoBuku(){
		System.out.println(judul+"\n\tpengarang \t: "+pengarang+"\n\ttahun Terbit \t: "+thn_Terbit+"\n\tJumlah \t\t: "+jml_Halaman+ " halaman");
	}

	public String getPengarang(){
		return pengarang;
	}


}