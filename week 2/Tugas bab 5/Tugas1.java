import java.util.Scanner;

public class Tugas1{
	public static void main(String args[]){
		Scanner myNum = new Scanner(System.in);
		System.out.print("Masukkan berapa deret Fibonacci? ");

		int num = myNum.nextInt();
		System.out.print(num+" deret Fibonacci = ");

		int num0 = 0, num1 = 1, next;
		for (int i = 0; i <=num; i++){
			if(num0 != 0)
				System.out.print(num0 +" ");
			next = num0 + num1;
			num0 = num1;
			num1 =next;

		}
	}
}