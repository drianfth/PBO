public class Shape{
	public double length;
	public double widht;
	public double height;
	public double volume;


	public Shape(double length, double widht, double height){
		this.length = length;
		this.widht = widht;
		this.height = height;
	}

	public double compareTo(Shape shape){
		this.calculateVolume();
		if (shape.volume > volume)
			return shape.volume - volume;
		else 
			return volume - shape.volume;
	}

	private void calculateVolume(){
		volume = length * widht * height;

	}

	public void cetak(){
		this.calculateVolume();
		System.out.println("panjang x Lebar x Tinggi = "+length+" "+widht+ " "+height);
		System.out.println("volume = "+ volume);
	}
}