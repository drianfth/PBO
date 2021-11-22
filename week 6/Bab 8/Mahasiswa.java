public class Mahasiswa{
	public String nama;
	public long Nrp;
	public String jurusan;

	public Mahasiswa(String nama, long Nrp){
		this.nama = nama;
		this.Nrp = Nrp;
	}

	public void setJurusan(String jurusan){
		this.jurusan = jurusan;
	}

	public String getJurusan(){
		return jurusan;
	}

	public void infoMahasiswa(){
		System.out.println(nama+"\n\tJurusan : "+jurusan+"\n\tNrp \t: "+Nrp);
	}
}