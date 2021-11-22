import pgw.Manajer;
import pgw.Pegawai;
import pgw.Programmer;

public class TesPegawai {
	public static void main(String args[]) {
		Pegawai pegawai1 = new Pegawai("Denas", 10000);
		Programmer programer1 = new Programmer("Denas", 3000, 4000);
		Manajer manajer1 = new Manajer("Denas", 1000, 2000);

		pegawai1.tampilData();
		programer1.tampilData();
		manajer1.tampilData();
	}
}
