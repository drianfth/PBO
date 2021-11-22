import java.util.Scanner;

public class Tugas4{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan String pertama : ");
		String str1 = input.nextLine();

		System.out.print("Masukkan String Kedua : ");
		String str2 = input.nextLine();

		String str3 = str1.substring(0,str1.indexOf(" ")) + str2.substring(str2.indexOf(" "), str2.length());
		String str4 = str2.substring(0,str2.indexOf(" ")) + str1.substring(str1.indexOf(" "), str1.length());

		System.out.println("String nama pertama : "+str3);
		System.out.println("String nama kedau : "+str4);




	}
}