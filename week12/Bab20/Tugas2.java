import java.util.*;

public class Tugas2 {
    public static void main(String[] args) {
        String[] nama = { "lala", "Azra", "Taufik", "Radit", "Fikri", "Haikal", "Bayu", "Ade", "Andrian", "aldo" };
        int i;
        String[] nrp = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        PriorityQueue<Mahasiswa> data = new PriorityQueue<Mahasiswa>(10, new Comparator<Mahasiswa>() {
            public int compare(Mahasiswa siswa, Mahasiswa siswa1) {
                int nilai = 0;
                if (siswa.getNilai() > siswa.getNilai()) {
                    nilai = 1;
                } else if (siswa.getNilai() == siswa.getNilai()) {
                    nilai = 0;
                } else {
                    nilai -= 1;
                }
                return nilai;
            }
        });
        Random siswa = new Random();
        for (i = 0; i < nama.length; i++) {
            data.add(new Mahasiswa(nama[i], nrp[i], siswa.nextInt(40) + 60));
        }
        System.out.println(data);
    }
}
