public class TesMobil {
	public static void main (String args[]){
		Mobil mobil1 = new Mobil("Toyota","Biru","Minibus",2000,7);
		Mobil mobil2 = new Mobil("Dihatsu","Hitam","pick up",1500,2);
		Mobil mobil3 = new Mobil("Suzuki","Silver","Suv",1800,5);
		Mobil mobil4 = new Mobil("Honda","Merah","Sedan",1300,5);


		System.out.println("Merk\t|\tWarna\t|\tJenis\t|\tCC\t| Jumlah Penumpang");
		System.out.println("-------------------------------------------------------------------------");
		mobil1.infoMobil();
		mobil2.infoMobil();
		mobil3.infoMobil();
		mobil4.infoMobil();


	}
}