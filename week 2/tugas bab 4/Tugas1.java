public class Tugas1 {
	static double volumeBola(double r){
		double phi = 3.14;
		double result;
		result = (4* phi * Math.pow(r,3))/3;
		return result;
	}

	public static void main (String args[]){
		double a = 2,b = 4;
		System.out.println("Input\t|\tOutput");
		System.out.println("----------------------");
		System.out.println(a +"\t|\t" + volumeBola(a));
		System.out.println(b +"\t|\t" + volumeBola(b));

	}
}