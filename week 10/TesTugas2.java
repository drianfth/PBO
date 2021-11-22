public class TesTugas2{
	public static void main(String args[]){
		Katak O1 = new Katak(5,"Froggy");
		Kecebong O2 = new Kecebong(2,"Junior Frog",10);

		System.out.println("_________________________________________________");
		System.out.println("objek : O1");
		System.out.println("\tNama : "+ O1.nama);
		System.out.println("\tUmur : "+ O1.umur);
		System.out.println("\tPanjang Ekor : -");
		System.out.println("\tCara Bergerak : "+ O1.caraBergerak());
		System.out.println("_________________________________________________");

		System.out.println("objek : O2");
		System.out.println("\tNama : "+ O2.nama);
		System.out.println("\tUmur : "+ O2.umur);
		System.out.println("\tPanjang Ekor : "+ O2.panjangEkor);
		System.out.println("\tCara Bergerak : "+ O2.caraBergerak());


	}
}