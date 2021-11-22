import java.util.*;

public class Latihan1 {
    public static void main(String[] args) {
        int i;
        Set A = new HashSet();
        Set min = new HashSet();
        Set irisan = new HashSet();
        Set gabungan = new HashSet();
        Set bagian = new HashSet();
        for (i = 1; i <= 5; i++) {
            A.add(i);
            min.add(i);
            irisan.add(i);
            gabungan.add(i);
            bagian.add(i);
        }
        Set B = new HashSet();
        for (i = 5; i <= 10; i++) {
            B.add(i);
        }
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        min.removeAll(B);
        System.out.println("A - B = " + min);
        irisan.retainAll(B);
        System.out.println("A n B = " + irisan);
        gabungan.addAll(B);
        System.out.println("A U B = " + gabungan);
        bagian.containsAll(B);
        System.out.println("A C B = " + bagian);
    }
}