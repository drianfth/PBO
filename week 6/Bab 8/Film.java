public class Film{
	public String judul;
	public double imdb;
	public int thn_Rilis;

	public Film(String judul, int thn_Rilis){
		this.judul = judul;
		this.thn_Rilis = thn_Rilis;
	}

	public void setImdb(int imdb){
		this.imdb = imdb;
	}

	public double getImdb(){
		return imdb;
	}

	public void infoFilm(){
		System.out.println(judul+"\n\timdb \t\t: "+imdb+"\n\tTahun Rilis \t: "+thn_Rilis);
	}
}