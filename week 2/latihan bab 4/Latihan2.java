public class Latihan2 {
	static int volume(int i){
		return i*i*i;
	}
	public static void main (String args[]){
		int a = 2,b = 3, c = 5;
		System.out.println("Input\t|\tOutput");
		System.out.println("----------------------");
		System.out.println(a +"\t|\t" + volume(a));
		System.out.println(b +"\t|\t" + volume(b));
		System.out.println(c +"\t|\t" + volume(c));

	}
}