public class Truk {
	private double muatan;
	private double muatanmaks;

	public Truk(double beratmaks){
		this.muatanmaks = beratmaks;
	}

	public double getMuatan(){
		return muatan;
	}

	public double getMuatanMaks(){
		return muatanmaks;
	}

	public boolean tambahMuatan(double berat){
		if (muatanmaks>(muatan+berat)){
			muatan += berat;
			return true;
		}else{
			return false;
		}
	}

	public double newtsToKilo(double berat){
		return muatan / 9.8;
	}

	public double kiloToNewts(double berat){
		return muatan * 9.8;
	}

}