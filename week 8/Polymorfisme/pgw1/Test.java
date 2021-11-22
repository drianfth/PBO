public class Test{
	public static void main(String args[]){
		Pegawai pegawai = new Pegawai();
		Kurir kurir = new Kurir();
		Manajer manajer = new Manajer();

		Karyawan orang = new Karyawan();
		orang.bekerja(pegawai);
		orang.bekerja(kurir);
		orang.bekerja(manajer);
	}
}