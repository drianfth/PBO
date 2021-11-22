public class Produk{
	protected String nama;
	protected int harga;

	public Produk(String nama, int harga){
		this.nama = nama;
		this.harga = harga;
	}

	public void cetak(){
		System.out.println("nama : " + nama + "\nHarga : "+ harga);
	}
}