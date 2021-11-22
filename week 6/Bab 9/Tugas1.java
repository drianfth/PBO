public class Tugas1{
	public static void main (String args[]){
		Pegawai pgw = new Pegawai(20);
		Pegawai pgw1 = new Pegawai(30,"Andrian");

		System.out.println("Pegawai 1 nama : " + pgw.nama+"\n\tNip : "+pgw.nip);
		System.out.println("Pegawai 2 nama : " + pgw1.nama+"\n\tNip : "+pgw1.nip);

	}
}