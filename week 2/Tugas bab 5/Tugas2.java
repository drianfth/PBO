import java.util.Scanner;

public class Tugas2 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int bwh = 1900, ats = 2005;
		int year;
		char ans;
		do{
			System.out.print("Masukkan tahun (1900 - 2005) : ");
			year = input.nextInt();
			if ((year >= bwh) &&(year <= ats)){
			    if (year % 400 == 0) {
			      System.out.print(year + " Merupakan Tahun Kabisat\n");
			    } else if (year % 100 == 0) {
			      System.out.print(year + " Bukan Tahun Kabisat\n");
			    } else if (year % 4 == 0) {
			      System.out.print(year + " Merupakan Tahun Kabisat\n");
			    } else {
			      System.out.print(year + " Bukan Tahun Kabisat\n");
			    }

			}else if(year < bwh){
				System.out.println("maaf, tahun input dibawah 1900");
			}else{
				System.out.println("maaf tahun diatas "+ ats);
			}
			System.out.print("yes or no ? ");
			ans = input.next().charAt(0);
		}while((ans == 'y') || (ans == 'Y'));

	}
}
