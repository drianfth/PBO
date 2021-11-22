public class Mobil {
	public String merk;
	public String warna;
	public String jenis;
	public int cc;
	public int isiPenumpang;

	public Mobil(String m, String w, String j, int c, int i ){
		merk = m;
		warna = w;
		jenis = j;
		cc = c;
		isiPenumpang = i;
	}

	public void infoMobil(){
		System.out.println(merk + "\t|\t" + warna + "\t|\t" + jenis + "\t|\t" + cc + "\t|\t" + isiPenumpang+"\t|\t");
	}


}