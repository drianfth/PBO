public class Tugas3
{
    public static void main(String args[])
    {
        String str = "Amanda Ace";
        String kal = new String();
        String start = str.substring(0,1);
        String end = str.substring(str.length() - 1);

        // System.out.println(start);
        // System.out.println(end);

        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            String str1 = Character.toString(c);
            // System.out.println(str1 + " ");

            if (str1.equalsIgnoreCase(start))
            	// System.out.println("ok");
                str = str.replace(start,end);
            else if(str1.equalsIgnoreCase(end))
            	// System.out.println("ok?");
                str = str.replace(end,start);
            // else
            	// System.out.println("eror");
            // else
            // 	kal += str1;
        }
        System.out.println(str);

    }
}

// import java.util.Scanner;
// public class Tugas3
// {
//     public static void main(String[] args)
//     {
//         Scanner scan = new Scanner(System.in);
//         int i = 0;
//         System.out.print("Masukkan kalimat: ");
//         String kal = scan.nextLine(), a = kal.substring(0, 1);
//         kal = kal.replaceAll(Character.toString(kal.charAt(0)),
//                              Character.toString(kal.charAt(kal.length() - 1)));
//         kal = kal.substring(0, kal.length() - 1) + a;
//         System.out.println(kal);
//     }
// }