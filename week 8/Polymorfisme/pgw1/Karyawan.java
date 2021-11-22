public class Karyawan{
	public void bekerja(Pegawai pgw){
		if(pgw instanceof Manajer){
			Manajer manajer = (Manajer) pgw;
			manajer.info();
		}else if(pgw instanceof Kurir){
			Kurir kurir = (Kurir) pgw;
			kurir.info();
		}else{
			pgw.info();
		}
	}
}