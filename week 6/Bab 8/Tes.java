public class Tes{
	public static void main(String args[]){

		System.out.println("======= Class Buku =======");

		Buku novel = new Buku("Laskar Pelangi",2005,529);
		novel.setPengarang("Andrea Hirata");
		novel.infoBuku();
		System.out.println("getPengarang = "+novel.getPengarang());

		System.out.println("\n======= Class Film =======");
		Film video = new Film("Avengers: Endgame",2019);
		video.setImdb(8);
		video.infoFilm();
		System.out.println("getPengarang = "+video.getImdb());

		System.out.println("\n======= Class Mahasiswa =======");
		Mahasiswa mhs = new Mahasiswa("Mummad Andrian Fathulloh",31205020);
		mhs.setJurusan("Teknik Informatika");
		mhs.infoMahasiswa();
		System.out.println("getJurusa = "+mhs.getJurusan());


	}
}