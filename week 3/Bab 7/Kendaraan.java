public class Kendaraan {
	public String nama;
	public String jenis;
	public int cc;
	
	public Kendaraan(String i, String j, int c){
		nama = i;
		jenis = j;
		cc = c;
	}

	public void getInfo(){
		System.out.println("nama Kendaraan\t:"+ nama);
		System.out.println("Jenis\t:"+ jenis);
		System.out.println("jumlah cc\t:"+ cc+" cc");

	}
}