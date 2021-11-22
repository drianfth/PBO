public class Makanan extends Produk{
	public String nama = "Makanan";
	public int harga = 10000;
	public String tgl_produksi = "1 januari 2020";
	public String tgl_kadaluwarsa = "2 januari 2021";

	public void info(){
		System.out.println("class Makanan\nnama \t\t\t: " + nama);
		System.out.println("Harga \t\t\t: " + harga);
		System.out.println("tanggal produksi \t: " + tgl_produksi);
		System.out.println("tanggal kadaluwarsa \t: " + tgl_kadaluwarsa);

	}

}