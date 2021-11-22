package perbankan;

public class Bank{
	private Nasabah[] nasabah;
	private int jumlahNasabah;

	public Bank(){
		this.jumlahNasabah = 0;
		this.nasabah = new Nasabah[25];
	}

	public void tambahNasabah(String namaAwal, String namaAkhir){
		this.nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
		jumlahNasabah++;
	}

	public int getJumlahNasabah(){
		return jumlahNasabah;
	}

	public Nasabah getNasabah(int indeks){
		return nasabah[indeks];
	}

}