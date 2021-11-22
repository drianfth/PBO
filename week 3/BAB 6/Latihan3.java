import java.util.Scanner;

public class Latihan3
{
    public static boolean isPrima(int n)
    {
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i)
        {
            if (n % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
            return false;
    }
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan ? ");
        int n = input.nextInt();

        if (isPrima(n)){
          System.out.println(n+" adalah bilangan Prima");
        }else{
          System.out.println(n+" bukan bilangan Prima");
        }
    }
}