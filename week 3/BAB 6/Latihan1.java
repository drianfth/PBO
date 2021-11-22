import java.text.NumberFormat;

public class Latihan1
{
    public static void main (String args[])
    {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);

        int nilai[][] = new int[4][3];
        nilai[0][0] = 81;
        nilai[0][1] = 90;
        nilai[0][2] = 62;
        nilai[1][0] = 50;
        nilai[1][1] = 83;
        nilai[1][2] = 87;
        nilai[2][0] = 89;
        nilai[2][1] = 55;
        nilai[2][2] = 65;
        nilai[3][0] = 77;
        nilai[3][1] = 70;
        nilai[3][2] = 92;

        String Mk[] = {"PBO", "RPL"};
        double avg[] = new double[nilai.length];


        for (int i = 0; i < nilai.length; i++)
        {
            for (int j = 0; j < nilai[i].length; j++)
            {
                avg[i] += nilai[i][j];
            }
            avg[i] /= nilai[0].length;
        }


        System.out.println("NRP\tRata-rata");
        System.out.println("________________");
        for (int i = 0; i < nilai.length; i++)
        {
            System.out.println((i + 1) + "\t" + nf.format(avg[i]));

        }



    }
}