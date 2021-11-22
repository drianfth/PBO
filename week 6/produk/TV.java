public class TV extends PerlengkapanElectro{
	public String type;
	public int ukuran_lyr;

	public TV(String nama, int harga,int konsumsi_daya){
		super(nama,harga,konsumsi_daya);	
	} 

	public void setType(String type){
		this.type = type;
	}

	public void setUkuran(int ukuran_lyr){
		this.ukuran_lyr = ukuran_lyr;
	}

	public void infoTV(){
		System.out.println("nama \t\t\t: " + super.nama);
		System.out.println("Harga \t\t\t: " + super.harga);
		System.out.println("konsumsi daya \t\t: " + super.konsumsi_daya);
		System.out.println("Type \t\t\t: " + type);
		System.out.println("ukuran layar \t\t: " + ukuran_lyr+" inci");

	}

}