import java.util.Scanner;

public class Tugas5{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan kalimat Utama : ");
		String str1 = input.nextLine();

		System.out.print("String yang diganti : ");
		String str2 = input.nextLine();

		System.out.print("String Pengganti : ");
		String str3 = input.nextLine();

		str1 = str1.replace(str2, str3);
		System.out.print("kalimat utama menjadi : " + str1);


	}
}