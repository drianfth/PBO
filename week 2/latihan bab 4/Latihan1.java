public class Latihan1 {

	public static String cek(int i){
		if (i%2==0)
			return "Genap";
		else
			return "Ganjil";
	}

	public static void main (String args[]){
		int a = 3,b = 5, c = 6, d = 8;
		System.out.println("Input\t|\tOutput");
		System.out.println("----------------------");
		System.out.println(a +"\t|\t" + cek(a));
		System.out.println(b +"\t|\t" + cek(b));
		System.out.println(c +"\t|\t" + cek(c));
		System.out.println(d +"\t|\t" + cek(d));

	}

}