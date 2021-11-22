public class Makanan extends Produk{
	public String tgl_produksi;
	public String tgl_kadaluwarsa;

	public Makanan(String nama,int harga, String tgl_produksi){
		super(nama,harga);
		this.tgl_produksi = tgl_produksi;
	}

	public void setTglkadlwrsa(String tgl_kadaluwarsa){
		this.tgl_kadaluwarsa = tgl_kadaluwarsa;
	}

	public void infoMakanan(){
		System.out.println("nama \t\t\t: " + super.nama);
		System.out.println("Harga \t\t\t: " + super.harga);
		System.out.println("tanggal produksi \t: " + tgl_produksi);
		System.out.println("tanggal kadaluwarsa \t: " + tgl_kadaluwarsa);

	}

}