public class Lampu extends PerlengkapanElectro{
	public String warna_chy;

	public Lampu(String nama, int harga,int konsumsi_daya){
		super(nama,harga,konsumsi_daya);
	}

	public void setWarna(String warna_chy){
		this.warna_chy = warna_chy;
	}

	public void infoLampu(){
		System.out.println("nama \t\t\t: " + super.nama);
		System.out.println("Harga \t\t\t: " + super.harga);
		System.out.println("konsumsi daya \t\t: " + super.konsumsi_daya);
		System.out.println("warna cahaya \t\t: " + warna_chy);

	}

}