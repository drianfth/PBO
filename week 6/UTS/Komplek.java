public class Komplek {
	private double real;
	private double imaginer;
	private double hasilReal;
	private double hasilImaginer;




	public Komplek(double real, double imaginer){
		this.real = real;
		this.imaginer = imaginer;
	}

	public void tambah(Komplek x){
		hasilReal = this.real + x.real;
		hasilImaginer = this.imaginer + x.imaginer;
	}

	public void kurang(Komplek x){
		hasilReal = this.real - x.real;
		hasilImaginer = this.imaginer - x.imaginer;
	}

	public double  getHasilReal(){
		return hasilReal;
	}

	public double  getHasilImag(){
		return hasilImaginer;
	}

	public double getReal(){
		return real;
	}

	public double getImag(){
		return imaginer;
	}

}