import java.util.Scanner;

public class Latihan2
{
    static int fib(int n)
    {
        int f[] = new int[n + 2];
        int i;
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++)
        {

            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret Fibonacci : ");
        int N = input.nextInt(); 

        for (int i = 0; i < N; i++)
            System.out.print(fib(i) + " ");
    }
}
