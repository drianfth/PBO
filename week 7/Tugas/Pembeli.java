public class Pembeli{
	public void membeli(Produk produk){
		if (produk instanceof Makanan){
			Makanan makanan = (Makanan) produk;
			makanan.info();
		} else if (produk instanceof TV){
			TV tv = (TV) produk;
			tv.info();
		} else{
			produk.info();
		}
	}
}