public class Latihan2 {
	public static void main (String args[]){
		int i = 20;
		for (int j=1; j<=i; j++){
			if(j % 2 == 0 && j % 6 != 0){
				System.out.print(j +" ");
			}
		}
	}
}