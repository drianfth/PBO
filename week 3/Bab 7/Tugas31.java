import java.util.Scanner;

import javax.lang.model.element.Element;

public class Tugas31{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String kalimat = scan.nextLine();
        int panjang = kalimat.length()-1;
        int i;
        char awal = kalimat.charAt(0);
        char akhir = kalimat.charAt(panjang);
        for(i=0;i<=panjang;i++){
            if(kalimat.charAt(i)==awal){
                System.out.print(akhir);
            }
            else if(kalimat.charAt(i)==akhir){
                System.out.print(awal);
            }
            else{
                System.out.print(kalimat.charAt(i));
            }
        }
    }
}