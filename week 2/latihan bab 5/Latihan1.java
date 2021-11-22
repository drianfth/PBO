public class Latihan1{
	static int faktorial(int num){
		int result = 1;
		if (num == 1 || num == 0)
			return 1;
		else{
			for (int i = 1; i <= num; i++){
				result *= i;
			}
			return result;
		}
	}

	public static void main (String args[]){
		int i = 7;
		System.out.println("n \tn!");
		System.out.println("_____________\n");
		for (int j = 1; j<=7; j++){
			System.out.println(j+"!\t"+faktorial(j));	
		}
		System.out.println("_____________");

	}
}