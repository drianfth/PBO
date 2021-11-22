public class Tes{
	public static void main(String args[]){
		Produk produk1 = new Makanan();
		produk1.info();

		System.out.println("================================");
		Produk produk = new Produk();
		Makanan makanan = new Makanan();
		TV tv = new TV();

		Pembeli people = new Pembeli();

		people.membeli(produk);
		System.out.println("================================");
		people.membeli(makanan);
		System.out.println("================================");
		people.membeli(tv);
	}
}