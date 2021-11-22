import java.util.Scanner;

public class Tugas1
{
    public static void main (String args[])
    {
    	Scanner input = new Scanner(System.in);
    	int flag = 0;

    	System.out.print("Masukkan angka yang ingin dicari di array : ");
    	int n = input.nextInt();

        int[][] arrayOfInts = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 },
            { 622, 127, 77, 955 }
        };
        

        for (int i = 0; i < arrayOfInts.length; i++)
        {
            for (int j = 0; j < arrayOfInts[i].length; j++)
            {
                if (n == arrayOfInts[i][j]) {
                	flag = 0;
                	System.out.print(n+ " ditemukan pada "+i+", " +j);
                	System.exit(0);
                }else{
                	flag = 1;
                }
            }
        }
        if(flag == 1){
        	System.out.println(n+" tidak ditemukan dalam array");
        }


    }
}