public class Tes{
	public static void main(String args[]){

		System.out.println("======================= Makanan =============================");
		Makanan makanan1 = new Makanan("Beng Beng", 2500,"1 januari 2020");
		makanan1.setTglkadlwrsa("2 januari 2021");
		makanan1.infoMakanan();

		System.out.println("\n======================= Lampu ==============================");
		Lampu lmpu = new Lampu("Lampu LED Philips panjang",58000,100);
		lmpu.setWarna("Putih");
		lmpu.infoLampu();

		System.out.println("\n======================= TV =================================");
		TV tivi = new TV("Sony",293000000,68);
		tivi.setType("LED");
		tivi.setUkuran(32);
		tivi.infoTV();

	}
}