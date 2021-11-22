public class Truk {
	private double muatan=0;
	private double MuatanMaks;

	public Truk(double beratmaks){
		MuatanMaks = beratmaks;
	}
	public double getMuatan(){
		return muatan;
	}
	public double getMuatanMaks(){
		return MuatanMaks;
	}
	public void tambahMuatan(double berat){
		double temp;
		temp = muatan;
		muatan += berat;
		if (muatan > MuatanMaks){
			muatan = temp;
		}	
	}
}