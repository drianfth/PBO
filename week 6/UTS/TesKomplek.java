public class TesKomplek{
	public static void main(String args[]){
		Komplek bil1 = new Komplek(5,10);
		Komplek bil2 = new Komplek(2,4);

		bil1.tambah(bil2);
		// System.out.println(bil1.getReal());
		System.out.println("("+bil1.getReal()+" + "+bil1.getImag()+"i ) + ("+bil2.getReal()+" + "+bil2.getImag()+"i) = "+ bil1.getHasilReal()+" + "+ bil1.getHasilImag()+"i");
	}
}