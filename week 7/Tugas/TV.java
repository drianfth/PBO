public class TV extends Produk{
	public String nama = "TV";
	public int harga = 600000;
	public String type = "Tabung";
	public int ukuran_lyr = 8;

	public void info(){
		System.out.println("nama \t\t\t: " + nama);
		System.out.println("Harga \t\t\t: " + harga);
		System.out.println("Type \t\t\t: " + type);
		System.out.println("ukuran layar \t\t: " + ukuran_lyr+" inci");

	}


}