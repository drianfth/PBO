import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
         int jamAwal;
         int menitAwal;
         int jamAkhir;
         int menitAkhir;

         Scanner in = new Scanner(System.in);
         System.out.print("Msukkan Jam Awal : ");
         jamAwal = in.nextInt();
         System.out.print("Msukkan Menit Awal : ");
         menitAwal = in.nextInt();
         System.out.print("Msukkan Jam Akhir : ");
         jamAkhir = in.nextInt();
         System.out.print("Msukkan Menit Akhir : ");
         menitAkhir = in.nextInt();
         menitAwal = menitAwal + (jamAwal * 60);
         menitAkhir = menitAkhir + (jamAkhir * 60);


         System.out.print("Jaraknya adalah : ");
         System.out.print(menitAkhir - menitAwal);
         System.out.print(" Menit");
    }
} 
