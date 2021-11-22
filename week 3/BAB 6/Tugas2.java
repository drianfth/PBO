import java.util.Scanner;
public class Tugas2
{
    public static void main(String args[])
    {
    	Scanner input = new Scanner(System.in);
    	int sum = 0;
    	// char n = 'a';
        char [] matKul = {'p', 'e', 'm', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'n', 'b', 'e', 'r', 'b', 'a', 's', 'i', 's', 'o', 'b', 'y', 'e', 'k'};

        System.out.print("masukkan kata yang ingin dicari : ");
        char n = input.next().charAt(0);
        for (int i=0; i < matKul.length; i++){
        	if (n == matKul[i])
        		sum++;
        }
        System.out.print(sum);
    }
}