import java.util.*;

public class latihan3 {
    public static void main(String[] args) {
        List data = new ArrayList();
        data.add(new Mahasiswa("1", "haikal"));
        data.add(new Mahasiswa("2", "lala"));
        data.add(new Mahasiswa("3", "dani"));
        data.add(new Mahasiswa("4", "hana"));
        data.add(new Mahasiswa("5", "arif"));

        class MahasiswaComparator implements Comparator<Mahasiswa> {
            public int compare(Mahasiswa satu, Mahasiswa dua) {
                return satu.getNrp().compareTo(dua.getNrp());
            }
        }
        System.out.println("Data : " + data);
        Collections.reverse(data);
        System.out.println("Data (terbalik) : " + data);
        Collections.shuffle(data);
        System.out.println("Data (acak) : " + data);
        Collections.sort(data, new MahasiswaComparator());
        System.out.println("Data (urut) :" + data);
    }
}