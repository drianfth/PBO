import java.util.Scanner;
public class Tugas1
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int a, b;
        String str = "Politeknik Elektronika Negeri Surabaya";
        System.out.print("Masukkan karakter : ");
        char c = input.next().charAt(0);

        System.out.print("karakter '"+c+"' terletak pada index ");
        for (int i = -1; (i = str.indexOf(c, i + 1)) != -1; i++)
        {
            System.out.print(i +", ");
        }
        

    }
}