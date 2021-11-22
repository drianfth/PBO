public class PerlengkapanElectro extends Produk{
	public int konsumsi_daya;

	public PerlengkapanElectro(String nama,int harga, int konsumsi_daya){
		super(nama,harga);
		this.konsumsi_daya = konsumsi_daya;
	}

}